package br.com.gamaacademy.exerciciosaula2204;

import java.util.Scanner;

public class Antecessor {

	public static void main(String[] args) {
	
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Digite um valor: ");
		
		int valorEntrada = scan.nextInt();
		int valorAnterior = valorEntrada -1;
		
		System.out.println("O valor anterior é " + valorAnterior);
		

	}

}
