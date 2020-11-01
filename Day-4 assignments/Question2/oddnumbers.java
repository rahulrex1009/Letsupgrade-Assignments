package com.LetsupgadeAssignments;
import java.util.Scanner;

public class oddnumbers {
    Scanner sc=new Scanner(System.in);

    int[] number=new int[5];
    public void getElements()
    {
        for(int i=0;i<5;i++)
        {
            System.out.println("Enter array elements: ");
            number[i]=sc.nextInt();
        }

    }
    public void oddElements()
    {
        System.out.println("Odd Numbers of Array:");
        for(int i=0;i<5;i++)
        {
            if(number[i]%2!=0)
            {
                System.out.println(number[i]);

            }

        }

    }
}
