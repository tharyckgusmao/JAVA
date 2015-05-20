package dados;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.GregorianCalendar;
import utilitarios.LtpUtil;

/**
 * Classe para criacao de objetos do tipo Venda onde implementa a calsse
 * Serializable com valores primitivos para o mesmo como , int numVenda; Objeto
 * Cliente cliente; GregorianCalendar cliente; ArrayLista com objetos do tipo da
 * classe Vendaitens;
 *
 * @author Tharyck Gusmao Metzker
 */

public class Venda implements Serializable {

	private static int sequence = 1;

	private int numVenda = 0;
	private Cliente cliente;
	private GregorianCalendar dataVenda = new GregorianCalendar();
	private ArrayList<ItemVenda> vendaItens = new ArrayList<ItemVenda>();

	/**
	 * Metodo Construtor com passagem de parametro para a criacao de objeto.

	 *  @param  cliente  Objeto Cliente  
	 *  @param	dataVenda GregorianCalendar
	 *  @param	vendaItens ArrayList<ItemVenda> ArrayLista com objetos do tipo da classe Vendaitens;
	 */

	public Venda(Cliente cliente, GregorianCalendar dataVenda,
			ArrayList<ItemVenda> vendaItens) {

		numVenda = sequence++;
		this.cliente = cliente;
		this.dataVenda = dataVenda;
		this.vendaItens = vendaItens;
	}

	/**
	 * Metodo getNumVenda para captura do valor da variavel int no objeto.
	 *
	 * @return Retorno int;
	 */

	public int getNumVenda() {
		return numVenda;
	}

	/**
	 * Metodo setNumVenda para setagem do valor da variavel int no objeto.
	 *
	 * @param numVenda int.
	 */

	public void setNumVenda(int numVenda) {
		this.numVenda = numVenda;
	}

	/**
	 * Metodo getCliente para captura objeto do tipo cliente instaciado na
	 * classe.
		 * @return Retorno objeto do tipo Cliente;
	 */

	public Cliente getCliente() {
		return cliente;
	}

	/**
	 * Metodo setCliente para setagem de objeto do tipo Cliente na classe.
	 *
	 * @param  cliente Cliente
	 */
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	/**
	 * Metodo getDataVenda para captura do valor da variavel gregorianCalendar
	 * no objeto.
	 *
 * @return Retorno gregorianCalendar.
	 */

	public GregorianCalendar getDataVenda() {
		return dataVenda;
	}

	/**
	 * Metodo setDataVenda para setagem do valor da variavel do tipo
	 * GregorianCalendar no objeto.
	 *
	
	 * @param vendaItens gregorianCalendar

	 */

	public void setDataVenda(GregorianCalendar vendaItens) {
		this.dataVenda = dataVenda;
	}

	/**
	 * Metodo getVendaItens para captura o arrayList do tipo Vendaitens
	 * instanciado na classe.
	 *
	 * @return Retorno Arraylista<ItemVenda>.
	 */
	public ArrayList<ItemVenda> getVendaItens() {
		return vendaItens;
	}

	/**
	 * Metodo setVendaItens para setar o arrayList do tipo Vendaitens na classe.
	 *
	 * @param vendaItens ArrayList<ItemVenda>.
	 */
	public void setVendaItens(ArrayList<ItemVenda> vendaItens) {
		this.vendaItens = vendaItens;
	}

	/**
	 * Metodo setSequence para setagem do valor da variavel static int no
	 * objeto.
	 *

	 * @param sequence int.

	 */
	public static void setSequence(int sequence) {
		Venda.sequence = sequence;
	}

	/**
	 * Metodo toString Override do metodo principal para impressao dos dados
	 * alocados nas variaveis do objeto todos formatados.
	
	 */

	@Override
 	public String toString() {
		return "Venda [\n numVenda=" + numVenda + ",\n cliente=" + cliente
				+ ",\n dataVenda="
				+ LtpUtil.formatarData(dataVenda, "dd/MM/yyyy hh:mm") + "\n]";
	}

}
