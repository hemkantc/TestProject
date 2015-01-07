package com.myco.Entity;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Repository
public class EmployeeDaoImpl implements EmployeeDao {
	
	Logger logger = LoggerFactory.getLogger(EmployeeDaoImpl.class);
	
	private EntityManager em;
	
    @PersistenceContext
    public void setEntityManager(EntityManager em) {
        this.em = em;
    }
	
    
	@Override
	public Employee findById(Long id) {
			logger.info("Find by id ",id);
			
			try{	
				return em.find(Employee.class,id);
				
			}catch(PersistenceException e){
	      		System.out.println("exception while Getting employee");
	      		return null;
	      	}
			
		}
	
	@Override
	@Transactional(readOnly = false, propagation = Propagation.REQUIRES_NEW)
	public void addEmployee(Employee e) {
		logger.info("Add Employee ",e.toString());
			em.persist(e);
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<Employee> getAll() {
		logger.info("Getall Emp ");
			return em.createQuery("select e from Employee e").getResultList();

	}
	
	@Override
	public Department getDepartment(Employee e) {
		return (Department) em.createQuery("select d from Empoyee e,Department d where e.department_id = d.dep_id").getSingleResult();
	}
	
	
	
}