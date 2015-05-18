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
 * @param
 * @return
 */

public class Venda implements Serializable {

	private static int sequence = 1;

	private int numVenda = 0;
	private Cliente cliente;
	private GregorianCalendar dataVenda = new GregorianCalendar();
	private ArrayList<ItemVenda> vendaItens = new ArrayList<ItemVenda>();

	/**
	 * Metodo Construtor com passagem de parametro para a criacao de objeto.
	 *
	 * @author Tharyck Gusmao Metzker.
	 * @param int numVenda; Objeto Cliente cliente; GregorianCalendar cliente;
	 *        ArrayLista com objetos do tipo da classe Vendaitens;
	 * @return nao ha retono para o metodo construtor.
	 */

	public Venda(Cliente cliente, GregorianCalendar dataVenda,
			ArrayList<ItemVenda> vendaItens) {

		numVenda = sequence++;
		this.cliente = cliente;
		this.dataVenda = dataVenda;
	}

	/**
	 * Metodo getNumVenda para captura do valor da variavel int no objeto.
	 *
	 * @author Tharyck Gusmao Metzker.
	 * @param Nao a passagem de paramentro.
	 * @return Retorno int;
	 */

	public int getNumVenda() {
		return numVenda;
	}

	/**
	 * Metodo setNumVenda para setagem do valor da variavel int no objeto.
	 *
	 * @author Tharyck Gusmao Metzker.
	 * @param int.
	 * @return metodo void sem retorno;
	 */

	public void setNumVenda(int numVenda) {
		this.numVenda = numVenda;
	}

	/**
	 * Metodo getCliente para captura objeto do tipo cliente instaciado na
	 * classe.
	 *
	 * @author Tharyck Gusmao Metzker.
	 * @param Nao
	 *            a passagem de paramentro.
	 * @return Retorno objeto do tipo Cliente;
	 */

	public Cliente getCliente() {
		return cliente;
	}

	/**
	 * Metodo setCliente para setagem de objeto do tipo Cliente na classe.
	 *
	 * @author Tharyck Gusmao Metzker.
	 * @param cliente
	 *            .
	 * @return metodo void sem retorno;
	 */
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	/**
	 * Metodo getDataVenda para captura do valor da variavel gregorianCalendar
	 * no objeto.
	 *
	 * @author Tharyck Gusmao Metzker.
	 * @param Nao
	 *            a passagem de paramentro.
	 * @return Retorno gregorianCalendar.
	 */

	public GregorianCalendar getDataVenda() {
		return dataVenda;
	}

	/**
	 * Metodo setDataVenda para setagem do valor da variavel do tipo
	 * GregorianCalendar no objeto.
	 *
	 * @author Tharyck Gusmao Metzker.
	 * @param gregorianCalendar
	 *            .
	 * @return metodo void sem retorno;
	 */

	public void setDataVenda(GregorianCalendar dataVenda) {
		this.dataVenda = dataVenda;
	}

	/**
	 * Metodo getVendaItens para captura o arrayList do tipo Vendaitens
	 * instanciado na classe.
	 *
	 * @author Tharyck Gusmao Metzker.
	 * @param Nao
	 *            a passagem de paramentro.
	 * @return Retorno Arraylista<ItemVenda>.
	 */
	public ArrayList<ItemVenda> getVendaItens() {
		return vendaItens;
	}

	/**
	 * Metodo setVendaItens para setar o arrayList do tipo Vendaitens na classe.
	 *
	 * @author Tharyck Gusmao Metzker.
	 * @param ArrayList
	 *            <ItemVenda>.
	 * @return metodo void sem retorno.
	 */
	public void setVendaItens(ArrayList<ItemVenda> vendaItens) {
		this.vendaItens = vendaItens;
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
		Venda.sequence = sequence;
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
		return "Venda [\n numVenda=" + numVenda + ",\n cliente=" + cliente
				+ ",\n dataVenda="
				+ LtpUtil.formatarData(dataVenda, "dd/MM/yyyy hh:mm") + "\n]";
	}

}
