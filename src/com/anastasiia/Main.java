package com.anastasiia;

import java.text.NumberFormat;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Principal: ");
        String principal = scanner.nextLine();
        int p = Integer.parseInt(principal);
        System.out.print("Annual Interest Rate: ");
        String interest = scanner.nextLine();
        double i = Double.parseDouble(interest);
        System.out.print("Period (Years): ");
        String period = scanner.nextLine();
        int y = Integer.parseInt(period);
        double r = i / 12 / 100;
        int n = y * 12;
        double m = p * r * Math.pow((1 + r), n) / (Math.pow((1 + r), n) - 1);
        NumberFormat dol = NumberFormat.getCurrencyInstance();
        String mort = dol.format(m);
        System.out.println("Mortgage: " + mort);
    }
}












