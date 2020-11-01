package com.LetsupgadeAssignments;
import java.util.Scanner;

public class AddElements {
    int[] arr=new int[5];
    int sum=0;
    Scanner sc=new Scanner(System.in);

    public void arrElements()
    {
        System.out.println("Enter Elements of Array:");
        for(int i=0;i<5;i++)
        {
            arr[i]=sc.nextInt();
            sum=sum + arr[i];

        }
        System.out.println("The Sum of all the elements of Array is:"+sum);

    }

}
