package com.nagarro.boot.models;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.Filter;
import org.hibernate.annotations.FilterDef;
import org.hibernate.annotations.Filters;
import org.hibernate.annotations.ParamDef;

/**
 * 
 * @author vinaypatanjali
 *         <p>
 *         Model class for Employee
 *         </p>
 */
@Entity
@Table(name = "Employee")
@FilterDef(name = "employeeFilter", parameters = { @ParamDef(name = "employeeIdParam", type = "long") })
@Filters({ @Filter(name = "employeeFilter", condition = ":employeeIdParam = id") })
public class Employee implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "employee_id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

	@Column(name = "employee_name")
	private String employeeName;

	@Column(name = "employee_location")
	private String employeeLocation;

	@Column(name = "employee_email", unique = true)
	private String employeeEmail;

	@Column(name = "employee_dob")
	private String employeeDOB;

	/**
	 * 
	 * @return id
	 */
	public long getId() {
		return id;
	}

	/**
	 * 
	 * @param id
	 */
	public void setId(long id) {
		this.id = id;
	}

	/**
	 * 
	 * @return employee name
	 */
	public String getEmployeeName() {
		return employeeName;
	}

	/**
	 * 
	 * @param employeeName
	 */
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	/**
	 * 
	 * @return employee location
	 */
	public String getEmployeeLocation() {
		return employeeLocation;
	}

	/**
	 * 
	 * @param employeeLocation
	 */
	public void setEmployeeLocation(String employeeLocation) {
		this.employeeLocation = employeeLocation;
	}

	/**
	 * 
	 * @return employee email
	 */
	public String getEmployeeEmail() {
		return employeeEmail;
	}

	/**
	 * 
	 * @param employeeEmail
	 */
	public void setEmployeeEmail(String employeeEmail) {
		this.employeeEmail = employeeEmail;
	}

	/**
	 * 
	 * @return employee date of birth
	 */
	public String getEmployeeDOB() {
		return employeeDOB;
	}

	/**
	 * 
	 * @param employeeDOB
	 */
	public void setEmployeeDOB(String employeeDOB) {
		this.employeeDOB = employeeDOB;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", employeeName=" + employeeName + ", employeeLocation=" + employeeLocation
				+ ", employeeEmail=" + employeeEmail + ", employeeDOB=" + employeeDOB + "]";
	}

}
