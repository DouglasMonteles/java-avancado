package br.com.digital.innovation.one;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.stream.Collectors;

public class InferenciaExemplo {
	
	/*
	 * Consegue:
	 * variaveis locais inicializadas;
	 * variavel suporte do forEach (var i : numeros);
	 * variavel do for interativo;
	 * variavel try com resource;
	 * 
	 * Nao consegue:
	 * O var nao é utilizavel em nivel de classe;
	 * O var nao pode ser utilizado com parametro;
	 * O var nao pode ser utilizado em variaveis locais nao inicializadas;
	 * */

	public static void main(String[] args) throws Exception {
		connectAndPrintURLJavaOracle();
	}
	
	private static void connectAndPrintURLJavaOracle() throws IOException {
		var url = new URL("https://docs.oracle.com/javase/10/language/");
		var urlConnection = url.openConnection();
		var bufferedReader = new BufferedReader(new InputStreamReader(urlConnection.getInputStream()));
		
		System.out.println(bufferedReader.lines().collect(Collectors.joining()).replaceAll(">", ">\n"));
	}
	
	public static void testar(String nome) {
		System.out.println(nome);
	}

}
