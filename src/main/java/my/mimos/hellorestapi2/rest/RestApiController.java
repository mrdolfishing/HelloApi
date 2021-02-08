package my.mimos.hellorestapi2.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import my.mimos.hellorestapi2.entity.Employee;
import my.mimos.hellorestapi2.services.EmployeeService;

@RestController
@RequestMapping("/api")
public class RestApiController {
	
	@Autowired
	EmployeeService employeeService;
	
	@GetMapping("")
	public String helloWorld() {
		return "hello world";
	}
	
	@GetMapping("/employees")
	public List<Employee> getAllEmployees(){
		return employeeService.getAllEmployees();
	}

}
