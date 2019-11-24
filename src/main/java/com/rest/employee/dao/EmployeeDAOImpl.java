package com.rest.employee.dao;

import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.rest.employee.entity.Employee;

@Repository
public class EmployeeDAOImpl implements EmployeeDAO {

	@Autowired
	private EntityManager entityManager;

	@Override
	public List<Employee> findAll() {
		Session currentSession = entityManager.unwrap(Session.class);
		Query<Employee> query = currentSession.createQuery("from Employee", Employee.class);
		List<Employee> employees = query.getResultList();
		return employees;
	}

	@Override
	public void save(Employee employee) {
		Session currentSession = entityManager.unwrap(Session.class);
		 currentSession.saveOrUpdate(employee);
	}

}
