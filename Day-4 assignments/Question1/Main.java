package com.LetsupgadeAssignments;

public class Main {

    public static void main(String[] args) {

	// write your code here
        avenger[] av=new avenger[5];
        for(int i=0;i<5;i++)
        {
            av[i]=new avenger();
            av[i].getDetails();

        }

        for(int i=0;i<5;i++)
        {
            av[i].displayDetails();

        }


    }
}
