package br.com.digital.innovation.one;

import java.util.function.Consumer;

public class Consumidores {

	/*
	 * Utiliza o parametro da forma que ele foi recebido;
	 * */
	
	public static void main(String[] args) {
		
		Consumer<String> imprimirUmaFrase = System.out::println;
		Consumer<String> imprimirOutraFrase = frase -> System.out.println(frase);
		
		imprimirUmaFrase.accept("Hello World");
		imprimirOutraFrase.accept("Ola Mundo");
		
	}

}
