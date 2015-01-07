package com.myco.Entity;

import java.util.List;

public interface EmployeeDao {
	
	public Employee findById(Long id);
	public void addEmployee(Employee e);
	public List<Employee> getAll();
	public Department getDepartment(Employee e);
}
