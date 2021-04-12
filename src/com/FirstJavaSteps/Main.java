package com.FirstJavaSteps;

import java.text.NumberFormat;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        float   annualInterestRate;
        byte    period;
        long    principal;
        double  mortgage;
        float   monthlyRate;
        int     numberOfPayments;
        String  result;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Principal: ");
        principal = scanner.nextLong();
        System.out.print("Annual Interest Rate: ");
        annualInterestRate = (float) scanner.nextDouble();
        System.out.print("Period (Years): ");
        period = scanner.nextByte();

        // Calculates mortgage

        monthlyRate = ( annualInterestRate / 100 ) / 12;
        numberOfPayments = period * 12;
        mortgage =  ( principal * ( monthlyRate * ( Math.pow( 1 + monthlyRate, numberOfPayments ) /
                ( Math.pow( 1 + monthlyRate, numberOfPayments ) - 1 ))));

        //

        result = NumberFormat.getCurrencyInstance().format(mortgage);
        System.out.println("Mortgage: " + result);
    }
}
