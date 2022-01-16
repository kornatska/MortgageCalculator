package com.anastasiia;

import java.text.NumberFormat;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Principal: ");
        int p = scanner.nextInt();
        System.out.print("Annual Interest Rate: ");
        double i = scanner.nextDouble();
        System.out.print("Period (Years): ");
        int y = scanner.nextInt();
        double r = i / 12 / 100;
        int n = y * 12;
        double m = p * r * Math.pow((1 + r), n) / (Math.pow((1 + r), n) - 1);
        NumberFormat dol = NumberFormat.getCurrencyInstance();
        String mort = dol.format(m);
        System.out.println("Mortgage: " + mort);
    }
}