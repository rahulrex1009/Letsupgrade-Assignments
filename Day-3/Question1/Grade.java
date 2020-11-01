package com.LetsupgadeAssignments;
import java.util.Scanner;

public class Grade {

    int eng_marks, maths_marks, chemistry_marks, physics_marks, biology_marks;
    float total;
    float percentage;

    Scanner sc = new Scanner(System.in);

    public void grade() {

        System.out.println("Enter English marks: ");
        eng_marks = sc.nextInt();

        System.out.println("Enter Maths marks: ");
        maths_marks = sc.nextInt();

        System.out.println("Enter Chemistry marks: ");
        chemistry_marks = sc.nextInt();

        System.out.println("Enter Physics marks: ");
        physics_marks = sc.nextInt();

        System.out.println("Enter Biology marks: ");
        biology_marks = sc.nextInt();

        total = eng_marks + maths_marks + chemistry_marks + physics_marks + biology_marks;
        percentage = (total / 500) * 100;       /*each subject has total 100 marks so total marks of all subjects=500  */


        if (percentage < 35)
        {
            System.out.println("Total Marks Obtained: "+total);
            System.out.println("Total Marks of All Subjects: 500");
            System.out.println("Percentage Obtained: "+percentage+"%");
            System.out.println("The candidate has got D grade and failed.");

        }
        else if (percentage >= 35 && percentage < 50)
        {
            System.out.println("Total Marks Obtained: "+total);
            System.out.println("Total Marks of All Subjects: 500");
            System.out.println("Percentage Obtained: "+percentage+"%");
            System.out.println("The Candidate has obtained C Grade.");

        }
        else if (percentage >= 50 && percentage < 65)
        {
            System.out.println("Total Obtained Marks: "+total);
            System.out.println("Total Marks of All Subjects: 500");
            System.out.println("Percentage Obtained: "+percentage+"%");
            System.out.println("The Candidate has obtained B Grade.");

        }
        else if (percentage >= 65 && percentage < 80)
        {
            System.out.println("Total Marks Obtained: "+total);
            System.out.println("Total Marks of All Subjects: 500");
            System.out.println("Percentage Obtained: "+percentage+"%");
            System.out.println("The Candidate has obtained A Grade.");

        }
        else if (percentage >= 80)
        {
            System.out.println("Total Marks Obtained: "+total);
            System.out.println("Total Marks of All Subjects: 500");
            System.out.println("Percentage Obtained: "+percentage+"%");
            System.out.println("The Candidate has obtained Distinction Grade.");

        }
    }
}