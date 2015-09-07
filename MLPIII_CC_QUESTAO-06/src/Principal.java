import javax.swing.JOptionPane;

public class Principal {
	private static double precoFita = 2.50;
	private static Fita fitaInfantil = new FitaInfantil();
	private static Fita fitaLancamento = new FitaLancamento();
	private static double total;
	
	public static double calculaPreco(Fita fita, double preco){
		return fita.preco(preco);
	}
	
	public static void main(String[] args) {
		
		int resposta = 0;
		do{
            try {
                resposta = Integer.parseInt(JOptionPane.showInputDialog("---------------Locadora-------------\nPRE�O PADR�O R$ "+precoFita+"0\nEscolha um tipo de fita para calcular o pre�o\n1. Fita Infantil\n2. Fita Lan�amento\n"));
            }catch(NumberFormatException e){
                JOptionPane.showMessageDialog(null, "Informe apenas n�meros");
            }
        }while (resposta < 1 || resposta > 2);			
		
		switch(resposta){
			case 1:
				total = calculaPreco(fitaInfantil, precoFita);
				JOptionPane.showMessageDialog(null, "Pre�o da fita: R$ "+total+"0");
				break;
			case 2:
				total = calculaPreco(fitaLancamento, precoFita);
				JOptionPane.showMessageDialog(null, "Pre�o da fita: R$ "+total+"0");
				break;
		}				
	}

}
