package main.java.com.erdw.app;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        char resp;

        do {
            System.out.print("Digite a temperatura em celsius: ");
            double C = sc.nextDouble();

            double F = 9.0 * C / 5.0 +32.0;

            System.out.printf("Equivalente em fahrenheit: %.2f%n", F);

            System.out.print("Deseja repetir (s/n)?");
            resp = sc.next().charAt(0);
        } while (resp != 'n');

        sc.close();

    }
}
