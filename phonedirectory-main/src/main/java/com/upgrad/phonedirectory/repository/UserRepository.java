package com.upgrad.phonedirectory.repository;

import com.upgrad.phonedirectory.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Integer> {

    //All the calls from services as it implements all the business logic and Repo helps it to connect with the db.

    User findByUsername(String username);
    User findByEmail(String email);
    User findByPhoneNumber(String phoneNumber);
    User findByPassword(String password);
}
