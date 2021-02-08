package my.mimos.hellorestapi2.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import my.mimos.hellorestapi2.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}
