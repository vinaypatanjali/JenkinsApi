package com.nagarro.boot;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nagarro.boot.models.Employee;
import com.nagarro.boot.service.EmployeeServiceImpl;

/**
 * 
 * @author vinaypatanjali
 *         <p>
 *         Main Spring Boot Controller to control full web application
 *         </p>
 */
@CrossOrigin(origins = "http://localhost:8080", maxAge = 3600)
@RestController
@RequestMapping("/employees")
public class WebController {

	@Resource(name = "employeeService")
	private EmployeeServiceImpl employeeService;

	/**
	 * Handles request to get all employees
	 * 
	 * @return list of employees
	 */
	@GetMapping
	public List<Employee> getAllEmployees() {

		List<Employee> employeesList = employeeService.getAllEmployees();

		// System.out.println(employeesList);

		return employeesList;
	}

	/**
	 * Handles request to get employee with specified id
	 * 
	 * @param id
	 * @return
	 */
	@GetMapping("/employee/{id}")
	public Employee getEmployee(@PathVariable Long id) {
		return employeeService.getEmployeeById(id);
	}

	/**
	 * Handles request to save a new employee or update existing
	 * 
	 * @param employee
	 * @return
	 */
	@PostMapping("/add")
	public Employee saveEmployee(final @RequestBody Employee employee) {

		return employeeService.saveEmployee(employee);
	}

	/**
	 * Handles request to add multiple employees
	 * 
	 * @param employees
	 * @return
	 */
	@PostMapping("/addAll")
	public List<Employee> saveAllEmployee(final @RequestBody List<Employee> employees) {

		System.out.println("multiple: " + employees);

		return employeeService.addMultipleEmployees(employees);
	}

	/**
	 * Handles request to delete a employee with given id
	 * 
	 * @param id
	 * @return
	 */
	@DeleteMapping("/employee/{id}")
	public Boolean deleteEmployee(@PathVariable Long id) {
		return employeeService.deleteEmployee(id);
	}

}
