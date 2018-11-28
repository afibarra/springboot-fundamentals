package me.afibarra.productrestapi.controllers;

import me.afibarra.productrestapi.entities.Product;
import me.afibarra.productrestapi.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductController {

    @Autowired
    private ProductRepository repository;

    @GetMapping("/products")
    public List<Product> findAll() {
        return repository.findAll();
    }
}
