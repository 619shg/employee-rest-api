package com.rest.employee.resource;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rest.employee.entity.Employee;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/api")
public interface EmployeeResource {

	@GetMapping("/employees")
	public List<Employee> findAll();

	@PostMapping("/employees")
	public Employee addEmployee(@RequestBody Employee employee);
}
