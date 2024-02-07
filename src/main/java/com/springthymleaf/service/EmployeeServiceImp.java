package com.springthymleaf.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springthymleaf.model.Employee;
import com.springthymleaf.repository.EmpRepository;

@Service
public class EmployeeServiceImp implements EmployeeService {
	@Autowired
	private EmpRepository empRepository;

	public List<Employee> getAllEmployees() {
		// TODO Auto-generated method stub

		return empRepository.findAll();
	}

	@Override
	public void saveEmployee(Employee employee) {
		// TODO Auto-generated method stub
		this.empRepository.save(employee);
		
	}

	public Employee getEmployeeById(long id) {
		Optional<Employee>optional=empRepository.findById(id);
		Employee employee=null;
		if(optional.isPresent()) {
			employee=optional.get();
			
		}else {
			throw new RuntimeException("Employee not found for id::"+id);
		}
		
		return employee;
		
		
	}

	@Override
	public void deleteEmployeeById(long id) {
		// TODO Auto-generated method stub
		this.empRepository.deleteById(id);
		
	}

}
