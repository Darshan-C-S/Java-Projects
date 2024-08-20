package com.darshan.jobListing.controller;


import com.darshan.jobListing.model.User;
import com.darshan.jobListing.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/users")
public class UserController {
@Autowired
private UserService userService;

@GetMapping
public User[] getAllUser(){
    return userService.getAllUser();
}

@GetMapping("/{id}")
public User getUserById(@PathVariable int id) {return userService.getUserById(id);}

@PostMapping()
public ResponseEntity<User> createUser(@RequestBody User user){return userService.createUser(user);}

    @PutMapping("/{id}")
    public void updateUser(@PathVariable int id, @RequestBody User user) {userService.updateUser(id, user);}

@DeleteMapping("/{id}")
public void deleteUser(@PathVariable int id){
    userService.deleteUser(id);
}




}
