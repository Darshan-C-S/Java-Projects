package com.example.SpringRedisDemo.Repo;

import com.example.SpringRedisDemo.Entity.Product;
import org.apache.catalina.LifecycleState;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ProductRepository extends CrudRepository<Product , Integer> {
    List<Product> findAll();



}
