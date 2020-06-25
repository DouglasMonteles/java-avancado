package br.com.digital.innovation.one;

public class FuncaoDeAltaOrdem {

	/*
	 * Função de alta ordem: retorna uma função ou recebe uma função como parâmetro
	 * */
	
	public static void main(String[] args) {
		
		Operacoes soma = (a, b) -> a + b;
		Operacoes sub = (a, b) -> a - b;
		Operacoes mult = (a, b) -> a * b;
		Operacoes div = (a, b) -> a / b;
		
		System.out.println(executaOperacao(soma, 1, 3));
		System.out.println(executaOperacao(sub, 6, 3));
		System.out.println(executaOperacao(mult, 3, 3));
		System.out.println(executaOperacao(div, 4, 2));

	}
	
	public static int executaOperacao(Operacoes calculo, int a, int b) {
		return calculo.calcular(a, b);
	}

}

@FunctionalInterface
interface Operacoes {
	public int calcular(int a, int b);
}