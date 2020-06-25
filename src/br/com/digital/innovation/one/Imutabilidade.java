package br.com.digital.innovation.one;

import java.util.function.UnaryOperator;

public class Imutabilidade {

	public static void main(String[] args) {
		
		int valor = 20;
		
		UnaryOperator<Integer> retornarDobro = (v) -> {
			// valor = 30; 	A expressao lambda nao permite a alteracao do valor original da variavel
			return v * 2;
		};
		
		System.out.println(retornarDobro.apply(valor)); // retorna o dobro: 40
		System.out.println(valor); 						// valor nao sera alterado: 20

	}

}
