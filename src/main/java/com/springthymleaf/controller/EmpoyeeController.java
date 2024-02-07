package com.springthymleaf.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springthymleaf.model.Employee;
import com.springthymleaf.service.EmployeeService;






@Controller
public class EmpoyeeController {
	@Autowired
	EmployeeService employeeService;
	@GetMapping("/")
	public String viewHomPage(Model model) {
		
		model.addAttribute("ListEmpoyees", employeeService.getAllEmployees());
		return "index";
		
	}
	
	//method handler
	@GetMapping("/showNewEmployeeForm")
	String showNewEmployee(Model model) {
		Employee employee =new Employee();
		model.addAttribute("employee", employee);
		return "new_employee";
		
		
	}
	@PostMapping("/saveEmployee")
	String saveEmployee(@ModelAttribute("employee") Employee employee) {
		this.employeeService.saveEmployee(employee);
		return "redirect:/";
		
		
	}
	@GetMapping("/showFormForUpdate/{id}")
	String showFormForUpdate(@PathVariable (value ="id")long id, Model model) {
		//get employee from the service
		Employee employee = employeeService.getEmployeeById(id);
				//set employee as a model attribute to prepopulatioin the form
				model.addAttribute("employee", employee);
				return "update_employee";
				
		
		
	}
	@GetMapping("/deleteEmployee/{id}")
	String deleteEmployee(@PathVariable(value="id")long id) {
		//call deleete method from the service 
		this.employeeService.deleteEmployeeById(id);
		return "redirect:/";
		
	}

}
