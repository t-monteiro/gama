package br.com.gamaacademy.exerciciosaula2204;

import java.util.Scanner;

public class Idade {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite sua idade: ");
		int anos = scan.nextInt();
		
		System.out.println("Digite os meses: ");
		int mes = scan.nextInt();
		
		System.out.println("Digite os dias: ");
		int dias = scan.nextInt();
				
		dias += (anos*365) + (mes*30); 
		
		System.out.println("A sua idade em dias é: " + dias);
		

	}

}
