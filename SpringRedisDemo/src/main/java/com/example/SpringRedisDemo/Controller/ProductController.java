package com.example.SpringRedisDemo.Controller;


import com.example.SpringRedisDemo.Entity.Product;
import com.example.SpringRedisDemo.Repo.ProductRepository;
import com.example.SpringRedisDemo.Service.ProductService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/products")
@Tag(name = "Product Controller", description = "API for managing products")
public class ProductController {

    @Autowired
    public ProductService productService;

    @Operation(summary = "Add New Product")
    @PostMapping
    public ResponseEntity<Product> saveProduct(Product product){

        return ResponseEntity.ok(productService.saveProduct(product));

    }

    @Operation(summary = "Get all the Products present")
    @GetMapping
    public ResponseEntity<List<Product>> getAllProducts() {
        List<Product> products = productService.getAllProduct();
        System.out.println("Fetched Products: " + products);
        return ResponseEntity.ok(products);
    }


    @Operation(summary = "Get Products by Id")
    @GetMapping("/{id}")
    public ResponseEntity<Product> getProductById(@PathVariable int id){
        return productService.getProductById(id).map(ResponseEntity::ok).
                orElse(ResponseEntity.notFound().build());
    }

    @Operation(summary = "Delete Product by Id")
    @DeleteMapping("/{id}")
    public ResponseEntity<Product> deleteProductByID(@PathVariable int id){
        productService.deleteProductById(id);


        return ResponseEntity.noContent().build();
    }








}
