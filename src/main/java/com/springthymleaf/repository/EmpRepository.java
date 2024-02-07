package com.springthymleaf.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springthymleaf.model.Employee;

@Repository
public interface EmpRepository extends JpaRepository<Employee, Long>{

}
