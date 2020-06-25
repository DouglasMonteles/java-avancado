package br.com.digital.innovation.one;

public class Lambda {

	/*
	 * Lambda: Apenas se aplicam a classes que possuem interface funcional
	 * Interface funcional: Deve possuir apenas um metodo abstrato
	 * Função anônima: mesma função da lambda, porem com mais verbosidade, o que dificulta a manutenção
	 * */
	
	/*
	 * Funcao anonima
	public static void main(String[] args) {
		Funcao1 colocarPrefixoSrNaString = new Funcao1() {
			@Override
			public String gerar(String valor) {
				return "Sr. " + valor;
			}	
		};
		System.out.println(colocarPrefixoSrNaString.gerar("Douglas"));
	}
	*/
	
	public static void main(String[] args) {
		Funcao1 colocarPrefixoSrNaString = valor -> "Sr. " + valor;
		System.out.println(colocarPrefixoSrNaString.gerar("Douglas"));
	}

}

@FunctionalInterface // protegendo a interface, para que a implementacao nao seja alterada
interface Funcao1 {
	String gerar(String valor);
}
