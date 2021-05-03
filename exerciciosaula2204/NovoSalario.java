package br.com.gamaacademy.exerciciosaula2204;

import java.util.Scanner;

public class NovoSalario {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite a quantidade de carros vendidos");
		int carrosVendidos = scan.nextInt();
		
		System.out.println("Digite o valor total das vendas");
		double vendas = scan.nextDouble();
		
		System.out.println("Digite o salário");
		double salario = scan.nextDouble();
		
		System.out.println("Digite o valor da comissão fixa");
		double comissao = scan.nextDouble();
		
		double comissaoVendas = vendas/100 * 5;
		double totalComissao = comissao + comissaoVendas;
		
		double salarioTotal = salario + totalComissao;
		
		System.out.println("O salário total é = " + salarioTotal);
	


	}

}
