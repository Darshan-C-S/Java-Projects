package com.example.SpringRedisDemo.Service;


import com.example.SpringRedisDemo.Entity.Product;
import com.example.SpringRedisDemo.Repo.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {
    @Autowired
    public ProductRepository productRepository;

    public Product saveProduct(Product product){
        return productRepository.save(product);
    }

    public List<Product> getAllProduct(){
        return (List<Product>) productRepository.findAll();
    }

    public Optional<Product> getProductById(int Id){
        return productRepository.findById(Id);
    }

    public void deleteProductById(int Id){
       if(!productRepository.existsById(Id)){
           throw  new ProductNotFoundException("The product for Id : " +Id+ " not found");
       }
       productRepository.deleteById(Id);
    }




}
