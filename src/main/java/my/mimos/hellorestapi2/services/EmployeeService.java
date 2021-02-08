package my.mimos.hellorestapi2.services;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import my.mimos.hellorestapi2.entity.Employee;
import my.mimos.hellorestapi2.repository.EmployeeRepository;

@Service
public class EmployeeService {
	
	@Autowired
	private EmployeeRepository employeeRepo;
	
	public void save(Employee employee) {
		employeeRepo.save(employee);
		
	}
	
	public List<Employee> getAllEmployees(){
		return employeeRepo.findAll();
	}
	
	public Employee getEmployee(int employeeId) {
		Employee searchedEmployee = null;
	Optional<Employee> currentEmployee = employeeRepo.findById(employeeId);
	if (currentEmployee.isPresent()) {
		searchedEmployee = currentEmployee.get();
	}
	else {
		throw new RuntimeException("Could not find employee of id "+employeeId);
	}
		return searchedEmployee;
	}
	
	public void deleteEmployee(int employeeId) {
		
	}

}
