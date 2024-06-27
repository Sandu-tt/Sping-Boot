package com.example.simpleroot.repo;

import com.example.simpleroot.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepo  extends JpaRepository<Product,Integer> {

}
