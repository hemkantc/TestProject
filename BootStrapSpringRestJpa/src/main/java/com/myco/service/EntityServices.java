package com.myco.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.myco.Entity.Department;
import com.myco.Entity.DepartmentDao;
import com.myco.Entity.Employee;
import com.myco.Entity.EmployeeDao;

@Service
public class EntityServices implements EntityInterface {
	
	public EntityServices() {
		
	}
	
	@Autowired 
	EmployeeDao dao;
	
	@Autowired
	DepartmentDao ddao;
	
	@Transactional(readOnly = true)
	public Employee findById(Long id){
		return dao.findById(id);
	}

	@Override
	@Transactional(readOnly = true)
	public Department findById(Integer id) {
		Department d = ddao.findById(id);
		d.getElist().size(); // Initialized for LAZY loading Department Entity
		System.out.println("----"+d.getName());
		//return ddao.findById(id);
		return d;
	}
	
	

}
