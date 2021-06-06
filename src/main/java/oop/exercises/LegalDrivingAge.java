/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Jacob DeBerry
 */
package oop.exercises;
import java.util.Scanner;

public class LegalDrivingAge
{
    public static void main( String[] args )
    {
        final int legalAge = 16;
        Scanner in = new Scanner(System.in);
        System.out.print("What is your age? ");
        String input = in.nextLine();
        int age = Integer.parseInt(input);
        String message = "";

        if(age < legalAge)
        {
            message = "You are not old enough to legally drive.";
        }
        else
        {
            message = "You are old enough to legally drive.";
        }

        System.out.println(message);
    }
}
