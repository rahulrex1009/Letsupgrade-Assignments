package com.day2;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Employee e1=new Employee();
        Employee e2= new Employee();

        e1.name="Rahul";
        e1.age=22;
        e1.city="Navi Mumbai";

        e2.name="Ravi";
        e2.age=23;
        e2.city="Pune";

        e1.display();
        e2.display();
    }
}
