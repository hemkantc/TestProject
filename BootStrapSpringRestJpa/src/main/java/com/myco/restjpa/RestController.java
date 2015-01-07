package com.myco.restjpa;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.myco.Entity.Department;
import com.myco.Entity.DepartmentDao;
import com.myco.Entity.Employee;
import com.myco.service.EntityInterface;

@Controller
public class RestController {
	
	
	Logger logger = LoggerFactory.getLogger(RestController.class);
	
	@Autowired
	EntityInterface eService;
	
	//@Autowired 
	//EmployeeDao dao;
	
	@Autowired
	DepartmentDao ddao;
	
	@RequestMapping(value="/rest/emp/{id}",method = RequestMethod.GET,produces = "application/json")
	public @ResponseBody Employee getEmp(@PathVariable Long id) {
		logger.info("inside controller");
		Employee e = new Employee();
		e = eService.findById(id); 
		logger.info("Dao Completed"+e.toString());
		return e;
	}
	
	@RequestMapping(value="/rest/dep/{id}",method = RequestMethod.GET,produces = "application/json")
	public @ResponseBody Department getDep(@PathVariable Integer id) {
		Department d = eService.findById(id);
		logger.info("logger "+d.toString());
		return d;
		//return eService.findById(id);
	}
	
	@RequestMapping(value="/rest/depall/{id}",method = RequestMethod.GET,produces = "application/json")
	public @ResponseBody List<Employee> getEmployeeOfDep(@PathVariable Integer id) {
		return ddao.getAllEmployees(id);
	}
	
	@RequestMapping(value="/rest/",method = RequestMethod.GET,produces = "application/json")
	public @ResponseBody Department getObject() {
		
		Department d = new Department();
		d.setId(100);
		d.setName("Test");
		logger.info("Object "+d.toString());
		return d;
	}

}
