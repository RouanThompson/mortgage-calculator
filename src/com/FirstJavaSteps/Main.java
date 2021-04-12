package com.FirstJavaSteps;

import java.text.NumberFormat;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        final byte MONTHS_IN_YEAR = 12;
        final byte PERCENT = 100;
        float   annualInterest;
        byte    period;
        long    principal;
        double  mortgage;
        float   monthlyInterest;
        int     numberOfPayments;
        String  mortgageFormatted;
        Scanner scanner = new Scanner(System.in);

        // Prompts

        System.out.print("Principal: ");
        principal = scanner.nextLong();
        System.out.print("Annual Interest Rate: ");
        annualInterest = scanner.nextFloat();
        System.out.print("Period (Years): ");
        period = scanner.nextByte();

        // Calculates mortgage

        monthlyInterest = annualInterest / PERCENT / MONTHS_IN_YEAR;
        numberOfPayments = period * MONTHS_IN_YEAR;
        mortgage = principal
                * ( monthlyInterest * Math.pow( 1 + monthlyInterest, numberOfPayments ) /
                ( Math.pow( 1 + monthlyInterest, numberOfPayments ) - 1 ));

        // Displays Mortgage

        mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage);
        System.out.println("Mortgage: " + mortgageFormatted);
    }
}
