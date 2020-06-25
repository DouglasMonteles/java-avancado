package br.com.digital.innovation.one;

public class Recursividade {
	
	/*
	 * Tail Call: 5! = 5 * 4 = 20
	 * 				  20 * 3 = 60
     * 				  60 * 2 = 120
     *				 120 * 1 = 120 
     * Memerization: armazenamento do cache do resultado da funcao, baseado nos parametros de entrada
	 * */

	public static void main(String[] args) {
		
		// fatorial(3) -> 3 * fatorial(2) -> 2 * fatorial(1) -> 1 
		//System.out.println(fatorial(3));
		
		// fatorial com tail call
		System.out.println(fatorialA(5));
		
	}
	
	// Fatorial recursivo
	/*
	 * fatorialA(5, 1);
	 * fatorialA(4, 5);
	 * fatorialA(3, 20);
	 * fatorialA(2, 60);
	 * fatorialA(1, 120);
	 * fatorialA(0, 120);
	 * */
	public static int fatorial(int value) {
		return (value == 1) ? value : value * fatorial((value - 1));
	}
	
	// Fatorial com Tail Call: Recursividade em cauda
	public static double fatorialA(double valor) {
		return fatorialComTailCall(valor, 1);
	}
	
	public static double fatorialComTailCall(double valor, double numero) {
		return (valor == 0) ? numero : fatorialComTailCall(valor-1, numero*valor);
	}

}
