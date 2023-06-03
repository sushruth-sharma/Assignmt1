package com.dxc.dao;

import java.util.List;



import org.hibernate.Session;

import com.dxc.model.Employee;

import com.dxc.util.HibernateUtil;

 

public class EmployeeDaoImpl implements EmployeeDao {

 

 

    public int saveEmployee(String employeeName, int employeeAge, int employeeSalary) {

        Employee employee = new Employee();

        employee.setEmployeeName(employeeName);

        employee.setEmployeeAge(employeeAge);

        employee.setEmployeeSalary(employeeSalary);

        

        Session session = HibernateUtil.getSessionFactory().openSession();

        

        session.beginTransaction();

        int id = (Integer)session.save(employee);

        session.getTransaction().commit();

        session.close();

        

        return id;

    }

 

    

    public List<Employee> getAllEmployee() {

        Session session = HibernateUtil.getSessionFactory().openSession();

        

        session.beginTransaction();

        

        @SuppressWarnings("unchecked")

        List<Employee> emps = (List<Employee>)session.createQuery("FROM Employee e ORDER BY e.employeeName ASC").list();

        

        session.getTransaction().commit();

        session.close();

        

        return emps;

    }

 

    

    public void updateEmployee(int employeeId, int employeeSalary) {

        Session session = HibernateUtil.getSessionFactory().openSession();

        

        session.beginTransaction();

        Employee employee = (Employee)session.get(Employee.class,employeeId);

        employee.setEmployeeSalary(employeeSalary);

        //session.update(employee);//no need to call update manually as it will be updated automatically on transaction close

        session.getTransaction().commit();

        session.close();

 

    }

 

    

    public void deleteEmployee(int employeeId) {

        Session session = HibernateUtil.getSessionFactory().openSession();

        

        session.beginTransaction();

        Employee employee = (Employee)session.get(Employee.class,employeeId);

        session.delete(employee);

        session.getTransaction().commit();

        session.close();

 

    }

 

}