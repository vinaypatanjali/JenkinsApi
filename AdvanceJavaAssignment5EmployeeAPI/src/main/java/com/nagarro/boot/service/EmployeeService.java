package com.nagarro.boot.service;

import java.util.List;

import com.nagarro.boot.models.Employee;

/**
 * 
 * @author vinaypatanjali
 *
 */
public interface EmployeeService {

	/**
	 * Saves/Updates employee to database
	 * 
	 * @param employee
	 * @return
	 */
	public Employee saveEmployee(Employee employee);

	/**
	 * Gets all employees from database
	 * 
	 * @return
	 */
	public List<Employee> getAllEmployees();

	/**
	 * Gets employee using employee id
	 * 
	 * @param id
	 * @return
	 */
	public Employee getEmployeeById(long id);

	/**
	 * Deletes employee using employee id
	 * 
	 * @param id
	 * @return
	 */
	public boolean deleteEmployee(long id);

	/**
	 * Saves multiple employees to database
	 * 
	 * @param employees
	 * @return
	 */
	public List<Employee> addMultipleEmployees(List<Employee> employees);
}
