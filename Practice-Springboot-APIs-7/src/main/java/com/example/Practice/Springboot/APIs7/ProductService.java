package com.example.Practice.Springboot.APIs7;

import org.springframework.stereotype.Service;
import java.util.HashMap;

@Service
public class ProductService {

        private HashMap<Integer, Product> productMap = new HashMap<>();


        public void loadSampleProducts() {
            productMap.put(1, new Product(1, "Laptop", 500));
            productMap.put(2, new Product(2, "Phone", 300));
            productMap.put(3, new Product(3, "Tablet", 200));
        }


        public String deleteProductById(int productId) {
            Product product = productMap.get(productId);

            if (product == null) {
                return "Product not found\nNo deletion performed";
            }

            productMap.remove(productId);
            return "Product Deleted Successfully\n" +
                    "Product ID: " + product.getProductId() + "\n" +
                    "Product Name: " + product.getProductName() + "\n" +
                    "Status: Removed from inventory";
        }


        public HashMap<Integer, Product> getAllProducts() {
            return productMap;
        }
    }


