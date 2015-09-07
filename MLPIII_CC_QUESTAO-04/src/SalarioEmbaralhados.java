
public class SalarioEmbaralhados {
	private String informacao;
	private long numero, salarioFinal, salarioSalvo; 
	private int posicaoInicial, posicaoFinal, cont = 0, cont2 = 0;
	private boolean teste = true;
	public SalarioEmbaralhados(String informacao){
		this.informacao = informacao;
	}
	public long desembaralha(){
		for(int i=0; i<informacao.length(); i++){
			numero = Character.getNumericValue(informacao.charAt(i));	
			if(numero > -1 && numero < 10){
				if(teste){
					posicaoInicial = i;
					teste = false;
				}
				cont++;
			}else{
				if(cont>0){
					posicaoFinal = i;
					salarioSalvo = Integer.parseInt(informacao.substring(posicaoInicial,posicaoFinal));
					salarioFinal = salarioFinal + salarioSalvo;
					cont = 0; teste = true;
				}			
				cont2++;
			}		
		}
		if(cont2 == 0){
			salarioSalvo = Integer.parseInt(informacao.substring(posicaoInicial));
			salarioFinal = salarioFinal + salarioSalvo;
		}
		if(cont2 > 0 && cont > 0){
			salarioSalvo = Integer.parseInt(informacao.substring(posicaoInicial, posicaoFinal));
			salarioFinal = salarioFinal + salarioSalvo;
		}
		return salarioFinal;
	}
}
