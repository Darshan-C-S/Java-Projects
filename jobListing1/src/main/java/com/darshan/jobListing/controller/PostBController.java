package com.darshan.jobListing.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PostBController {
    @GetMapping("/Hellofrom2")
    public String postA(){
        return "Hello World";
    }
    @GetMapping("/Hellofrom2res")
    public ResponseEntity<String> postB(){
        return new ResponseEntity<>("Hello All !", HttpStatus.OK);
    }
}
