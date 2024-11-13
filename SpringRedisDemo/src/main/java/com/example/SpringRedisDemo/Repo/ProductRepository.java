package com.example.SpringRedisDemo.Repo;

import com.example.SpringRedisDemo.Entity.Product;
import org.springframework.data.repository.CrudRepository;

public interface ProductRepository extends CrudRepository<Product , Integer> {



}
