package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	// write your code here
        /*
        adition,
        subtraction
        multiplicatiion
        division
        modulo
         */
    //ADITION
        int sum1 = 50 + 10;
        int sum2 = sum1 + 40;
        int sum3 = sum1 + sum2;
        System.out.println("Rezultatul tuturor acestor adunari fara rost este "+sum3);
        //substraction
        int subs = 50 - 30;
        System.out.println(subs);

        //multiplication
        int mult = 50 * 50;
        System.out.println(mult);

        //division
        int div = 51 / 5;
        double dub = 51 / 5;
        int moo = 51 / 5;
        System.out.println(div+","+moo);

        //modulo
        int mod = 25;
        double res = mod % 4;
        int impart = 25 / 4;
        System.out.println(impart ++ + res);

        //Incremet, decrement x+1 este simplificat ++x
        int incr = 59;
        ++incr;


        int decr = 44;
        --decr;
        System.out.println(incr +","+ decr);

        // prefix / postfix

        int x = 35;
        int y = ++x;
        int z = y--;
        System.out.println(x+", "+y+", "+z);

        //Assignment operators
        int num1 = 10;
        int num2 = 20;
        num2 += num1;
        System.out.println("Rezultatul numarului 2 este egal cu "+num2);

        //Asignment operators: reminder
        num2/=num1;
        System.out.println(num2);

        //String

        String dumbo;
        dumbo = "dora";
        System.out.println("Cine este dumbo? Raspuns: "+dumbo);

        //String Concatenation
        String firstName, lastName;
        firstName = "Dumbo";
        lastName = "Dora";
        System.out.println("Numele ei este "+firstName+" "+lastName);

        // getting user input with scanner

        //create new scanner object
        Scanner userInput = new Scanner (System.in);
        int end = 0;
        //find out what user wants to do with address book
        while (end != -1)
        {
            System.out.println("  ");
            System.out.println("  ");
            System.out.println("----------------------------");
            System.out.println("What would you like to do with your address book? ...");
            System.out.println("----------------------------");
            System.out.println("Add new         [Enter 1]");
            System.out.println("Delete existing [Enter 2]");
            System.out.println("Edit existing   [Enter 3]");
            System.out.println("Search for      [Enter 4]");
            System.out.println("EXIT            [Enter -1]");
            if (userInput.hasNext() && (userInput.nextInt() == 1))
            {
                AddressBookProcessor.addContact();
            }
            else if (userInput.hasNext() && userInput.nextInt() == 2)
            {
                AddressBookProcessor.deleteContact();
            }
            else if (userInput.hasNext() && userInput.nextInt() == 3)
            {
                AddressBookProcessor.editContact();
            }
            else if (userInput.hasNext() && userInput.nextInt() == 4)
            {
                AddressBookProcessor.findContact();
            }
            else if (userInput.nextInt() != 1 || userInput.nextInt() != 2
                    || userInput.nextInt() != 3 || userInput.nextInt() != -1)
            {
                System.out.println("Please enter a valid input");
                end = -1;
            }
        }

    }
    }
}
