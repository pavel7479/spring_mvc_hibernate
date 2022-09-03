package com.dao;

import com.entity.Employee;

import java.util.List;

public interface EmployeeDAO {
    public List<Employee> getAllEmployees();

    public void saveEmployee(Employee employee);

   public Employee getEmployee(int id);

    public void deleteEmployee(int id);

// My variant
//    public void deleteEmployee(Employee employee);
}
