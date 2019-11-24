package com.rest.employee.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.rest.employee.entity.Employee;
import com.rest.employee.service.EmployeeService;

@Component
public class EmployeeResourceImpl implements EmployeeResource {

	@Autowired
	EmployeeService employeeService;

	@Override
	public List<Employee> findAll() {
		return employeeService.findAll();
	}

	@Override
	public Employee addEmployee(Employee employee) {
		employee.setId(0);
		employeeService.save(employee);
		return employee;
	}

}
