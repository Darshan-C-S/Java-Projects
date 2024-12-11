package com.example.SpringRedisDemo.Controller;


import com.example.SpringRedisDemo.Entity.Product;
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

    @Operation(summary = "Add Multiple Products")
    @PostMapping("/multiple")
    public ResponseEntity<List<Product>> saveMultipleProducts(@RequestBody List<Product> productList){
        return ResponseEntity.ok(productService.saveMultiple(productList));
    }

    @Operation(summary = "Add New Product")
    @PutMapping
    public ResponseEntity<Product> updateProduct(@RequestBody Product product){

        return ResponseEntity.ok(productService.updateProduct(product));

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
        return ResponseEntity.ok(productService.getProductById(id));
    }

    @Operation(summary = "Delete Product by Id")
    @DeleteMapping("/{id}")
    public ResponseEntity<Product> deleteProductByID(@PathVariable int id){
        productService.deleteProductById(id);


        return ResponseEntity.noContent().build();
    }


    @Operation(summary = "Search Products by filtering ")
    @GetMapping("/Search")
    public List<Product> searchProducts(
            @RequestParam(required = false) String name ,  @RequestParam(required = false) Integer minQuant,
            @RequestParam(required = false) Integer maxQuant,@RequestParam(required = false) Long minPrice,
            @RequestParam(required = false) Long maxPrice
    ){

        return productService.searchProducts(name, minQuant , maxQuant , minPrice, maxPrice);
    }








}
