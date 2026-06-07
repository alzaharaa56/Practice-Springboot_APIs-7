package com.example.Practice.Springboot.APIs7;

import org.springframework.web.bind.annotation.*;

@RestController

public class ProductController {

    private final ProductService productService;


    public ProductController(ProductService productService) {
        this.productService = productService;
        productService.loadSampleProducts();
    }


    @DeleteMapping("/products/{id}")
    public String deleteProduct(@PathVariable int id) {
        return productService.deleteProductById(id);
    }


    @GetMapping("/products")
    public Object viewProducts() {
        return productService.getAllProducts();
    }
}

