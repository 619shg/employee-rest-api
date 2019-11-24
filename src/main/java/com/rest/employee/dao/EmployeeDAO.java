package com.rest.employee.dao;

import java.util.List;

import com.rest.employee.entity.Employee;

public interface EmployeeDAO {
public List<Employee> findAll();
public void save(Employee employee);
}
