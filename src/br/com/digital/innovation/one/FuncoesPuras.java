package br.com.digital.innovation.one;

import java.util.function.BiPredicate;

public class FuncoesPuras {
	
	/*
	 * Funcoes puras: sempre retornam o mesmo valor, independente do numero de execucoes
	 * */

	public static void main(String[] args) {
		
		// recebe o resultado da expresao lambda
		BiPredicate<Integer, Integer> verificaSeEMaior = 
				(parametro, valorComparacao) -> (parametro > valorComparacao);
				
		// Compara o primeiro valor em relacao ao segundo
		System.out.println(verificaSeEMaior.test(13, 12));
		System.out.println(verificaSeEMaior.test(13, 12));

	}

}
