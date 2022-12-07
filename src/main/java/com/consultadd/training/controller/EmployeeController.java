package com.consultadd.training.controller;

import com.consultadd.training.model.Employee;
import com.consultadd.training.repository.EmployeeRepository;
import com.consultadd.training.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/emp")
public class EmployeeController {
    @Autowired
    EmployeeService employeeService;

    @GetMapping("/getAll")
        public List<Employee> getAll(){
        List<Employee> employeeList = employeeService.getAll();
        return employeeList;
        }

    @PostMapping("/add")
        public String addEmp(@RequestBody Employee emp){
            return employeeService.add(emp);
        }

    @PutMapping("/update")
    public String update(@RequestBody Employee emp){
        return employeeService.update(emp);
    }

    @DeleteMapping("/delete/{id}")
    public String Delete(@PathVariable("id") String id){
        return employeeService.delete(id);
    }
    }


