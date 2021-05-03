package br.com.gamaacademy.exerciciosaula2204;

import java.util.Scanner;

public class AreaTriangulo {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Digite o valor da base do retângulo: ");
		double base = scan.nextDouble();
		
		System.out.println("Digite o valor da altura do retângulo");
		double altura = scan.nextDouble();
		
		double area = base * altura;
		
		System.out.println("A área do retângulo é: " + area + " m²");
		
	}

}
