package com.dcquiz;
import java.util.Scanner;

public class Questions {

    Scanner sc=new Scanner(System.in);
    String question,option1,option2,option3,option4;
    int correctAns,userAns;

    public boolean askQuestion()
    {
        System.out.println(question);
        System.out.println("1. "+option1);
        System.out.println("2. "+option2);
        System.out.println("3. "+option3);
        System.out.println("4. "+option4);
        System.out.println("please choose an option number!");
        userAns=sc.nextInt();
        if(userAns==correctAns)
        {
            return true;
        }
        return false;
    }
}
