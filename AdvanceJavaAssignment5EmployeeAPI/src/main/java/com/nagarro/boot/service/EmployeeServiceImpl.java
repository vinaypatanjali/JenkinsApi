package com.nagarro.boot.service;

import java.util.List;

import javax.persistence.EntityNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nagarro.boot.dao.EmployeeRepository;
import com.nagarro.boot.models.Employee;

/**
 * 
 * @author vinaypatanjali
 *         <p>
 *         This class implements EmployeeService and performs database tasks
 *         </p>
 */
@Service("employeeService")
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeRepository employeeRepository;

	@Override
	public List<Employee> getAllEmployees() {
		List<Employee> employeeList = employeeRepository.findAll();
		return employeeList;
	}

	@Override
	public Employee saveEmployee(Employee employee) {

		return employeeRepository.save(employee);
	}

	@Override
	public Employee getEmployeeById(long id) {

		return employeeRepository.findById(id).orElseThrow(() -> new EntityNotFoundException("Employee not found"));
	}

	@Override
	public boolean deleteEmployee(long id) {
		employeeRepository.deleteById(id);
		return true;
	}

	@Override
	public List<Employee> addMultipleEmployees(List<Employee> employees) {
		return employeeRepository.saveAll(employees);
	};

}
