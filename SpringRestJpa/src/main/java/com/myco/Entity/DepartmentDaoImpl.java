package com.myco.Entity;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public class DepartmentDaoImpl implements DepartmentDao{
	
	Logger logger = LoggerFactory.getLogger(DepartmentDaoImpl.class);
	
	private EntityManager em;

    @PersistenceContext
    public void setEntityManager(EntityManager em) {
        this.em = em;
    }
	
	@Override
	public Department findById(Integer id) {
		
		logger.info("Find Department ",id);
		return em.find(Department.class, id);
	}

	@Override
	public void addDepartment(Department d) {
		// TODO Auto-generated method stub
		
	}

	@Override
	@Transactional(readOnly = true)
	public List<Employee> getAllEmployees(Integer id) {
		logger.info("Find all emp of depart ",id);
		 return em.find(Department.class, id).getElist();
	}

}
