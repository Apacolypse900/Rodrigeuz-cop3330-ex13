package com.examples;
/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Jesus Rodriguez
 */
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner myObj = new Scanner(System.in);

        int Principal;
        double AnnualRateofInterest;
            double AnnualRateofInterestPercentage;
        int years;
        int CompoundedperYear;
        double total;
        double rounded;

        System.out.print("What is the principal amount? ");
            Principal = myObj.nextInt();

        System.out.print("What is the rate? ");
            AnnualRateofInterest = myObj.nextDouble();

        System.out.print("What is the number of years? ");
            years = myObj.nextInt();

        System.out.print("What is the number of times teh interest is compounded per year? ");
            CompoundedperYear = myObj.nextInt();

        AnnualRateofInterestPercentage = AnnualRateofInterest/100;
        total = Principal * Math.pow((1 + AnnualRateofInterestPercentage / CompoundedperYear),(CompoundedperYear * years));
        rounded = Math.round(total * 100) / 100.0;
        System.out.print("$" + Principal + " invested at " + AnnualRateofInterest + "% for " + years + " years compounded " + CompoundedperYear + " times per year is $" + rounded );
    }
}
