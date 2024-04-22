package com.example.demo.repositories;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.entities.Events;

public interface IEventsRepository extends CrudRepository<Events, Long> {

}
