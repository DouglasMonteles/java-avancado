package br.com.digital.innovation.one;

import java.util.Arrays;

public class ComposicaoDeFuncoes {

	public static void main(String[] args) {
		int[] valores = {1, 2 , 3, 4, 5};
		
		// Funcional: Interpreta em tempo de execucao
		Arrays.stream(valores)								
			.filter(numero -> numero % 2 == 0)  			// filtra o array com base na expressao
			.map(numero -> numero * 2)						// altera a lista atual com base na expressao
			.forEach(numero -> System.out.println(numero)); // percorre a lista, aplicando a expressao
		
		// Imperativo: Informar passo a passo do procedimento
		for (int i = 0; i < valores.length; i++) {
			int valor;
			valor = (valores[i] % 2 == 0) ? valores[i] : 0;
			
			if (valor != 0)
				System.out.println(valor * 2);
		}
	}
	
}
