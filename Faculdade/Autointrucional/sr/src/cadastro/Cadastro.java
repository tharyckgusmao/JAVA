package cadastro;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import dados.Cliente;
import dados.Produto;
import dados.Venda;
import erros.SisVendasException;

public class Cadastro {

	public static ArrayList<Cliente> clientes = new ArrayList<Cliente>();
	public static ArrayList<Produto> produto = new ArrayList<Produto>();
	public static ArrayList<Venda> venda = new ArrayList<Venda>();

	
		public Cadastro() {
			
		}
	
	
		public static void incluirCliente (Cliente objCliente) {			
			clientes.add(objCliente);
		}
		

		public static void excluirCliente (Cliente objCliente) {
			clientes.remove(objCliente);
		}
		
		
		public static Cliente buscarClienteCod (int cod) throws SisVendasException {
			for(Cliente objCliente : clientes){
				if(objCliente.getCodigo() == cod){
					return objCliente;
				}
			}
			throw new SisVendasException("Não existe cliente para o código informado!");
		}
		
		
		
		public static Cliente buscarClienteCPF (String cpf) throws SisVendasException {
			for(Cliente objCliente : clientes){
				if(objCliente.getCpf().contains(cpf)){
					return objCliente;
				}
			}
			throw new SisVendasException("Não existe cliente para o cpf informado!");
		}
		public static Cliente buscarClienteNome (String nome) throws SisVendasException {
			for(Cliente objCliente : clientes){
				if(objCliente.getNome().contains(nome)){
					return objCliente;
				}
			}
			throw new SisVendasException("Não existe cliente para o cpf informado!");
		}
		
		public static ArrayList<Cliente> buscarClienteNomeOrdem (String nome) throws SisVendasException {
			ArrayList<Cliente> resposta = new ArrayList<Cliente>();
			for (Cliente objCliente : clientes) {
				if (objCliente.getNome().toUpperCase().contains(nome.toUpperCase())) {
					resposta.add(objCliente);
				}
			}
			if (resposta.size() > 0) {
				Collections.sort(resposta, new ClientePorNome());
				return resposta;
			}else {
				throw new SisVendasException("Nao existe Cliente para o nome.");
			}
		}
		
		
		
		
		//Métodos para produto
		public static void incluirProduto (Produto objProduto) {
			produto.add(objProduto);
		}
		
		
		public static void excluirProduto (Produto objProduto) {
			produto.remove(objProduto);
		}
		
		
		public static Produto buscarProdutoCod (int cod) throws SisVendasException {
			for(Produto objProduto : produto){
				if(objProduto.getCodigo()==cod){
					return objProduto;
				}
			}
			throw new SisVendasException("Não existe produto para o código informado!");
		}
		
		
		public static ArrayList<Produto> buscarProdutoNome (String nome) throws SisVendasException {
			ArrayList<Produto> resposta = new ArrayList<Produto>();
			for (Produto objProduto : produto) {
				if (objProduto.getNome().toUpperCase().contains(nome.toUpperCase())) {
					resposta.add(objProduto);
				}
			}
			if (resposta.size() > 0) {
				Collections.sort(resposta, new ProdutoPorNome());
				return resposta;
			}else {
				throw new SisVendasException("Nao existe Produto para o nome.");
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		//Métodos para controle de vendas
		public static void incluirVenda (Venda objVenda) {
			venda.add(objVenda);
		}
		
		public static void excluirVenda (Venda objVenda) {
			venda.remove(objVenda);
		}
		
		public static Venda buscarVendaCod (int cod) throws SisVendasException {
			
			for(Venda objVenda : venda){
				if(objVenda.getNumVenda() == cod){
					return objVenda;
				}
			}
			throw new SisVendasException("Não existe venda para o código informado!");
		}
		
		
		
		public static ArrayList<Venda> buscarVendaClienteNome (Cliente cli) throws SisVendasException {
			ArrayList<Venda> resposta = new ArrayList<Venda>();
			
			for (Venda objCliente : venda) {
				if (objCliente.getCliente().getNome().equals(cli.getNome())  ) {
					resposta.add(objCliente);
				}
			}
			if (resposta.size() > 0) {
				Collections.sort(resposta, new VendaPorCliente().reversed());
				return resposta;
			}else {
				throw new SisVendasException("Nao existe Cliente para o nome.");
			}
		}
		
		
		
		
}
class ClientePorNome implements Comparator<Cliente> {

	@Override
	public int compare(Cliente o1, Cliente o2) {
		return o1.getNome().compareTo(o2.getNome());
	}
	
}
class ProdutoPorNome implements Comparator<Produto> {

	@Override
	public int compare(Produto o1, Produto o2) {
		return o1.getNome().compareTo(o2.getNome());
	}
	
}

class VendaPorCliente implements Comparator<Venda> {

	@Override
	public int compare(Venda o1, Venda o2) {
		return o1.getNumVenda()- o2.getNumVenda();
	}
	
}

