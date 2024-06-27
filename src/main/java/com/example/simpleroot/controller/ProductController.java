package com.example.simpleroot.controller;


import com.example.simpleroot.dto.ProductDTO;

import com.example.simpleroot.repo.ProductRepo;

import com.example.simpleroot.service.ProductService;
  import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping(value = "api/v1/product")
@CrossOrigin
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping("/getproducts")
    public List<ProductDTO> getUser() {
        return productService.getAllProducts();
    }


    @PostMapping("/saveProduct")
    public ProductDTO saveProduct(@RequestBody ProductDTO productDTO) {
        return productService.save(productDTO);
    }

    @PutMapping("/updateProduct")
    public ProductDTO updateProduct(@RequestBody ProductDTO productDTO) {
        return productService.updateProduct(productDTO);
    }

    @DeleteMapping("/deleteProduct")
    public boolean deleteProduct(@RequestBody ProductDTO productDTO) {
        return productService.deleteProduct(productDTO);
    }

//    @GetMapping("/getProductByProductId/{productID}")
//    public ProductDTO getProductByProductID(@PathVariable String  productID){
//        return productService.getProductByProductID(productID);
//    }


//    @GetMapping("/getUserByUserIDAndAddress/{userID}/{address}")
//    public ProductDTO getUserByUserIDAndAddress(@PathVariable String userID ,@PathVariable String address){
//        System.out.println("User ID :"+ userID +"User address :" +address);
//        return userService.getUserByUserIDAndAddress(userID,address);
//    }



}
