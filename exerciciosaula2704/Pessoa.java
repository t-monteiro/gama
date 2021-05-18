package br.com.gamaacademy.exerciciosaula2704;

public class Pessoa {
	
	private String nome;
	private String dataNasc;
	private double altura;
	
	
	public Pessoa () {
		
	}
	
	public Pessoa (String nome, String dataNasc, double altura) {
		
		this.nome = nome;
		this.dataNasc = dataNasc;
		this.altura = altura;
		
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDataNasc() {
		return dataNasc;
	}

	public void setDataNasc(String dataNasc) {
		this.dataNasc = dataNasc;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	 

}
