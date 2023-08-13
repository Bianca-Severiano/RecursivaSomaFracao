package controller;

public class ControllerSomaFracao {

	public ControllerSomaFracao() {
		super();
	}
	
	public double SomaFracao(double valor) {
		double soma=0;
		// Quando valor da sequência for 1 retornar o próprio 
		if(valor == 1) {
			return 1;
		} else {
			soma = 1/valor + SomaFracao(valor-1);
			return soma;
		}
	}
}

/*
 * f(4) = 1/4 + f(3)
 * f(3) = 1/3 + f(2)
 * f(2) = 1/2 + f(1)
 * f(1) = 1 <-- PARADA
 */
