package com.joabejw.workshopmongo.Repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.joabejw.workshopmongo.entities.User;

@Repository
public interface UserRepository extends MongoRepository<User, String> {

}
