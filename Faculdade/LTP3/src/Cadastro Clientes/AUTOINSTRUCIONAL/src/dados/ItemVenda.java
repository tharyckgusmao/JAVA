package dados;

import java.io.Serializable;

/** Classe para criacao de objetos do tipo ItemVenda onde implementa a classe Serializable, com variaveis primitivos para o mesmo como ,
	* objeto do tipo Produto; Doublle precoUnitario; Int quantVenda; double valorVenda;
	*@author Tharyck Gusmao Metzker
	*@param 
	*@return
*/

public class ItemVenda implements Serializable {
	private Produto produto;
	private double precoUnitario;
	private int quantVenda;
	private double valorVenda;
	
	/** Metodo Construtor com passagem de parametro para a criacao de objeto.
		*@author Tharyck Gusmao Metzker.
		*@param Produto , double , int , double.
		*@return nao ha retono para o metodo construtor.
	*/
	
	public ItemVenda(Produto produto, double precoUnitario, int quantVenda,
	double valorVenda) {
		
		
		this.produto = produto;
		this.precoUnitario = precoUnitario;
		this.quantVenda = quantVenda;
		this.valorVenda = valorVenda;
	}
	
	/** Metodo getProduto para captura de valor do objeto tipo Produto.
		*@author Tharyck Gusmao Metzker.
		*@param Nao a passagem de paramentro.
		*@return Retorno obejto do tipo Produto;
	*/
	
	public Produto getProduto() {
		return produto;
	}
	
	/** Metodo setProduto para setagem de Obejto do tipo produto no objeto.
		*@author Tharyck Gusmao Metzker.
		*@param Produto.
		*@return metodo void sem retorno;
	*/
	
	public void setProduto(Produto produto) {
		this.produto = produto;
	}
	
	/** Metodo getPrecoUnitario para captura de valor da varivel do tipo double.
		*@author Tharyck Gusmao Metzker.
		*@param Nao a passagem de paramentro.
		*@return Retorno double ;
	*/
	public double getPrecoUnitario() {
		return precoUnitario;
	}
	
	/** Metodo setPrecoUnitario para setagem de valor para a variavel de tipo double.
		*@author Tharyck Gusmao Metzker.
		*@param double.
		*@return metodo void sem retorno;
	*/
	public void setPrecoUnitario(double precoUnitario) {
		this.precoUnitario = precoUnitario;
	}
	
	/** Metodo getQuantVenda para captura de valor da varivel do tipo int.
		*@author Tharyck Gusmao Metzker.
		*@param Nao a passagem de paramentro.
		*@return Retorno int ;
	*/
	public int getQuantVenda() {
		return quantVenda;
	}
	
	/** Metodo setQuantVenda para setagem de valor para a variavel de tipo int.
		*@author Tharyck Gusmao Metzker.
		*@param int.
		*@return metodo void sem retorno;
	*/
	public void setQuantVenda(int quantVenda) {
		this.quantVenda = quantVenda;
	}
	
	/** Metodo getValorVenda para captura de valor da varivel do tipo double.
		*@author Tharyck Gusmao Metzker.
		*@param Nao a passagem de paramentro.
		*@return Retorno double ;
	*/
	public double getValorVenda() {
		return valorVenda;
	}
	
	/** Metodo setValorVenda para setagem de valor para a variavel de tipo double.
		*@author Tharyck Gusmao Metzker.
		*@param double.
		*@return metodo void sem retorno;
	*/
	public void setValorVenda(double valorVenda) {
		this.valorVenda = valorVenda;
	}
	
	/** Metodo toString Override do metodo principal para impressao dos dados alocados nas variaveis do objeto todos formatados.
		*@author Tharyck Gusmao Metzker.
		*@param 
		*@return metodo void sem retorno;
	*/
	
	@Override
	public String toString() {
		return "ItemVenda [produto=" + produto + ", precoUnitario="
		+ precoUnitario + ", quantVenda=" + quantVenda
		+ ", valorVenda=" + valorVenda + "]";
	}
	
	
	
	
	
	
	
	
}
