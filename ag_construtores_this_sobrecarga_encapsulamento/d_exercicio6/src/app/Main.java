package app;

import model.Account;

import java.util.Scanner;

public class Main {

    static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Account account;

        System.out.print("Enter account number: ");
        int number = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter account holder: ");
        String name = sc.nextLine();

        System.out.print("Is there na initial deposit(y/n)? ");
        char answer = sc.next().charAt(0);

        if(answer == 'y') {
            System.out.print("Enter initial deposit value: ");
            double balance = sc.nextDouble();

            account = new Account(number, name, balance);
        } else {
            account = new Account(number, name);
        }

        System.out.println();

        System.out.println("Account data: ");
        System.out.println(account);

        System.out.println();

        System.out.print("Enter a deposit value: ");
        double depositValue = sc.nextDouble();
        account.deposit(depositValue);

        System.out.println("Updated account data:");
        System.out.println(account);

        System.out.println();

        System.out.print("Enter a withdraw value: ");
        double withdrawValue = sc.nextDouble();
        account.withdraw(withdrawValue);

        System.out.println("Updated account data:");
        System.out.println(account);

        sc.close();

    }
}
