package com.darshan.jobListing.repo;

import com.darshan.jobListing.model.Post;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface searchRepo {
    public List<Post> findByText(String Text);
}
