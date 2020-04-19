package com.company;
import com.sun.source.tree.SwitchTree;

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
        System.out.println("Rezultatul tuturor acestor adunari fara rost este " + sum3);
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
        System.out.println(div + "," + moo);

        //modulo
        int mod = 25;
        double res = mod % 4;
        int impart = 25 / 4;
        System.out.println(impart++ + res);

        //Incremet, decrement x+1 este simplificat ++x
        int incr = 59;
        ++incr;


        int decr = 44;
        --decr;
        System.out.println(incr + "," + decr);

        // prefix / postfix

        int x = 35;
        int y = ++x;
        int z = y--;
        System.out.println(x + ", " + y + ", " + z);

        //Assignment operators
        int num1 = 10;
        int num2 = 20;
        num2 += num1;
        System.out.println("Rezultatul numarului 2 este egal cu " + num2);

        //Asignment operators: reminder
        num2 /= num1;
        System.out.println(num2);

        //String

        String dumbo;
        dumbo = "dora";
        System.out.println("Cine este dumbo? Raspuns: " + dumbo);

        //String Concatenation
        String firstName, lastName;
        firstName = "Dumbo";
        lastName = "Dora";
        System.out.println("Numele ei este " + firstName + " " + lastName);

        // getting user input with scanner

        //create new scanner object
      /*  Scanner duumbo = new Scanner(System.in);
        System.out.println(duumbo.nextLine());
        */
        /*
        <<<<<<<<CONDITIONAL AND lOOPS>>>>>>>>>>
        <<<<<<<<<<>>>>>>>>>>>>>>>>>

         */
        //cONDITIONAL STATEMENTS, THE IF STATEMENT
        int xy = 7;
        if (xy <= 7) {
            System.out.println("x este mai mic sau egal");
        } else {
            System.out.println("x este mai mare");
        }

        //Nested IF Statements
        int age = 25;
        if (age > 0) {
            if (age > 16) {
                System.out.println("Varsta e corespunzatoare");
            } else {
                System.out.println("Esti prea tanar!");
            }
        } else {
            System.out.println("Error!");
        }

        //else if statements

        int xq = 25;
        if (xq <= 0) {
            System.out.println("X este x");
        } else if (xq >= 0) {
            System.out.println("x mai mare decat zero");
        } else if (x == 0) {
            System.out.println("daca x = zero");
        } else {
            System.out.println("Nu mai pot de la atatea if else");
        }

        // logical operators AND &&
        int xw = 20;
        if (xw >= 0 && xw <= 100) {
            System.out.println("Vladut e real!");
        }
        // OR ||
        int cars = 25;
        int money = 2500;
        if (cars >= 10 || money >= 50000) {
            System.out.println("George is rich!");
        }

        // NOT !()
        int varsta = 25;
        if (!(varsta == 25)) {
            System.out.println("Gerorge are 25 ani!");
        } else {
            System.out.println("Gerge nu are 25 ");
        }

        // The Switch statement
        int day = 2;
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            default:
                System.out.println("Weekdays");
        }

        // while loop statement. When the expression is tested and the result is false, the loop body is skipped and the first statement after the while loop is executed.
        int whi = 3;
        while (whi >= 0) {
            System.out.println(whi);
            whi--;
        }
        System.out.println("Loop ended.");

        /*for loops, Another loop structure is the for loop. A for loop allows you to efficiently write a loop that needs to execute a specific number of times.
        for (initialization; condition; increment/decrement) {
        statement(s)
        }
         */

    }
}
