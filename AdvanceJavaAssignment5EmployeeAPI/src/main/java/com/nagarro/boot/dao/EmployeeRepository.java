package com.nagarro.boot.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nagarro.boot.models.Employee;

/**
 * 
 * @author vinaypatanjali
 *         <p>
 *         This interface extends JpaRepository
 *         </p>
 */
@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
