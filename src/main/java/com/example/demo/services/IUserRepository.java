package com.example.demo.services;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.example.demo.entities.User;

public interface IUserRepository extends CrudRepository<User, Long> {

}