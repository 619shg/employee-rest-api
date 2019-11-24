package com.rest.employee.service;

import java.util.List;

import com.rest.employee.entity.Employee;

public interface EmployeeService {
public List<Employee> findAll();
public void save(Employee employee);
}
