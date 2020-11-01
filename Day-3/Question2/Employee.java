package com.LetsupgadeAssignments;
import java.util.Scanner;
public class Employee {

    Scanner sc = new Scanner(System.in);
    String name, month_of_birth;
    int date_of_birth, year_of_birth;
    int age;
    double tax_amount,monthly_salary, annual_salary;


    public void getDetails()
    {
        System.out.println("Enter Employee Name: ");
        name = sc.nextLine();

        System.out.println("Enter Monthly Salary of Employee: ");
        monthly_salary = sc.nextInt();

        System.out.println("Enter date of Birth: ");
        date_of_birth = sc.nextInt();

        System.out.println("Enter month of Birth: ");
        month_of_birth = sc.next();

        System.out.println("Enter year of Birth: ");
        year_of_birth = sc.nextInt();
        if(year_of_birth>2020)
        {
            System.out.println("Please Enter Correct year: ");
            year_of_birth=sc.nextInt();
        }
    }

    public void EmployeeDetails()
    {
        annual_salary = monthly_salary * 12;
        age = 2020 - year_of_birth;

        if (annual_salary >= 500000)
        {
            tax_amount = 0.2 * annual_salary;

            System.out.println("Name is " + name);
            System.out.println("Age is " + age);
            System.out.println("Monthly Salary is "+monthly_salary);
            System.out.println("Annual salary is: " + annual_salary);
            System.out.println("Tax amount is " + tax_amount);

        }

        if (annual_salary >= 400000 && annual_salary<500000)
        {
            tax_amount = 0.15 * annual_salary;

            System.out.println("Name is :" + name);
            System.out.println("Age is " + age);
            System.out.println("Monthly Salary is "+monthly_salary);
            System.out.println("Annual salary is: " + annual_salary);
            System.out.println("Tax amount is " + tax_amount);

        }

        if (annual_salary >= 300000 && annual_salary<400000)
        {
            tax_amount = 0.1 * annual_salary;

            System.out.println("Name is :" + name);
            System.out.println("Age is " + age);
            System.out.println("Monthly Salary is "+monthly_salary);
            System.out.println("Annual salary is: " + annual_salary);
            System.out.println("Tax amount is " + tax_amount);

        }

        if (annual_salary >= 200000 && annual_salary<300000)
        {
            tax_amount = 0.05 * annual_salary;

            System.out.println("Name is :" + name);
            System.out.println("Age is " + age);
            System.out.println("Monthly Salary is "+monthly_salary);
            System.out.println("Annual salary is: " + annual_salary);
            System.out.println("Tax amount is " + tax_amount);

        }

        if (annual_salary <200000)
        {
            tax_amount = 0;

            System.out.println("Name is :" + name);
            System.out.println("Age is " + age);
            System.out.println("Monthly Salary is "+monthly_salary);
            System.out.println("Annual salary is: " + annual_salary);
            System.out.println("No tax for annual salary of less than 2 Lakh");

        }
    }

}