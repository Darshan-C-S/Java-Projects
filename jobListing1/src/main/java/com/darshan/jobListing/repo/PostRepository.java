package com.darshan.jobListing.repo;

import com.darshan.jobListing.model.Post;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PostRepository extends MongoRepository<Post , String> {
//Post: This is the type of the objects that the repository will be managing.
//String: This represents the type of the ID of the objects that the repository will manage.
// In this case, it's a String.


    @Query("{'profile': ?0}")
    List<Post> findByProfile(String profile);

    @Query("{'techs': ?0}")
    List<Post> findByTechs(String Techs);

    @Query("{'exp': ?0}")
    List<Post> findByExp(int exp);

}
