package dados;

import java.io.Serializable;
import java.util.GregorianCalendar;

import utilitarios.LtpUtil;

/**
 * Classe para criacao de objetos do tipo Cliente onde implementa a calsse
 * Serializable com valores primitivos para o mesmo como , String nome; String
 * cpf; String telefone; String email; E variaveis do tipo gregorianCalendar;
 *
 * @author Tharyck Gusmao Metzker
 * @param
 * @return
 */

public class Cliente implements Serializable {

	private static int sequence = 0;

	private int codigo;
	private String nome;
	private String cpf;
	private String telefone;
	private String email;
	private GregorianCalendar dataInclusao = new GregorianCalendar();
	private GregorianCalendar dataUltAlteracao = new GregorianCalendar();

	/**
	 * Metodo Construtor com passagem de parametro para a criacao de objeto.
	 *
	 * @author Tharyck Gusmao Metzker.
	 * @param String
	 *            nome, String pf, String Telefone, String Email,
	 *            GregorianCalendar dataInclusao, GregorianCalendar
	 *            dataUltAlteracao;
	 * @return nao ha retono para o metodo construtor.
	 */

	public Cliente(String nome, String cpf, String telefone, String email,
			GregorianCalendar dataInclusao, GregorianCalendar dataUltAlteracao) {

		codigo = sequence++;
		this.nome = nome;
		this.telefone = telefone;
		this.email = email;
		this.dataInclusao = dataInclusao;
		this.dataUltAlteracao = dataUltAlteracao;
		this.cpf = cpf;
	}

	/**
	 * Metodo getNome para captura do valor da variavel String no objeto.
	 *
	 * @author Tharyck Gusmao Metzker.
	 * @param Nao
	 *            a passagem de paramentro.
	 * @return Retorno String nome;
	 */
	public String getNome() {
		return nome;
	}

	/**
	 * Metodo setNome para setagem do valor da variavel String no objeto.
	 *
	 * @author Tharyck Gusmao Metzker.
	 * @param String
	 *            .
	 * @return metodo void sem retorno;
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}

	/**
	 * Metodo getTelefone para captura do valor da variavel String no objeto.
	 *
	 * @author Tharyck Gusmao Metzker.
	 * @param Nao
	 *            a passagem de paramentro.
	 * @return Retorno String telfone;
	 */
	public String getTelefone() {
		return telefone;
	}

	/**
	 * Metodo setTelefone para setagem do valor da variavel String no objeto.
	 *
	 * @author Tharyck Gusmao Metzker.
	 * @param String
	 *            .
	 * @return metodo void sem retorno;
	 */
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	/**
	 * Metodo getEmail para captura do valor da variavel String no objeto.
	 *
	 * @author Tharyck Gusmao Metzker.
	 * @param Nao
	 *            a passagem de paramentro.
	 * @return Retorno String email;
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * Metodo setEmail para setagem do valor da variavel String no objeto.
	 *
	 * @author Tharyck Gusmao Metzker.
	 * @param String
	 *            .
	 * @return metodo void sem retorno;
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * Metodo dataInclusao para captura do valor da variavel gregorianCalendar
	 * no objeto.
	 *
	 * @author Tharyck Gusmao Metzker.
	 * @param Nao
	 *            a passagem de paramentro.
	 * @return Retorno gregorianCalendar.
	 */

	public GregorianCalendar getDataInclusao() {
		return dataInclusao;
	}

	/**
	 * Metodo setDataInclusao para setagem do valor da variavel do tipo
	 * GregorianCalendar no objeto.
	 *
	 * @author Tharyck Gusmao Metzker.
	 * @param gregorianCalendar
	 *            .
	 * @return metodo void sem retorno;
	 */
	public void setDataInclusao(GregorianCalendar dataInclusao) {
		this.dataInclusao = dataInclusao;
	}

	/**
	 * Metodo dataInclusao para captura do valor da variavel gregorianCalendar
	 * no objeto.
	 *
	 * @author Tharyck Gusmao Metzker.
	 * @param Nao
	 *            a passagem de paramentro.
	 * @return Retorno gregorianCalendar dataUltAlteracao.
	 */

	public GregorianCalendar getDataUltAlteracao() {
		return dataUltAlteracao;
	}

	/**
	 * Metodo setDataUltAlteracao para setagem do valor da variavel
	 * gregorianCalendar no objeto.
	 *
	 * @author Tharyck Gusmao Metzker.
	 * @param Nao
	 *            a passagem de paramentro.
	 * @return metodo void sem retorno;
	 */
	public void setDataUltAlteracao(GregorianCalendar dataUltAlteracao) {
		this.dataUltAlteracao = dataUltAlteracao;
	}

	/**
	 * Metodo getCpf para captura do valor da variavel String no objeto.
	 *
	 * @author Tharyck Gusmao Metzker.
	 * @param Nao
	 *            a passagem de paramentro.
	 * @return Retorno String cpf.
	 */
	public String getCpf() {
		return cpf;
	}

	/**
	 * Metodo setCpf para setagem do valor da variavel String no objeto.
	 *
	 * @author Tharyck Gusmao Metzker.
	 * @param String
	 *            .
	 * @return metodo void sem retorno;
	 */
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	/**
	 * Metodo getCodigo para captura do valor da variavel int no objeto.
	 *
	 * @author Tharyck Gusmao Metzker.
	 * @param Nao
	 *            a passagem de paramentro.
	 * @return Retorno String codigo.
	 */
	public int getCodigo() {
		return codigo;
	}

	/**
	 * Metodo setCodigo para setagem do valor da variavel int no objeto.
	 *
	 * @author Tharyck Gusmao Metzker.
	 * @param int.
	 * @return metodo void sem retorno;
	 */
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	/**
	 * Metodo setSequence para setagem do valor da variavel static int no
	 * objeto.
	 *
	 * @author Tharyck Gusmao Metzker.
	 * @param int.
	 * @return metodo void sem retorno;
	 */
	public static void setSequence(int sequence) {
		Cliente.sequence = sequence;
	}

	/**
	 * Metodo toString Override do metodo principal para impressao dos dados
	 * alocados nas variaveis do objeto todos formatados.
	 *
	 * @author Tharyck Gusmao Metzker.
	 * @param
	 * @return metodo void sem retorno;
	 */

	@Override
	public String toString() {
		return "Cliente: \n  Codigo = " + codigo + " \n  Nome = " + nome
				+ " \n  Telefone = " + telefone + " \n  Email = " + email
				+ " \n  Data de inclusão = "
				+ LtpUtil.formatarData(dataInclusao, "dd/MM/yyyy hh:mm")
				+ "\n  Data de alteração = "
				+ LtpUtil.formatarData(dataUltAlteracao, "dd/MM/yyyy hh:mm");
	}

}
