package com.example.springnative;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.function.Function;

@Component
public class EmployeeFunction implements Function<Input,Iterable<Employee>>{

    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public Iterable<Employee> apply(Input s) {
        return employeeRepository.findAll();
    }
}

