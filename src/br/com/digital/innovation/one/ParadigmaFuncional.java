package br.com.digital.innovation.one;

public class ParadigmaFuncional {
	
	/*
	 * Paradigma funcional: defini-se um comportamento e um metodo para ser executado;
	 * Java é, por padrão, uma linguagem imperativa;
	 * 
	 * */

	public static void main(String[] args) {
		
		Calculo soma = (a, b) -> a + b;
		
		System.out.println(executaOperacao(soma, 1, 3));
		
	}
	
	public static int executaOperacao(Calculo calculo, int a, int b) {
		return calculo.calculo(a, b);
	}
	
}

interface Calculo {
	public int calculo(int a, int b);
}