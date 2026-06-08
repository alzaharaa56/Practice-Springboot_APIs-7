package com.example.Practice.Springboot.APIs7.Controllers;

import com.example.Practice.Springboot.APIs7.services.ProductService;
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

