package com.dxc.client;

import java.util.List;

 

import com.dxc.dao.EmployeeDao;

import com.dxc.dao.EmployeeDaoImpl;

import com.dxc.model.Employee;

import java.util.*;

 

public class ClientDemo {

    public static void main(String[] args) {

        EmployeeDao dao = new EmployeeDaoImpl();

        

        @SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();

        

        while( n==1) {

            System.out.println("------options-------");

            System.out.println("1.save Employee");

            System.out.println("2. Retrive all Employee Data");

            System.out.println("3.Update the Employee information");

            System.out.println("4.Delete the Employee information-");

            System.out.println("5.Exit");

            System.out.println("Enter your choice(1-5)");

            int choice = sc.nextInt();

            switch(choice) {

            case 1:

                System.out.println("enter number of records to be uploaded");

                int a=sc.nextInt();

                for(int i=0;i<=a;i++) {

                    System.out.println("enter name");

                    String name = sc.next();

                    System.out.println("enter age");

                    int age=sc.nextInt();

                    System.out.println("enter salary");

                    int salary=sc.nextInt();

                    dao.saveEmployee(name, age, salary);

                    System.out.println("Succefull saved records in Employee ");

                    

                }

                break;

                

                

            case 2:

                List<Employee> emp = dao.getAllEmployee();

                for(Employee e: emp) {

                    System.out.println(e);

                }

                System.out.println("Employee Records Retrived");

                break;

            case 3:

                System.out.println("enter id and salary to get update");

                int id=sc.nextInt();

                int salary=sc.nextInt();

                dao.updateEmployee(id,salary);

                List<Employee> emp11 = dao.getAllEmployee();

                for(Employee e: emp11) {

                    System.out.println(e);

                }

                System.out.println("Updated Records Succefully in Employee table");

                break;

            case 4:

                System.out.println("enter which id  to get delete");

                int id1=sc.nextInt();

                dao.deleteEmployee(id1);

                List<Employee> emp21 = dao.getAllEmployee();

                for(Employee e: emp21) {

                    System.out.println(e);

                }

                System.out.println("Deleted Records Succefully in Employee table");

                break;

            case 5:

                System.out.println("Exit");

                break;

            default:

                System.out.println("Wrong output");

            }

            System.out.println("Do you want to continue");

            n=sc.nextInt();

                

                

                

            

            }

            System.out.println("you are out of the loop");

            

        }

    }