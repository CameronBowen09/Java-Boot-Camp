/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.example;

/**
 *
 * @author User
 */
import com.example.Domain.Employee;

public class EmployeeTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Employee emp = new Employee();
        
        emp.setEmpID(101);
        emp.setName("Jane Smith");
        emp.setSsn("012-34-5678");
        emp.setSalary(345.27);
        
        System.out.println("Employee ID: " + emp.getEmpID());
        System.out.println("Employee Name: " + emp.getName());
        System.out.println("Employee SSN: " + emp.getSsn());
        System.out.println("Employee Salary: " + emp.getSalary());
        
        
    }
    
}
