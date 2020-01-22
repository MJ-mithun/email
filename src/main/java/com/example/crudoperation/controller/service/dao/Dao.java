package com.example.crudoperation.controller.service.dao;

import org.springframework.data.repository.CrudRepository;

import com.example.crudoperation.model.model;

public interface Dao extends CrudRepository<model, Integer> {

}
