package br.com.digital.innovation.one.async_sync;

import java.util.function.Function;

public class InferenciaLambda {

	public static void main(String[] args) {
		
		Function<Integer, Double> divisaoPorDois = (var numero) -> numero / 2D;
		
		System.out.println(divisaoPorDois.apply(2));

	}

}
