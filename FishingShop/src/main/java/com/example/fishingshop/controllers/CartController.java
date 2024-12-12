package com.example.fishingshop.controllers;

import com.example.fishingshop.models.Cart;
import com.example.fishingshop.models.Product;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/cart")
public class CartController {
    private Cart cart = new Cart();

    @PostMapping("/add")
    public String addToCart(@RequestParam int productId) {
        // Simulăm adăugarea unui produs
        Product product = new Product(productId, "Produs " + productId, 100.0);
        cart.addProduct(product);
        return "Produs adăugat cu succes!";
    }

    @GetMapping
    public Cart getCart() {
        return cart;
        
    }
}
