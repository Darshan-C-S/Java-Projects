package com.example.SpringRedisDemo.Service;

public class ProductNotFoundException extends RuntimeException{
    public  ProductNotFoundException(String message){
        super(message);
    }
}
