package com.office.connections;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class Controller {
    @Autowired
    EmployeeRepository employeeRepository;

    @Autowired
    DepartmentRepository departmentRepository;


    @GetMapping("employees")
    public List<Employee> returnAll(){
        System.out.print("Working");
       return employeeRepository.findAll();
    }


    @PostMapping("employees")
    public @ResponseBody  Employee create(@RequestBody  Employee employee){
        employeeRepository.save(employee);
        return employee;
    }


}
