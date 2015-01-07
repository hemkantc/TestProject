package com.myco.Entity;

import java.util.List;

public interface DepartmentDao {

	public Department findById(Integer id);
	public void addDepartment(Department d);
	public List<Employee> getAllEmployees(Integer id);
}
