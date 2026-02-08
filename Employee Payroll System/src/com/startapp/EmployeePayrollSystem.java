package com.startapp;

import java.util.ArrayList;

public class EmployeePayrollSystem {

    private final ArrayList<Employee> employeesList;

    public EmployeePayrollSystem() {
        employeesList = new ArrayList<>();
    }

    public void addEmployee(Employee employee){
        employeesList.add(employee);
    }

    public void removeEmployee(int id){
        Employee employeeToRemove = null;

        for(Employee employee : employeesList){
             if (employee.getId()==id){
                 employeeToRemove = employee;
                 break;
             }
        }
        if (employeeToRemove != null){
            employeesList.remove(employeeToRemove);
            System.out.println(employeeToRemove+"\nEmployee Removed Successfully!");
        }
    }

    public void displayEmployee(){
        for(Employee employee : employeesList){
            System.out.println(employee);
        }
    }
}
