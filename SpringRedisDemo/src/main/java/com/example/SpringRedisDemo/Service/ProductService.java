package com.example.SpringRedisDemo.Service;


import com.example.SpringRedisDemo.Entity.Product;
import com.example.SpringRedisDemo.Repo.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class ProductService {
    @Autowired
    public ProductRepository productRepository;


/* CRUD SERVICE */


    @CachePut(value = "productCache", key = "#product.id")
    public Product updateProduct(Product product){
        return productRepository.save(product);
    }

    public List<Product> saveMultiple(List<Product> productList){
        return (List<Product>) productRepository.saveAll(productList);
    }


    public List<Product> getAllProduct(){
        return productRepository.findAll();
    }

    public List<Product> searchProducts (String name, Integer minQty, Integer maxQty, Long minPrice, Long maxPrice){

        List<Product> products = productRepository.findAll();
        if (products == null || products.isEmpty()) {
            return Collections.emptyList();
        }

        return products.stream()
                .filter(product -> (name == null || product.getName().toLowerCase().contains(name.toLowerCase())))
                .filter(product -> (minQty == null || product.getQty() >= minQty))
                .filter(product -> (maxQty == null || product.getQty() <= maxQty))
                .filter(product -> (minPrice == null || product.getPrice() >= minPrice))
                .filter(product -> (maxPrice == null || product.getPrice() <= maxPrice))
                .collect(Collectors.toList());


    }

    @Cacheable(value = "productCache", key = "#id")
    public Product getProductById(int id) {
        return productRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("The Product is not found"));
    }


    @CacheEvict(value = "productCache", key = "#id")
    public void deleteProductById(int Id){
       if(!productRepository.existsById(Id)){
           throw  new ProductNotFoundException("The product for Id : " +Id+ " not found");
       }
       productRepository.deleteById(Id);
    }




/* CACHE SERVICE */




}
