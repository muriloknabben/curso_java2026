package app;

import model.Person;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);
        
        System.out.print("How many people will be typed? ");
        int n = sc.nextInt();

        Person[] vect = new Person[n];

        for (int i = 0; i < vect.length; i++) {
            System.out.printf("Data of person %d: \n", i + 1);

            System.out.print("Name: ");
            String name = sc.next();

            System.out.print("Age: ");
            int age = sc.nextInt();

            System.out.print("Height: ");
            double height = sc.nextDouble();

            vect[i] = new Person(name, age, height);
        }

        double percentageSum = 0.0;

        double avgSum = 0.0;

        for (int i = 0; i < vect.length; i++) {
            avgSum += vect[i].getHeight();
            if (vect[i].getAge() < 16) {
                percentageSum ++;
            }
        }

        double avg = avgSum / vect.length;

        double percentage = percentageSum / vect.length * 100;

        System.out.println();

        System.out.printf("Average height: %.2f%n", avg);
        System.out.printf("People under 16: %.1f%%\n", percentage);
        for (int i = 0; i < vect.length; i++) {
            if (vect[i].getAge() < 16) {
                System.out.println(vect[i].getName());
            }
        }

        sc.close();

    }
}
