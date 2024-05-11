package com.example.caching.service;

import com.example.caching.model.Employee;
import com.example.caching.repository.EmployeeRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {

    private static final Logger log = LoggerFactory.getLogger(EmployeeService.class);
    private EmployeeRepository employeeRepository;

    public EmployeeService(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }


    public Employee saveEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }

    @Cacheable(value = "employee", key = "#id")
    public Employee findById(Integer id) throws Exception {
        log.info("getting employee with id {}", id);
        return employeeRepository.findById(id).orElseThrow(() -> new Exception("Employee not found with given Id"));
    }

    @CachePut(cacheNames = "employee", key = "#employee.id")
    public Employee updateEmployee(Employee employee, int id) throws Exception {

        Employee existingEmployee = employeeRepository.findById(id).orElseThrow(() -> new Exception("Unable to update employee"));

        existingEmployee.setName(employee.getName());
        existingEmployee.setAddress(employee.getAddress());
        System.out.println("Update the record with id : " + id);
        return employeeRepository.save(existingEmployee);
    }


    @CacheEvict(value = "employee", key = "#id")
    public void deleteEmployee(Integer id) {
        employeeRepository.deleteById(id);
    }
}

