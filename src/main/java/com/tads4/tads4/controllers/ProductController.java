package com.tads4.tads4.controllers;


import com.tads4.tads4.dto.ProductDTO;
import com.tads4.tads4.entities.Product;
import com.tads4.tads4.repositories.ProductRepository;
import com.tads4.tads4.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping(value = "/products")
public class ProductController {

    @Autowired
    private ProductService service;

    @GetMapping(value = "/{id}")
    public ProductDTO findById(@PathVariable Long id) {
        return  service.findById(id);

    }

}
