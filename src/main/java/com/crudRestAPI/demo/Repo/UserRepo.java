package com.crudRestAPI.demo.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.crudRestAPI.demo.Models.User;

public interface UserRepo extends JpaRepository<User, Long> {
    
}
