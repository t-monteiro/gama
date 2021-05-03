package br.com.gamaacademy.exerciciosaula2204;

import java.util.Scanner;

public class CustoFinal {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Digite o custo de fábrica");

		double custoFabrica = scan.nextDouble();

		double custoDistribuidor = custoFabrica * 0.28;
		double custoImpostos = custoFabrica * 0.45;

		double custoTotal = custoDistribuidor + custoImpostos;
		double valorFinal = custoTotal + custoFabrica;

		System.out.println("O custo final é: " + valorFinal);

	}

}
