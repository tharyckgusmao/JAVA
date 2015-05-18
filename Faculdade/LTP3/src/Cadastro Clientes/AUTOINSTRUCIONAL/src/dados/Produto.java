package dados;

import java.io.Serializable;
import java.util.GregorianCalendar;

import utilitarios.LtpUtil;

public class Produto implements Serializable{
	
	private static int sequence = 1;
	
	private int codigo;
	private String nome;
	private double precoUnitatio;
	private GregorianCalendar dataInclusao = new GregorianCalendar();
	private GregorianCalendar dataUltAlteracao = new GregorianCalendar();
	
	public Produto(String nome, double precoUnitatio,
			GregorianCalendar dataInclusao, GregorianCalendar dataUltAlteracao) {
		
		
		codigo = sequence++;
		this.nome = nome;
		this.precoUnitatio = precoUnitatio;
		this.dataInclusao = dataInclusao;
		this.dataUltAlteracao = dataUltAlteracao;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getPrecoUnitatio() {
		return precoUnitatio;
	}
	public void setPrecoUnitatio(double precoUnitatio) {
		this.precoUnitatio = precoUnitatio;
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
	

	public static void setSequence(int sequence) {
		Produto.sequence = sequence;
	}

	public int getCodigo() {
		return codigo;
	}

	@Override
	public String toString() {
		return "Produto [codigo=" + codigo + " \n nome=" + nome
				+ ",\n precoUnitatio=" + precoUnitatio + ",\n dataInclusao="
				+ LtpUtil.formatarData( dataInclusao, "dd/MM/yyyy hh:mm") + "\n  Data de alteração = " + LtpUtil.formatarData( dataUltAlteracao, "dd/MM/yyyy hh:mm");
	}


	
	
	
}
