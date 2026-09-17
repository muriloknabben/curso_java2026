package main.java.com.ex2.app;

import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //Faça um programa para ler dois valores inteiros, e depois mostrar na tela a soma desses números com uma mensagem explicativa

		int A, B, soma;

		A = sc.nextInt();
		B = sc.nextInt();

		soma = A + B;

		System.out.println("SOMA = " + soma);

        //Faça um programa para ler o valor do raio de um círculo, e depois mostrar o valor da área deste círculo com quatro casas decimais

        double R, C, pi = 3.14159;
	    
	    R = sc.nextDouble();

	    C = pi * R * R;

	    System.out.printf("C=%.4f%n", C);

        //azer um programa para ler quatro valores inteiros A, B, C e D. A seguir, calcule e mostre a diferença do produto de A e B pelo produto de C e D segundo a fórmula: DIFERENCA = (A * B - C * D)

        int D, E, F, G, dif;

	    D = sc.nextInt();
	    E = sc.nextInt();
	    F = sc.nextInt();
	    G = sc.nextInt();

	    dif = D * E - F * G;

	    System.out.println("DIFERENCA = " + dif);

        //Fazer um programa que leia o número de um funcionário, seu número de horas trabalhadas, o valor que recebe por hora e calcula o salário desse funcionário. A seguir, mostre o número e o salário do funcionário, com duas casas decimais.

        int numero, horas;
	    double valorHora, salario;

	    numero = sc.nextInt();
	    horas = sc.nextInt();
	    valorHora = sc.nextDouble();

	    salario = valorHora * horas;

	    System.out.println("NUMBER = " + numero);
	    System.out.printf("SALARY = U$ %.2f%n", salario);

        //Fazer um programa para ler o código de uma peça 1, o número de peças 1, o valor unitário de cada peça 1, o código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2. Calcule e mostre o valor a ser pago.

        int cod1, cod2, qte1, qte2;
	    double preco1, preco2, total;

	    cod1 = sc.nextInt();
	    qte1 = sc.nextInt();
	    preco1 = sc.nextDouble();
	    
	    cod2 = sc.nextInt();
	    qte2 = sc.nextInt();
	    preco2 = sc.nextDouble();

	    total = preco1 * qte1 + preco2 * qte2;

	    System.out.printf("VALOR A PAGAR: R$ %.2f%n", total);

        //Fazer um programa que leia três valores com ponto flutuante de dupla precisão: A, B e C. Em seguida, calcule e mostre:
        //a) a área do triângulo retângulo que tem A por base e C por altura.
        //b) a área do círculo de raio C. (pi = 3.14159)
        //c) a área do trapézio que tem A e B por bases e C por altura.
        //d) a área do quadrado que tem lado B.
        //e) a área do retângulo que tem lados A e B.

        double H, I, J, triangulo, circulo, trapezio, quadrado, retangulo;
		
		H = sc.nextDouble();
		I = sc.nextDouble();
		J = sc.nextDouble();
		
		triangulo = H * J / 2.0;
		circulo = 3.14159 * J * J;
		trapezio = (H + I) / 2.0 * J;
		quadrado = B * I;
		retangulo = H * I;
		
		System.out.printf("TRIANGULO: %.3f%n", triangulo);
		System.out.printf("CIRCULO: %.3f%n", circulo);
		System.out.printf("TRAPEZIO: %.3f%n", trapezio);
		System.out.printf("QUADRADO: %.3f%n", quadrado);
		System.out.printf("RETANGULO: %.3f%n", retangulo);

		sc.close();
    }
}
