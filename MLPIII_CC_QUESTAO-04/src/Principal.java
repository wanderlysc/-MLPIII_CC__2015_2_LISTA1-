import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		String dados;
		StringBuilder informacao;
		long salarioRecuperado;
		
		dados = JOptionPane.showInputDialog("Informe o texto embaralhado para recuperar o salario");
		informacao = new StringBuilder(dados);
		informacao.insert(dados.length(), "z");//adicionando sempre um caracter no final para que nao ocorra exception de numberformat 		
		salarioRecuperado = new SalarioEmbaralhados(informacao.toString()).desembaralha();
		
		JOptionPane.showMessageDialog(null, "Salario Recuperado: R$ "+salarioRecuperado+",00");
	}
}
