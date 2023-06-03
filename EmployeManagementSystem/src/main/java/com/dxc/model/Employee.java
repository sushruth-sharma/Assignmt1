package com.dxc.model;

/*

* In Database

* create database dxc;

* use dxc;

* create table STUDENT(id int primary key auto_increment,FIRST_NAME varchar(50) not null,LAST_NAME varchar(50) not null,SECTION varchar(10) not null);

*/

import java.io.Serializable;


 

import javax.persistence.*;

 

@SuppressWarnings("serial")

@Entity

@Table(name="EMPLOYEE")

public class Employee implements Serializable {

    

    @Id

    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private int employeeId;

    

    @Column(name="EMPLOYEE_NAME",nullable=false)

    private String employeeName;

    

    @Column(name="EMPLOYEE_AGE",nullable=false)

    private int employeeAge;

    

    @Column(name="EMPLOYEE_SALARY",nullable=false)

    private int employeeSalary;

 

    public int getEmployeeId() {

        return employeeId;

    }

 

    public void setId(int employeeId) {

        this.employeeId = employeeId;

    }

 

    public String getEmployeeName() {

        return employeeName;

    }

 

    public void setEmployeeName(String employeeName) {

        this.employeeName = employeeName;

    }

 

    public int getEmployeeAge() {

        return employeeAge;

    }

 

    public void setEmployeeAge(int employeeAge) {

        this.employeeAge = employeeAge;

    }

 

    public int getEmployeeSalary() {

        return employeeSalary;

    }

 

    public void setEmployeeSalary(int employeeSalary) {

        this.employeeSalary = employeeSalary;

    }

 

    @Override

    public String toString() {

        return "Employee [employeeId=" + employeeId + ", employeeName=" + employeeName + ", employeeAge=" + employeeAge

                + ", employeeSalary=" + employeeSalary + "]";

    }

    

    

    

}
