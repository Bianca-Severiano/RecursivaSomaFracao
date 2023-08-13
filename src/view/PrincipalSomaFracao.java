package view;
import controller.ControllerSomaFracao;
import javax.swing.JOptionPane;

public class PrincipalSomaFracao {

	public static void main(String[] args) {
		double valor = 0;

		do {
			valor = Double.parseDouble(JOptionPane.showInputDialog("Digite um valor:"));
		} while (valor <= 0);
		
		ControllerSomaFracao sf = new ControllerSomaFracao();
		
		double res = sf.SomaFracao(valor);
		System.out.println(res);
	}

}
