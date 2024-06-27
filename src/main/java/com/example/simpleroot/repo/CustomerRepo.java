package com.example.simpleroot.repo;

import com.example.simpleroot.entity.Customer;
import org.springframework.data.repository.CrudRepository;

public interface CustomerRepo extends CrudRepository<Customer, Integer> {
}
