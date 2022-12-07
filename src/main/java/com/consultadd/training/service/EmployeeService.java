package com.consultadd.training.service;

import com.consultadd.training.model.Employee;
import com.consultadd.training.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService {

    @Autowired
    EmployeeRepository employeeRepository;

    public List<Employee> getAll() {
        return employeeRepository.findAll();
    }

    public String add(Employee employee) {
        if (employeeRepository.existsById(employee.getId())) {
            return "Already Present";
        } else {
            employeeRepository.save(employee);
            return "Employee successfully added";
        }
    }

    public String update(Employee emp){
        if(employeeRepository.existsById(emp.getId())){
            employeeRepository.save(emp);
            return "Employee updated successfully";
        }
        return "Employee doesn't exists";
    }
    public String delete(String id){
        employeeRepository.deleteById(id);
        return "Employee deleted";
    }
}