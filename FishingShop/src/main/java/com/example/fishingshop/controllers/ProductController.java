package com.example.fishingshop.controllers;

import com.example.fishingshop.models.Product;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class ProductController {
    @GetMapping("/products")
    public List<Product> getProducts() {
        return Arrays.asList(
            new Product(1, "Lansetă", 200),
            new Product(2, "Mulineta", 150),
            new Product(3, "Nadă", 50)
        );
    }
}