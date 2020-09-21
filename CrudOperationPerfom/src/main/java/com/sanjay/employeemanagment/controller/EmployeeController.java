package com.sanjay.employeemanagment.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.sanjay.employeemanagment.entity.Employee;
import com.sanjay.employeemanagment.service.EmployeeService;

@Controller

public class EmployeeController {

	private EmployeeService employeeService;
	
	public EmployeeController(EmployeeService theEmployeeService) {
		employeeService = theEmployeeService;
	}
	
	

	@GetMapping("/employeelist")
	public String listEmployees(Model theModel) {
		
		
		List<Employee> theEmployees = employeeService.findAll();
		
		
		theModel.addAttribute("employees", theEmployees);
		
		return "list-employees";
	}
	
	@GetMapping("/showFormForAdd")
	public String showFormForAdd(Model theModel) {
		
		
		Employee theEmployee= new Employee();
		
		theModel.addAttribute("employee", theEmployee);
		
		return "employee-form";
	}

	@GetMapping("/showFormForUpdate")
	public String showFormForUpdate(@RequestParam("employeeId") int thesoftware_Id,
									Model theModel) {
		
		
		Employee theEmployee = employeeService.findById(thesoftware_Id);
		
		
		theModel.addAttribute("employee", theEmployee);
		
		
		return "employee-form";			
	}
	
	
	@PostMapping("/save")
	public String saveEmployee(@ModelAttribute("employee") Employee theEmployee) {
		
	
		employeeService.save(theEmployee);
		
		
		return "redirect:/employees/list";
	}
	
	
	@GetMapping("/delete")
	public String delete(@RequestParam("employeeId") int thesoftware_Id) {
		
		
		employeeService.deleteById(thesoftware_Id);
		
		
		return "redirect:/employees/list";
		
	}
}


















