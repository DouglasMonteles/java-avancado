package br.com.digital.innovation.one;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Interacoes {

	public static void main(String[] args) {
		
		//String[] nomes = {"Joao", "Lucas", "Gustavo", "Alex", "Caio", "Joao"};
		Integer[] numeros = {1, 2, 3, 4, 5};
		
		//imprimirNomesFiltrados(nomes);
		imprimirDobroDosNumeros(numeros);
		
	}
	
	public static void imprimirNomesFiltrados(String... nomes) {
		/*String nomesParaImprimir = "";
		
		for (int i = 0; i < nomes.length; i++) {
			if (nomes[i].equals("Joao")) {
				nomesParaImprimir += nomes[i];
			}
		}
		
		System.out.println(nomesParaImprimir);*/
		
		String NOMES = Stream.of(nomes)
			.filter(nome -> nome.equals("Joao"))
			.collect(Collectors.joining(", "));  // joining() - pega um array de String e transforma em uma unica String
	
		System.out.println(NOMES);
	}
	
	public static void imprimirDobroDosNumeros(Integer... numeros) {
		
		Stream.of(numeros)
			.map(numero -> numero * 2)
			.forEach(System.out::println);
		
	}

}
