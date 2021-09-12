package org.example;


import java.util.Scanner;

public class App
{
    public static void main( String[] args )
    {
        Scanner input1 = new Scanner(System.in);
        System.out.println("Enter the number of the month: ");
        int month = input1.nextInt();

        if(month == 1){
            System.out.println("The 1st month is January.");
        }
        else if(month == 2){
            System.out.println("The 2nd month is February.");
    }
        else if(month == 3){
            System.out.println("The 3rd month is March.");
        }
        else if(month == 4){
            System.out.println("The 4th month is April.");
        }
        else if(month == 5){
            System.out.println("The 5th month is May.");
        }
        else if(month == 6){
            System.out.println("The 6th month is June.");
        }
        else if(month == 7){
            System.out.println("The 7th month is July.");
        }
        else if(month == 8){
            System.out.println("The 8th month is August.");
        }
        else if(month == 9){
            System.out.println("The 9th month is September.");
        }
        else if(month == 10){
            System.out.println("The 10th month is October.");
        }
        else if(month == 11){
            System.out.println("The 11th month is November.");
        }
        else if(month == 12){
            System.out.println("The 12th month is December.");
        }
    }
}
