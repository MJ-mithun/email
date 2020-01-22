package com.example.crudoperation.controller;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.crudoperation.controller.service.modelservic;
import com.example.crudoperation.model.model;



@RestController
@RequestMapping("api")
public class controller 
{
@Autowired	
public modelservic service;	
@PostMapping
public  String  save(@RequestBody model save) 
    {
	
	service.save(save);
	return "created";
	}
	
@GetMapping
public List<model>get()
	{
	
	return service.get();
	}
@PutMapping(path="/{id}")

public void update(@RequestBody model update) 
{
service.update(update);	
	
}
@DeleteMapping(path="/{id}")

public String delete(@RequestBody int id) 

	{
	service.delete(id);
	return "deleted";
	}
}
