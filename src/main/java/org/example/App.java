package org.example;

/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solutions
 *  Copyright 2021 Chad Higgins
 */

/*
Many programs display information to the end user in one form but use a different form inside the program.
For example, you may show the word Blue on the screen, but behind the scenes you’ll have a numerical value
for that color or an internal value because you may need to represent the textual description in another language
for Spanish-speaking visitors.

Write a program that converts a number from 1 to 12 to the corresponding month.
Prompt for a number and display the corresponding calendar month, with 1 being January and 12 being December.
For any value outside that range, display an appropriate error message.

Example Output
Please enter the number of the month: 3
The name of the month is March.

Constraints
Use a switch or case statement for this program.
Use a single output statement for this program.
 */

import java.util.Scanner;

public class App
{
    public static void main( String[] args )
    {
        Scanner in = new Scanner(System.in);

        System.out.println("Please enter the number of the month:");
        int numMonth = in.nextInt();
        String thatMonth;

        switch(numMonth)
        {
            case 1:
                thatMonth = "January";
                break;

            case 2:
                thatMonth = "February";
                break;

            case 3:
                thatMonth = "March";
                break;

            case 4:
                thatMonth = "April";
                break;

            case 5:
                thatMonth = "May";
                break;

            case 6:
                thatMonth = "June";
                break;

            case 7:
                thatMonth = "July";
                break;

            case 8:
                thatMonth = "August";
                break;

            case 9:
                thatMonth = "September";
                break;

            case 10:
                thatMonth = "October";
                break;

            case 11:
                thatMonth = "November";
                break;

            case 12:
                thatMonth = "December";
                break;


            default:
                throw new IllegalStateException("Unexpected value: " + numMonth);
        }

        System.out.println("The name of the month is "+thatMonth);

    }
}
