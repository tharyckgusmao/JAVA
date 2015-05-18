package dados;

import java.io.Serializable;
import java.util.GregorianCalendar;

import utilitarios.LtpUtil;



public class Cliente implements Serializable{
	
	private static int sequence = 0;
	
	private int codigo;
	private String nome;
	private String cpf;
	private String telefone;
	private String email;
	private GregorianCalendar dataInclusao = new GregorianCalendar();
	private GregorianCalendar dataUltAlteracao = new GregorianCalendar();
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
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
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
	public String getCpf() {
		return cpf;
	}


	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public int getCodigo() {
		return codigo;
	}


	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}


	public static void setSequence(int sequence) {
		Cliente.sequence = sequence;
	}


	@Override
	public String toString() {
		return "Cliente: \n  Codigo = " + codigo + " \n  Nome = " + nome + " \n  Telefone = "
				+ telefone + " \n  Email = " + email + " \n  Data de inclus�o = " + LtpUtil.formatarData( dataInclusao, "dd/MM/yyyy hh:mm") + "\n  Data de altera��o = " + LtpUtil.formatarData( dataUltAlteracao, "dd/MM/yyyy hh:mm");
	}
	
	
		

	
}
