package com.orgn.demo.query;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.orgn.demo.entity.Employee;
@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer>{

}
