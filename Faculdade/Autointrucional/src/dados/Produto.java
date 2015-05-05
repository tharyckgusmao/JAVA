package dados;

import java.util.GregorianCalendar;

public class Produto {


	private int codigo = 0;
	private String nome;
private double precoUnitario;
	private GregorianCalendar dataInclusao;
	private GregorianCalendar dataUltAlteracao;
	
public Produto(String nome, double precoUnitario,GregorianCalendar dataInclusao,GregorianCalendar dataUltAlteracao){
		
		codigo++;
		
		
		this.nome = nome;
		this.precoUnitario = precoUnitario;
		this.dataInclusao = dataInclusao;
		this.dataUltAlteracao = dataUltAlteracao;
		
		
	}

public String getNome() {
	return nome;
}

public void setNome(String nome) {
	this.nome = nome;
}

public double getPrecoUnitario() {
	return precoUnitario;
}

public void setPrecoUnitario(double precoUnitario) {
	this.precoUnitario = precoUnitario;
}

public GregorianCalendar getDataInclusao() {
	return dataInclusao;
}

public void setDataInclusao(GregorianCalendar dataInclusao) {
	this.dataInclusao = dataInclusao;
}

public GregorianCalendar getDataUltAlteracao() {
	return dataUltAlteracao;
}

public void setDataUltAlteracao(GregorianCalendar dataUltAlteracao) {
	this.dataUltAlteracao = dataUltAlteracao;
}

	
public String toString(){
	return "\n Codigo :" + codigo + "Nome :"+ nome +"Preco Unitario :"+precoUnitario + "\n Data inclusao :" + dataInclusao + "\n Data Ultima ateraçao :" + dataUltAlteracao;
	
	
}

	
	
	
	
}
