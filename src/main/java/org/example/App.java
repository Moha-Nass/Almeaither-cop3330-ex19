package org.example;

import java.util.Scanner;

/*
 * UCF COP3330 Fall 2021 Assignment 1 Solution
 * Copyright 2021 Mohammed_Almeaither
 */
public class App 
{
    public static void main( String[] args )
    {

        System.out.println("Exercise 19 - BMI Calculator");
        double weightt, height, bmi;
        System.out.print("Enter wight: ");
        Scanner in = new Scanner(System.in);
        weightt = Double.parseDouble(in.next());

        System.out.print("Enter height: ");
        height = Double.parseDouble(in.next());

        bmi = (weightt/(height*height)) *703.0;

        System.out.print("You BMI is "+ bmi);
        if(bmi>=18.5 & bmi<=25)
        {
            System.out.print("You are within the ideal weight range");
        }
        else if(bmi>25)
            System.out.print("You are overweight. You should see your doctor. ");

    }
}
