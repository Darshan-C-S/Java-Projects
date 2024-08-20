package com.darshan.jobListing.model;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class User {
    private int id;
    private String name;
    private String username;
    private String email;

    // Getters and Setters
}