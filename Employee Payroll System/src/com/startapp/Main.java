package com.startapp;

public class Main {

    static void main() {

        EmployeePayrollSystem eps = new EmployeePayrollSystem();
        FullTimeEmployee emp1 = new FullTimeEmployee("Dhirendra", 1, 70000.0);
        PartTimeEmployee emp2 = new PartTimeEmployee("Neha", 2, 5000, 200);

        eps.addEmployee(emp1);
        eps.addEmployee(emp2);

        System.out.println("Initial Employee Details: ");
        eps.displayEmployee();

        System.out.println("Removing Employee...");
        eps.removeEmployee(2);

        System.out.println("Remaining Employees Details is: ");
        eps.displayEmployee();


        System.out.println("EXIT");
    }
}
