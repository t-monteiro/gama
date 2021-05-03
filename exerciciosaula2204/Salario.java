package br.com.gamaacademy.exerciciosaula2204;

import java.util.Scanner;

public class Salario {

	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o valor do salário");
		double salario = scan.nextDouble();
		
		System.out.println("Digite o valor do percentual de reajuste (%)");
		double reajuste = scan.nextDouble();
		
		double salarioNovo = salario + salario*reajuste/100;
		
		System.out.println("O salário atual é: " + salarioNovo);
		
		
				

	}

}
