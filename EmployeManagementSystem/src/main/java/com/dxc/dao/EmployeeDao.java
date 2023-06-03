package com.dxc.dao;


import java.util.List;



 

import com.dxc.model.Employee;

 

public interface EmployeeDao {

	  public int saveEmployee(String employeeName,int employeeAge,int employeeSalary);
    public List<Employee> getAllEmployee();

    public void updateEmployee(int employeeId,int employeeSalary);

    public void deleteEmployee(int employeeId);

}