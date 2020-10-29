package com.dcquiz;
import java.util.Scanner;

public class Player {
    Scanner sc=new Scanner(System.in);
    String name;
    int score;

    public void getDetails()
    {
        System.out.println("Welcome To Dc Comics Quiz App!!!");
        System.out.println("Please Enter Your Name to attempt the Quiz: ");
        name=sc.next();

    }



}
