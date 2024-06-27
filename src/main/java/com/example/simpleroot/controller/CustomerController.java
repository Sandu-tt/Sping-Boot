package com.example.simpleroot.controller;

import com.example.simpleroot.dto.CustomerDTO;

import com.example.simpleroot.service.CustomerService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping(value = "api/v1/customer")
@CrossOrigin
public class CustomerController {
    @Autowired
    private CustomerService customerService;

    @GetMapping("/getcustomers")
    public List<CustomerDTO> getCustomer() {
        return  customerService.getAllCustomers();
    }


    @PostMapping("/saveCustomer")
    public CustomerDTO saveCustomer(@RequestBody CustomerDTO customerDTO) {
        return customerService.save(customerDTO);
    }

    @PutMapping("/updateCustomer")
    public  CustomerDTO updateCustomer(@RequestBody CustomerDTO customerDTO) {
        return  customerService.updateCustomer(customerDTO);
    }

    @DeleteMapping("/deleteCustomer")
    public boolean deleteCustomer(@RequestBody CustomerDTO customerDTO) {
        return  customerService.deleteCustomer(customerDTO);
    }
}
