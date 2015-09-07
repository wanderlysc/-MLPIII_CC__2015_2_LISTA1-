
public class ValorDaLocacao {
	private float valorDaLocacao;
	
	public float calculaValorLocacao(float kmInicial, float kmFinal, float valorKmRodado){
		valorDaLocacao = (kmFinal - kmInicial) * valorKmRodado;
		return valorDaLocacao;
	}
}
