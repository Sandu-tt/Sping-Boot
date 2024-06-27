package com.example.simpleroot.service;

import com.example.simpleroot.dto.ProductDTO;
import com.example.simpleroot.dto.UserDTO;
import com.example.simpleroot.entity.Product;

import com.example.simpleroot.entity.User;
import com.example.simpleroot.repo.ProductRepo;

import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class ProductService {


    @Autowired
    private ProductRepo productRepo;

    @Autowired
    private ModelMapper modelMapper;



    public  ProductDTO save(ProductDTO productDTO) {
        productRepo.save(modelMapper.map(productDTO, Product.class));
        return productDTO;
    }
    public List<ProductDTO> getAllProducts(){
        List<Product>productList=productRepo.findAll();
        return modelMapper.map(productList,new TypeToken<List<UserDTO>>(){}.getType());
    }
    public ProductDTO updateProduct(ProductDTO productDTO){
        productRepo.save(modelMapper.map(productDTO,Product.class));
        return productDTO;
    }
    public boolean deleteProduct(ProductDTO productDTO){
        productRepo.delete(modelMapper.map(productDTO,Product.class));
        return true;
    }

}
