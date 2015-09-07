
public class Carro {
	private String cor, modelo;
	private float velocidadeMax, velocidadeAtual;
	
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public float getVelocidadeMax() {
		return velocidadeMax;
	}
	public void setVelocidadeMax(float velocidadeMax) {
		this.velocidadeMax = velocidadeMax;
	}
	public float getVelocidadeAtual() {
		return velocidadeAtual;
	}
	public void setVelocidadeAtual(float velocidadeAtual) {
		this.velocidadeAtual = velocidadeAtual;
	}

	public boolean ligar(){
		return true;
	}
	public void acelerar(float acrescentaVeloc){
		velocidadeAtual = velocidadeAtual+acrescentaVeloc;
		if(velocidadeAtual>velocidadeMax)
			System.out.println("A velocidade Maxima foi excedida!!!");
	}
}
