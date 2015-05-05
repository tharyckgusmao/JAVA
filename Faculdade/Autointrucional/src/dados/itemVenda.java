package dados;

public class itemVenda {
	
	private Produto produto;
	private double precoUnitario;
	private int quantVenda;
	private double valorVenda;
	
	public itemVenda(Produto produto,double precoUnitario,int quantVenda,double valorVenda) {

	
	this.produto = produto;
	this.precoUnitario = precoUnitario;
	this.quantVenda = quantVenda;
	this.valorVenda = valorVenda;
		
		
		
		
		
		
	}

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}

	public double getPrecoUnitario() {
		return precoUnitario;
	}

	public void setPrecoUnitario(double precoUnitario) {
		this.precoUnitario = precoUnitario;
	}

	public int getQuantVenda() {
		return quantVenda;
	}

	public void setQuantVenda(int quantVenda) {
		this.quantVenda = quantVenda;
	}

	public double getValorVenda() {
		return valorVenda;
	}

	public void setValorVenda(double valorVenda) {
		this.valorVenda = valorVenda;
	}

	@Override
	public String toString() {
		return "itemVenda [Produto :" + produto + ", Preco Unitario :"
				+ precoUnitario + ", Quantidade Venda :" + quantVenda
				+ ", Valor Venda :" + valorVenda + "]";
	}
	
	
	
	
	
	
	
}
