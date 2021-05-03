package br.com.gamaacademy.exerciciosaula2204;


import java.util.Scanner;

public class NumEleitores {


	public static void main(String[] args) {
		
			
		Scanner scan = new Scanner(System.in); 
		System.out.println("Digite o número total de eleitores");
		int numEleitores = scan.nextInt();
		
		System.out.println("Digite o número total de votos brancos");
		int votosBrancos = scan.nextInt();
		
		System.out.println("Digite o número total de votos nulos");
		int votosNulos = scan.nextInt();
		
		int votosValidos = numEleitores - votosBrancos - votosNulos;
		System.out.println("O total de votos válidos é: " + votosValidos);
		
		double perVotosBrancos = ((double) votosBrancos/numEleitores) * 100;
		double perVotosNulos = ((double) votosNulos/numEleitores) * 100;
		double perVotosValidos = ((double) votosValidos/numEleitores) * 100;
		
			
		System.out.println("O percentual de votos brancos é: " + perVotosBrancos + " %");
		System.out.println("O percentual de votos nulos é: " + perVotosNulos + " %");
		System.out.println("O percentual de votos válidos é: " + perVotosValidos + " %");
		
	
	}

}
