package com.example.crudoperation.controller.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.crudoperation.controller.service.dao.Dao;
import com.example.crudoperation.model.model;
@Service
public class modelservic {

	@Autowired
	public Dao dao;
	public void save(model save) 
	{
		dao.save(save);
		
	}

	

	



	public List<model> get() {

		return (List<model>)dao.findAll();
	}







	public void delete(int id) 
	{
		dao.deleteById(id);
		
	}







	public void update(model update) {
		dao.save(update);
		
		
	}







	

}
