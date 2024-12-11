package com.example.SpringRedisDemo;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableCaching
public class SpringRedisDemoApplication {
/*
*  For reference use chat GPT : https://chatgpt.com/c/673333cc-ee88-8004-ab18-f6d74ddef25a
*   */


	public static void main(String[] args) {
		SpringApplication.run(SpringRedisDemoApplication.class, args);
	}

}
