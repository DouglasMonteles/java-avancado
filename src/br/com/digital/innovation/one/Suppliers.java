package br.com.digital.innovation.one;

import java.util.function.Supplier;

public class Suppliers {

	/*
	 * Supridores: nao recebem parametro e retornam o tipo especificado no Generics
	 * */
	
	public static void main(String[] args) {
		
		Supplier<Pessoa> suppliers = () -> new Pessoa("Joao", 23); // ou Pessoa::new;
		
		System.out.println(suppliers.get());

	}

}

class Pessoa {
	
	String nome;
	Integer idade;
	
	public Pessoa(String nome, Integer idade) {
		super();
		this.nome = nome;
		this.idade = idade;
	}
	
	@Override
	public String toString() {
		return String.format("Nome: %s, Idade: %d", nome, idade);
	}
	
}