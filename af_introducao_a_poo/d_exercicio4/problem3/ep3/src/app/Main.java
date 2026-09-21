package app;

import model.Student;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Student student = new Student();

        student.name = sc.nextLine();
        student.grade1 = sc.nextDouble();
        student.grade2 = sc.nextDouble();
        student.grade3 = sc.nextDouble();

        System.out.println("FINAL GRADE = " + student.finalGrade());

        if (student.finalGrade() < 60) {
            System.out.println("FAILED");
            System.out.println("MISSING " + student.missingPoints());
        } else {
            System.out.println("PASS");
        }

        sc.close();

    }
}
