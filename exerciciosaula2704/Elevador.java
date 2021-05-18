package br.com.gamaacademy.exerciciosaula2704;

import java.util.ArrayList;

public class Elevador {
	private int andarAtual;
	private int totalAndar;
	private int capacidade;
	private ArrayList<Pessoa> pessoas;
	
	public Elevador () {
	}
	
	public void iniciar(int totalAndar, int capacidade) {
		this.andarAtual = 0;
		this.totalAndar = totalAndar;
		this.capacidade = capacidade;
		
		this.pessoas = new ArrayList<Pessoa>(10);		
	}

	public void entrar(Pessoa n) {
		if(this.pessoas.size() >0 && this.pessoas.contains(n)) {
			pessoas.add(n);
		}
				
	}
	
	public void sair(Pessoa n) {
		if(this.pessoas.size() >0 && this.pessoas.contains(n)) {
			pessoas.remove(n);
		}
	}
	
	public void subir() {
		if(this.andarAtual<this.totalAndar) {
			this.andarAtual +=1;
		}
	}
	
	public void descer() {
		if(this.andarAtual>0) {
			this.andarAtual -=1;
		}
	}
	
	public int getAndarAtual() {
		return andarAtual;
	}
	
		
	public void setCapacidade(int capacidade) {
		this.capacidade = capacidade;
	}
	
	public ArrayList<Pessoa>getPessoas(){
		return pessoas;
	}
	
	public int getCapacidade() {
		return capacidade;
	}
	
	public void setPessoa(ArrayList<Pessoa>pessoas) {
		this.pessoas = pessoas;
	}
}

