package dados;

import java.io.Serializable;

/** Classe para criacao de objetos do tipo ItemVenda onde implementa a classe Serializable, com variaveis primitivos para o mesmo como ,
	* objeto do tipo Produto; Doublle precoUnitario; Int quantVenda; double valorVenda;
	*@author Tharyck Gusmao Metzker

*/

public class ItemVenda implements Serializable {
	private Produto produto;
	private double precoUnitario;
	private int quantVenda;
	private double valorVenda;
	
	/** Metodo Construtor com passagem de parametro para a criacao de objeto.
		*@param produto Objeto Produto
		*@param precoUnitario Preco individual por produto
		*@param quantVenda Quantidade de Vendas
		*@param valorVenda Valor da Venda.
	*/
	
	public ItemVenda(Produto produto, double precoUnitario, int quantVenda,
	double valorVenda) {
		
		
		this.produto = produto;
		this.precoUnitario = precoUnitario;
		this.quantVenda = quantVenda;
		this.valorVenda = valorVenda;
	}
	
	/** Metodo getProduto para captura de valor do objeto tipo Produto.
		*@return Retorno obejto do tipo Produto;
	*/
	
	public Produto getProduto() {
		return produto;
	}
	
	/** Metodo setProduto para setagem de Obejto do tipo produto no objeto.
		*@param produto objeto produto.
	*/
	
	public void setProduto(Produto produto) {
		this.produto = produto;
	}
	
	/** Metodo getPrecoUnitario para captura de valor da varivel do tipo double.
		*@return Retorno double ;
	*/
	public double getPrecoUnitario() {
		return precoUnitario;
	}
	
	/** Metodo setPrecoUnitario para setagem de valor para a variavel de tipo double.
		*@param precoUnitario Preco de produtos individuais.
	*/
	public void setPrecoUnitario(double precoUnitario) {
		this.precoUnitario = precoUnitario;
	}
	
	/** Metodo getQuantVenda para captura de valor da varivel do tipo int.
		*@return Retorno int ;
	*/
	public int getQuantVenda() {
		return quantVenda;
	}
	
	/** Metodo setQuantVenda para setagem de valor para a variavel de tipo int.
		*@param quantVenda Quantidade de vendas.
	*/
	public void setQuantVenda(int quantVenda) {
		this.quantVenda = quantVenda;
	}
	
	/** Metodo getValorVenda para captura de valor da varivel do tipo double.
		*@return Retorno double ;
	*/
	public double getValorVenda() {
		return valorVenda;
	}
	
	/** Metodo setValorVenda para setagem de valor para a variavel de tipo double.
		*@param valorVenda Valor Venda.
	*/
	public void setValorVenda(double valorVenda) {
		this.valorVenda = valorVenda;
	}
	
	/** Metodo toString Override do metodo principal para impressao dos dados alocados nas variaveis do objeto todos formatados.
	*/
	
	@Override
	public String toString() {
		return "ItemVenda [produto=" + produto + ", precoUnitario="
		+ precoUnitario + ", quantVenda=" + quantVenda
		+ ", valorVenda=" + valorVenda + "]";
	}
	
	
	
	
	
	
	
	
}
