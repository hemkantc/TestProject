package com.myco.service;

import com.myco.Entity.Department;
import com.myco.Entity.Employee;

public interface EntityInterface {
	
	public Employee findById(Long id);

	public Department findById(Integer id);
}
