// Override reimplementar um m�todo herdado.
// Overload acrescentar um m�todo herdado
/* class SuperClasse {}
 * class SubClasse extends SuperClasse{}
 */
// Bloquear heran�a  = class final SuperClasseBloqueada{}
// Bloquear algum item da class herdada... inserir o final no cabe�alho do m�todo
// super = chamar um m�todo da super classe


package dados;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.GregorianCalendar;

import utilitarios.LtpUtil;

public class Venda implements Serializable{
	
	private static int sequence = 1;
	
	private int numVenda = 0;
	private Cliente cliente;
	private GregorianCalendar dataVenda = new GregorianCalendar();
	private ArrayList<ItemVenda> vendaItens = new ArrayList<ItemVenda>();	
	
	public Venda(Cliente cliente, GregorianCalendar dataVenda,ArrayList<ItemVenda> vendaItens ) {
		
		
		numVenda = sequence++;
		this.cliente = cliente;
		this.dataVenda = dataVenda;
	}
	public int getNumVenda() {
		return numVenda;
	}
	public void setNumVenda(int numVenda) {
		this.numVenda = numVenda;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public GregorianCalendar getDataVenda() {
		return dataVenda;
	}
	public void setDataVenda(GregorianCalendar dataVenda) {
		this.dataVenda = dataVenda;
	}
	
	
	public ArrayList<ItemVenda> getVendaItens() {
		return vendaItens;
	}
	public void setVendaItens(ArrayList<ItemVenda> vendaItens) {
		this.vendaItens = vendaItens;
	}
	public static void setSequence(int sequence) {
		Venda.sequence = sequence;
	}
	@Override
	public String toString() {
		return "Venda [\n numVenda=" + numVenda + ",\n cliente=" + cliente
				+ ",\n dataVenda=" + LtpUtil.formatarData( dataVenda, "dd/MM/yyyy hh:mm")+"\n]" ;
	}
	
	
	

}
