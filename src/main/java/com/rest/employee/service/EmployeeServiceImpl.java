package com.rest.employee.service;

import java.util.Comparator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.rest.employee.dao.EmployeeDAO;
import com.rest.employee.entity.Employee;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	EmployeeDAO employeeDAO;

	@Override
	@Transactional
	public List<Employee> findAll() {
		List<Employee> employees = employeeDAO.findAll();
		employees.sort(Comparator.comparing(e -> e.getFirstName()));
		return employees;
	}

	@Override
	@Transactional
	public void save(Employee employee) {
		employeeDAO.save(employee);

	}

}
