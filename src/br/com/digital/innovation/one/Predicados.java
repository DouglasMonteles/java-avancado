package br.com.digital.innovation.one;

import java.util.function.Predicate;

public class Predicados {

	public static void main(String[] args) {
		
		Predicate<String> estaVazio = String::isEmpty; // referencia de metodo
		
		System.out.println(estaVazio.test(""));
		System.out.println(estaVazio.test("Joao"));

	}

}
