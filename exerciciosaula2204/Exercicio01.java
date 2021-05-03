package br.com.gamaacademy.exerciciosaula2204;

public class Exercicio01 {

	public static void main(String[] args) {

		double a1 = (4 / 2) + (2 / 4);
		double a2 = 4 / 2 + 2 / 4;

		double b1 = 4 / (2 + 2) / 4;
		double b2 = 4 / 2 + 2 / 4;

		double c1 = (4 + 2) * 2 - 4;
		double c2 = 4 + 2 * 2 - 4;

		System.out.println("A: " + a1 + " " + a2);
		if (a1 == a2) {
			System.out.println("Valores Iguais");
		} else {
			System.out.println("Valores Diferentes");
		}

		System.out.println("B: " + b1 + " " + b2);
		if (b1 == b2) {
			System.out.println("Valores Iguais");
		} else {
			System.out.println("Valores Diferentes");
		}

		System.out.println("C: " + c1 + " " + c2);

		if (c1 == c2) {
			System.out.println("Valores Iguais");
		} else {
			System.out.println("Valores Diferentes");
		}

	}

}
