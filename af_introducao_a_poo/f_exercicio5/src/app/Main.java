package app;

import java.util.Scanner;

import model.CurrencyConverter;

public class Main {

    static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("What is the dollar price? ");
        double dollarValue = sc.nextDouble();

        System.out.print("How many dollars will be bought? ");
        double quantity = sc.nextDouble();

        double reais = CurrencyConverter.amount(quantity, dollarValue);

        System.out.printf("Amount to be paid in reais = %.2f%n", reais);

        sc.close();

    }
}
