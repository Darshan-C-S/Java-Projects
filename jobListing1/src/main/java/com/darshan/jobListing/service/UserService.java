package com.darshan.jobListing.service;

import com.darshan.jobListing.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Map;

@Service
public class UserService {

    @Autowired
    private RestTemplate restTemplate;

//    @Autowired
//    private User user;

    private static final String API_URL = "https://jsonplaceholder.typicode.com/users";

    public User [] getAllUser(){
        return restTemplate.getForObject(API_URL,User[].class);
    }
    public User getUserById(int id) {
        String url = API_URL + "/" + id;
        return restTemplate.getForObject(url, User.class);
    }
    public ResponseEntity<User> createUser(User user){
        return restTemplate.postForEntity(API_URL ,user , User.class );
    }

    public void updateUser(int id ,User user){
        String url = API_URL + "/" + id;
       restTemplate.put(url, user);
    }


    public void deleteUser(int id){
        String url   = API_URL + "/"+ id;
        restTemplate.delete(url);
    }



}
