package dados;

import java.util.ArrayList;
import java.util.GregorianCalendar;

public class Venda {

	
	private int numVenda;
	private Cliente cliente;
	private GregorianCalendar dataVenda;
	private ArrayList<itemVenda> vendaitens;
	
	
	public Venda(Cliente cliente,GregorianCalendar dataVenda, ArrayList vendaintes) {
			
			numVenda++;
		this.cliente = cliente;
		this.dataVenda = dataVenda;
		this.vendaitens = vendaintes;
		
	
	}


	public int getNumVenda() {
		return numVenda;
	}


	public void setNumVenda(int numVenda) {
		this.numVenda = numVenda;
	}


	public GregorianCalendar getDataVenda() {
		return dataVenda;
	}


	public void setDataVenda(GregorianCalendar dataVenda) {
		this.dataVenda = dataVenda;
	}


	public ArrayList<itemVenda> getVendaitens() {
		return vendaitens;
	}


	public void setVendaitens(ArrayList<itemVenda> vendaitens) {
		this.vendaitens = vendaitens;
	}
	
	
	
	public String toString(){
		
		return " Codigo :" + numVenda +" Data Venda : " + dataVenda + " Itens :" + vendaitens;
		
		
	}
	
	
}
