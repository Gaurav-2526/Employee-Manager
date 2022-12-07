package com.consultadd.training.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Employee {
    @Id
    private String Id;
    private String name;
    private String salary;

    public Employee(String id, String name, String salary) {
        Id = id;
        this.name = name;
        this.salary = salary;
    }
    public Employee() {
    }
    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }
}
