
public class Fatura {
	private String numero, descricao;
	private int qtde_item;
	private double preco_item;
	
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public int getQtde_item() {
		return qtde_item;
	}
	public void setQtde_item(int qtde_item) {
		this.qtde_item = qtde_item;
	}
	public double getPreco_item() {
		return preco_item;
	}
	public void setPreco_item(double preco_item) {
		this.preco_item = preco_item;
	}
	public double getValorFatura(){
		double total = 0;
		if(preco_item < 0)
			preco_item = 0.0;
		total = preco_item * qtde_item;
		if(total < 0)
			total = 0;
		return total;
	}
	
	
}
