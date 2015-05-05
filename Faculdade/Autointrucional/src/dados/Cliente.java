package dados;
import java.util.GregorianCalendar;


public class Cliente {

	
	private int codigo = 0;
	private String nome;
	private String cpf;
	private String telefone;
	private String email;
	private GregorianCalendar dataInclusao;
	private GregorianCalendar dataUltAlteracao;
	
	
	
	public Cliente(String nome, String cpf, String telefone, String email,GregorianCalendar dataInclusao,GregorianCalendar dataUltAlteracao){
		
		codigo++;
		
		
		this.nome = nome;
		this.cpf =cpf;
		this.telefone =telefone;
		this.email = email;
		this.dataInclusao = dataInclusao;
		this.dataUltAlteracao = dataUltAlteracao;
		
		
	}



	public String getNome() {
		return nome;
	}



	public void setNome(String nome) {
		this.nome = nome;
	}



	public String getCpf() {
		return cpf;
	}



	public void setCpf(String cpf) {
		this.cpf = cpf;
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
	
	
	
	
	public String toString(){
		return "\n Codigo :" + codigo + "Nome :"+ nome + "\n Telefone :"+ telefone +"\n Email :"+ email + "\n Data inclusao :" + dataInclusao + "\n Data Ultima ateraçao :" + dataUltAlteracao;
		
		
	}
	
	
	
	
	
	
	
	
	
}
