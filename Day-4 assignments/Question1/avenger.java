package com.LetsupgadeAssignments;
import java.util.Scanner;

public class avenger {
    String name, power, weapon,planet;
    int age;

    Scanner sc=new Scanner(System.in);

    public void getDetails()
    {
        System.out.println("Enter Avenger's name: ");
        name = sc.next();

        System.out.println("Enter Age of Avenger: ");
        age = sc.nextInt();

        System.out.println("Enter power of Avenger: ");
        power = sc.next();

        System.out.println("Enter weapon of Avenger: ");
        weapon = sc.next();

        System.out.println("Enter the home planet of Avenger: ");
        planet = sc.next();

    }
    public void displayDetails()
    {
        System.out.println("The name of the Avenger is "+name+" , age is "+age+". "+name+"'s power is "+power+" and choice of weapon is "+weapon+". The avenger is from planet "+planet);


    }
}
