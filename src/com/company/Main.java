package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your test score: ");
        int score = scan.nextInt();
        char grade = 'F';//I'm not hopeful

        if (score > 89)
            grade = 'A';
        else if (score > 79)
            grade = 'B';
        else if (score > 69)
            grade = 'C';
        else
            grade = 'F';

        if (score > 69)
            System.out.println("Very good! You don't have to retake the exam!");
        else
            System.out.println("Did you even look at the book?");
            System.out.println("Your grade is " + grade);
    }
}
