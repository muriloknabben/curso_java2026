package main.java.com.ep2.app;

import java.util.Scanner;

import main.java.com.ep2.model.Employee;

public class Main {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        Employee employee = new Employee();

        System.out.print("Name: ");
        employee.name = sc.nextLine();

        System.out.print("Gross salary: ");
        employee.grossSalary = sc.nextDouble();

        System.out.print("Tax: ");
        employee.tax = sc.nextDouble();

        System.out.println();

        System.out.println("Employee: " + employee);

        System.out.println();

        System.out.print("Which percentage to increase salary? ");
        double percentage = sc.nextDouble();
        employee.increaseSalary(percentage);

        System.out.println();

        System.out.println("Updated data: " + employee);

        sc.close();

    }
}
