package dados;

import java.io.Serializable;
import java.util.GregorianCalendar;

import utilitarios.LtpUtil;

/**
 * Classe para criacao de objetos do tipo Produto onde implementa a clase
 * Serializable com valores primitivos e obejtos , String nome; double
 * precoUnitatio e variaveis do tipo gregorianCalendar;
 * @author Tharyck Gusmao Metzker
 */
public class Produto implements Serializable {

	private static int sequence = 1;

	private int codigo;
	private String nome;
	private double precoUnitatio;
	private GregorianCalendar dataInclusao = new GregorianCalendar();
	private GregorianCalendar dataUltAlteracao = new GregorianCalendar();

	/**
	 * Metodo Construtor com passagem de parametro para a criacao de objeto.
	 *	 * @param nome String
	 * @param precoUnitatio double
	 * @param dataInclusao GregorianCalendar
	 * @param dataUltAlteracao GregorianCalendar
	 */
	public Produto(String nome, double precoUnitatio,
			GregorianCalendar dataInclusao, GregorianCalendar dataUltAlteracao) {

		codigo = sequence++;
		this.nome = nome;
		this.precoUnitatio = precoUnitatio;
		this.dataInclusao = dataInclusao;
		this.dataUltAlteracao = dataUltAlteracao;
	}

	/**
	 * Metodo getNome para captura do valor da variavel String no objeto.
	 *
	 * @return Retorno String nome;
	 */
	public String getNome() {
		return nome;
	}

	/**
	 * Metodo setNome para setagem do valor da variavel String no objeto.
	 *
		 * @param nome String
		 */
	public void setNome(String nome) {
		this.nome = nome;
	}

	/**
	 * Metodo getPrecoUnitatio para captura do valor da variavel double no
	 * objeto.
	 *
	 * @return Retorno double;
	 */
	public double getPrecoUnitatio() {
		return precoUnitatio;
	}

	/**
	 * Metodo setNome para setagem do valor da variavel double no objeto.
	 * @param precoUnitatio double .
	
	 */
	public void setPrecoUnitatio(double precoUnitatio) {
		this.precoUnitatio = precoUnitatio;
	}

	/**
	 * Metodo getDataInclusao para captura do valor da variavel
	 * gregorianCalendar no objeto.

	 * @return Retorno gregorianCalendar.
	 */

	public GregorianCalendar getDataInclusao() {
		return dataInclusao;
	}

	/**
	 * Metodo setDataInclusao para setagem do valor da variavel ddo tipo
	 * GregorianCalendar no objeto.

	 * @param dataInclusao gregorianCalendar

	 */
	public void setDataInclusao(GregorianCalendar dataInclusao) {
		this.dataInclusao = dataInclusao;
	}

	/**
	 * Metodo dataInclusao para captura do valor da variavel gregorianCalendar
	 * no objeto.
	 *

	 * @return Retorno gregorianCalendar dataUltAlteracao.
	 */

	public GregorianCalendar getDataUltAlteracao() {
		return dataUltAlteracao;
	}

	/**
	 * Metodo setDataUltAlteracao para setagem do valor da variavel
	 * gregorianCalendar no objeto.
	 *


	 */
	public void setDataUltAlteracao(GregorianCalendar dataUltAlteracao) {
		this.dataUltAlteracao = dataUltAlteracao;
	}

	/**
	 * Metodo setSequence para setagem do valor da variavel static int no
	 * objeto.
	
	 */
	public static void setSequence(int sequence) {
		Produto.sequence = sequence;
	}

	public int getCodigo() {
		return codigo;
	}

	/**
	 * Metodo toString Override do metodo principal para impressao dos dados
	 * alocados nas variaveis do objeto todos formatados.
	 *
	 * @return metodo void sem retorno;
	 */
	@Override
	public String toString() {
		return "Produto [codigo=" + codigo + " \n nome=" + nome
				+ ",\n precoUnitatio=" + precoUnitatio + ",\n dataInclusao="
				+ LtpUtil.formatarData(dataInclusao, "dd/MM/yyyy hh:mm")
				+ "\n  Data de altera��o = "
				+ LtpUtil.formatarData(dataUltAlteracao, "dd/MM/yyyy hh:mm");
	}

}
