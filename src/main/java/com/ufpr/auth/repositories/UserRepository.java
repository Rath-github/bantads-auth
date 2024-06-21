package com.ufpr.auth.repositories;

import com.ufpr.auth.models.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User,String> {
    User findByUsername(String username);
}