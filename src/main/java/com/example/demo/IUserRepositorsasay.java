package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository // permite hacer consultas a base de datos
public interface IUserRepositorsasay extends JpaRepository<User, Long> {

}