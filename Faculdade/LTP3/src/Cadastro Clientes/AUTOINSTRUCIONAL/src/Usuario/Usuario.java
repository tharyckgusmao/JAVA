package Usuario;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Date;
import java.util.GregorianCalendar;

import org.omg.CORBA.SystemException;

import utilitarios.Console;
import utilitarios.LtpUtil;
import cadastro.Cadastro;
import dados.Cliente;
import dados.ItemVenda;
import dados.Produto;
import dados.Venda;
import erros.SisVendasException;

public class Usuario {

	public static void main(String[] args) throws SisVendasException {
		int ultimoValor;
		if (fileExist()) {
			
			lerArq("Venda");
			lerArq("Produto");
			lerArq("Cliente");

			try {
				ultimoValor = Cadastro.venda.get(Cadastro.venda.size() - 1)
						.getNumVenda();
				Venda.setSequence(ultimoValor);
				
			} catch (Exception e) {
				System.out.println("Base de dados de vendas nao preenchido !!");
			}
		
			
			try {
				ultimoValor = Cadastro.produto.get(Cadastro.produto.size() - 1)
						.getCodigo();
				Produto.setSequence(ultimoValor);
				
			} catch (Exception e) {
				System.out.println("Base de dados de Produto nao preenchido !!");
			}
	
		
			try {
				
				ultimoValor = Cadastro.clientes.get(Cadastro.clientes.size() - 1)
						.getCodigo();
				Cliente.setSequence(ultimoValor);
			} catch (Exception e) {
				System.out.println("Base de dados de vendas nao preenchido !!");
			}
			
		
			
			
		}

		menu();
		gravarArq("Vendas");
		gravarArq("Produto");
		gravarArq("Cliente");
	}

	private static void lerArq(String obj) {
		ObjectInputStream inp;
		try {
			if (obj.equals("Venda")) {
				inp = new ObjectInputStream(new FileInputStream("Vendas.obj"));
				Cadastro.venda = (ArrayList<Venda>) inp.readObject();
				inp.close();
			} else if (obj.equals("Produto")) {
				inp = new ObjectInputStream(new FileInputStream("Produtos.obj"));
				Cadastro.produto = (ArrayList<Produto>) inp.readObject();

			} else {
				inp = new ObjectInputStream(new FileInputStream("Clientes.obj"));
				Cadastro.clientes = (ArrayList<Cliente>) inp.readObject();

			}
			inp.close();

		} catch (Exception erro) {
			System.out.println(erro.getMessage());
			System.exit(1); // termino por falha na leitura do arquivo
		}

	}

	private static void gravarArq(String obj) {
		ObjectOutputStream out;

		try {
			if (obj.equals("Vendas")) {
				out = new ObjectOutputStream(new FileOutputStream("Vendas.obj"));
				out.writeObject(Cadastro.venda);

			} else if (obj.equals("Produto")) {
				out = new ObjectOutputStream(new FileOutputStream(
						"Produtos.obj"));
				out.writeObject(Cadastro.produto);

			} else {

				out = new ObjectOutputStream(new FileOutputStream(
						"Clientes.obj"));
				out.writeObject(Cadastro.clientes);

			}
			out.close();
		} catch (Exception erro) {
			System.out.println(erro.getMessage());
			System.exit(2); // Termino por falha na gravação do arquivo
		}

	}

	private static void menu() throws SisVendasException {
		int option;

		do {
			option = Console.readInt(" ----- MENU DE OPÇÕES ----- \n"
					+ " 1 - Menu Cliente " + "\n 2 - Menu Produtos "
					+ "\n 3 - Menu Vendas " + "\n 6 - Sair "
					+ "\n\n -> Qual opção deseja?");
			switch (option) {
			case 1:
				menuCliente();
				break;
			case 2:
				menuProduto();
				break;
			case 3:
				menuVenda();
				break;
			case 6:
				System.out.println("Fim do programa, obrigado por usar!");
				break;
			}

			for (int i = 0; i < 5; i++)
				System.out.println("");

		} while (option != 6);

	}

	private static void menuCliente() throws SisVendasException {
		int option;
		do {
			option = Console.readInt(" ----- MENU DE OPÇÕES ----- \n"
					+ " 1 - Incluir " + "\n 2 - Alterar " + "\n 3 - Excluir "
					+ "\n 4 - Buscar pelo CPF "
					+ "\n 5 - Consultar clientes em ordem alfabeitca"
					+ "\n 6 - Voltar menu anterior "
					+ "\n\n -> Qual opção deseja?");

			switch (option) {
			case 1:
				incluirCliente();
				break;
			case 2:
				alterarCliente();
				break;
			case 3:
				excluirCliente();
				break;
			case 4:
				buscarClienteCPF();
				break;
			case 5:
				pesqClienteNomeOrdem();
				break;
			case 6:
				System.out.println("Voltando menu anterior !");
				break;
			}

			for (int i = 0; i < 5; i++)
				System.out.println("");

		} while (option != 6);

	}

	private static void menuProduto() throws SisVendasException {
		int option;
		do {
			option = Console.readInt(" ----- MENU DE OPÇÕES ----- \n"
					+ " 1 - Incluir " + "\n 2 - Alterar "
					+ "\n 3 - Excluir via codigo "
					+ "\n 4 - Buscar pelo Codigo "
					+ "\n 5 - Buscar por Ordem alfabetica "
					+ "\n 6 - Voltar menu anterior "
					+ "\n\n -> Qual opção deseja?");

			switch (option) {
			case 1:
				incluirProduto();
				break;
			case 2:
				aterarProduto();
				;
				break;
			case 3:
				excluirProduto();
				;
				break;
			case 4:
				buscarProduto();
				break;
			case 5:
				pesqProdOrdem();
				break;
			case 6:
				System.out.println("\t --- Voltando menu anterior --- ");
				break;
			}

			for (int i = 0; i < 5; i++)
				System.out.println("");

		} while (option != 6);

	}

	private static void menuVenda() throws SisVendasException {
		int option;
		do {
			option = Console.readInt(" ----- MENU DE OPÇÕES ----- \n"
					+ " 1 - Incluir " + "\n 2 - Excluir via codigo "
					+ "\n 3 - Ordem de vendas por Cliente "
					+ "\n 4 - Consultar por Periodo Data "

					+ "\n 5 - Estastisca de Venda "

					+ "\n 6 - Voltar menu anterior "
					+ "\n\n -> Qual opção deseja?");

			switch (option) {
			case 1:
				incluirVenda();
				break;
			case 2:
				excluirVenda();
				;
				break;
			case 3:
				pesqOrdemVendas();
				;
				break;
			case 4:
				vendaClientePerido();

				break;
			case 6:
				System.out.println(" \t --- Voltando menu anterior  ---");
				break;
			}

			for (int i = 0; i < 5; i++)
				System.out.println("");

		} while (option != 6);

	}

	/**
	 * Método responsável pelo cadastro de clientes.
	 * @throws SisVendasException 
	 */
	private static void incluirCliente() throws SisVendasException {
		String cpf;
		String nome;
		String telefone;
		String email;
		
		Cliente inclusaoCliente;
		Cliente objCliente = null;
		System.out.println(" ---- CADASTRO DE CLIENTES ---- ");
		while(true) {
			
			cpf = Console.readLine("CPF: ");
			if(!LtpUtil.validarCPF(cpf)) 
			{
				System.out.println("CPF invalido");
				continue;
			}
			
			
			try {
				Cliente objCliente1 = Cadastro.buscarClienteCPF(cpf);
				System.out.println("CPF ja esta cadastrado para o Socio : " +
				objCliente1.getNome());
			} catch (SisVendasException erro) {
				break;
			}
		}
				
			
		

		do {
			nome = Console.readLine("NOME: ");
		} while (!nome.matches("^(\\D*)+(\\s*)+(\\D)$"));

		telefone = Console.readLine("TELEFONE: ");

		do {
			email = Console.readLine("EMAIL: ");
		} while (!LtpUtil.validarEmail(email));

		Cadastro.incluirCliente(inclusaoCliente = new Cliente(nome, cpf,
				telefone, email, new GregorianCalendar(),
				new GregorianCalendar()));

	}

	/**
	 * Método responsável pela alteração dos cadastros dos Clientes.
	 * 
	 */
	private static void alterarCliente() {

		int codigo;
		String opcao;
		Cliente alteracao;

		try {
			codigo = Console
					.readInt("Digite o código do usuário que deseja alterar: ");
			System.out.println(Cadastro.buscarClienteCod(codigo));
			
			
			alteracao = Cadastro.buscarClienteCod(codigo);
			do {
				opcao = Console
						.readLine("Deseja  realmente alterar o cliente? (S/N): ");
			} while (!(opcao.toUpperCase().charAt(0) == 'S')||((opcao.toUpperCase().charAt(0) == 'N')));

			if (opcao.toUpperCase().charAt(0) == 'S') {

				String cpf;
				String nome;
				String telefone;
				String email;
				GregorianCalendar data = new GregorianCalendar();

				System.out.println(" ---- ALTERAÇÃO DE CLIENTE ---- ");

				do {
					cpf = Console.readLine("CPF: ");
				} while (!LtpUtil.validarCPF(cpf));

				do {
					nome = Console.readLine("NOME: ");
				} while (!nome.matches("^(\\D*)+(\\s*)+(\\D)$"));

				telefone = Console.readLine("TELEFONE: ");

				do {
					email = Console.readLine("EMAIL: ");
				} while (!LtpUtil.validarEmail(email));

				alteracao.setCpf(cpf);
				alteracao.setNome(nome);
				alteracao.setTelefone(telefone);
				alteracao.setEmail(email);
				alteracao.setDataUltAlteracao(data); // Passando data da
														// alteração
			}

		} catch (SisVendasException e) {
			System.out.println("Não encontrado !!!!!");
		}
	}

	/**
	 * Método responsável pela exclusão de clientes
	 * 
	 * @throws SisVendasException
	 *             - Quando não é possível encontrar o cliente
	 */
	private static void excluirCliente() throws SisVendasException {

		int codigo = Console
				.readInt("Digite o código do cliente que deseja exlcuir: ");

		try {
			Cadastro.excluirCliente(Cadastro.buscarClienteCod(codigo));
			System.out.println("Cliente excluído com sucessso!");
		} catch (Exception e) {
			System.out
					.println("\nNão foi possível excuir o cliente, código inválido!");
		}
	}

	private static void pesqClienteNomeOrdem() {
		try {
			System.out.println("\nPesquisa de Clientes pelo Nome");
			String nome = Console.readLine("Informe o nome ou parte do nome: ");
			ArrayList<Cliente> resp = Cadastro.buscarClienteNomeOrdem(nome);
			if (resp.isEmpty()) {
				System.out.println("Nao existe nehum cliente para o nome.");
			} else {
				for (Cliente objSocio : resp) {
					System.out.println(objSocio.toString());

				}
			}

		} catch (SisVendasException erro) {
			System.out.println(erro.getMessage());
		}
	}

	/**
	 * Método responsável pela busca de clientes pelo CPF
	 * 
	 * @throws SisVendasException
	 *             - Quando não é encontrado cliente pelo CPF informado
	 */
	private static void buscarClienteCPF() throws SisVendasException {
		String cpf;
		try {

			do {

				cpf = Console.readLine("Digite o CPF para buscar: ");
			} while (!LtpUtil.validarCPF(cpf));
			System.out.println(Cadastro.buscarClienteCPF(cpf));
		} catch (SisVendasException e) {

			System.out.println("Nao existe cliente para o CPF informado");
		}
	}

	/*
	 * private static void buscarClienteNome() throws SisVendasException {
	 * String nome; try {
	 * 
	 * do { nome = Console.readLine("NOME: "); } while
	 * (!nome.matches("^(\\D*)+(\\s*)+(\\D)$"));
	 * 
	 * System.out.println(Cadastro.buscarClienteNome(nome)); } catch
	 * (SisVendasException e) {
	 * 
	 * System.out.println("Cliente nao localizado"); } }
	 */

	private static void buscarProduto() throws SisVendasException {
		try {
			int prod = Console.readInt("Digite o codigo para buscar: ");
			System.out.println(Cadastro.buscarProdutoCod(prod));
		} catch (SisVendasException e) {
			System.out.println("Nao existe produto para o CODIGO informado");
		}
	}

	private static void incluirProduto() {

		String nome;
		double preco;

		Produto prod;
		GregorianCalendar data = new GregorianCalendar();

		do {
			nome = Console.readLine("Nome do Produto :");

		} while (nome.isEmpty());

		do {

			preco = Console.readDouble("Preco do produto (maior que 0)");

		} while (preco <= 0);

		Cadastro.incluirProduto(prod = new Produto(nome, preco, data, data));

	}

	private static void aterarProduto() throws SisVendasException {

		int cod;
		Produto alteracao;
		try {
			cod = Console.readInt(" Codigo do produto a ser pesquisado :");
			System.out.println(Cadastro.buscarProdutoCod(cod));
			alteracao = Cadastro.buscarProdutoCod(cod);
			String opcao;

			do {
				opcao = Console
						.readLine("Deseja  realmente alterar o cliente? (S/N): ");
			} while (!(opcao.toUpperCase().charAt(0) == 'S') && (opcao.toUpperCase().charAt(0) == 'N'));

			if (opcao.toUpperCase().charAt(0) == 'S') {

				String nome;
				double preco;
				GregorianCalendar data = new GregorianCalendar();

				do {
					nome = Console.readLine("Nome do Produto :");

				} while (nome.isEmpty());

				do {

					preco = Console
							.readDouble("Preco do produto (maior que 0)");

				} while (preco <= 0);

				alteracao.setNome(nome);
				alteracao.setPrecoUnitatio(preco);
				alteracao.setDataUltAlteracao(data);

			}

		} catch (SystemException e) {

			System.out.println("Não encontrado !!!!!");

		}

	}

	private static void excluirProduto() throws SisVendasException {

		int codigo = Console
				.readInt("Digite o código do Produto que deseja exlcuir: ");
		Produto prod;
		try {
			prod = Cadastro.buscarProdutoCod(codigo);
			if (Cadastro.pesqProdtoVenda(prod)) {

				System.out
						.println("Ja existe Venda Cadastrado para o produto !!");

			} else {
				
				System.out.println(prod);
				
				
				String entrada = Console
						.readLine("Voce deseja excluir esta venda? / (S/N) ");
				if (entrada.equalsIgnoreCase("S")) {

				
				Cadastro.excluirProduto(prod);

				}				System.out.println("Produto excluído com sucessso!");

			}

		} catch (Exception e) {
			System.out
					.println("\nNão foi possível excuir o Produto, código inválido!");
		}
	}

	private static void pesqProdOrdem() {
		try {
			System.out.println("\nPesquisa de Produto pelo Nome");
			String nome = Console.readLine("Informe o nome ou parte do nome: ");
			ArrayList<Produto> resp = Cadastro.buscarProdutoNome(nome);
			if (resp.isEmpty()) {
				System.out.println("Nao existe nehum cliente para o nome.");
			} else {
				for (Produto objSocio : resp) {
					System.out.println(objSocio.toString());

				}
			}

		} catch (SisVendasException erro) {
			System.out.println(erro.getMessage());
		}
	}

	private static void incluirVenda() throws SisVendasException {
		GregorianCalendar dt = new GregorianCalendar();
		Cliente cliente = null;
		Produto produto = null;
		String cpf;
		String data;
		Date dt1;
		int quantidade;
		double preco = 0;
		double valor = 0;
		ArrayList<ItemVenda> itensVendas = new ArrayList<ItemVenda>();

		try {

			do {

				cpf = Console.readLine("Digite o CPF para buscar: ");
			} while (!LtpUtil.validarCPF(cpf));

			cliente = Cadastro.buscarClienteCPF(cpf);

			do {

				data = Console
						.readLine("Favor informar a data :\n EX: DD/MM/YYYY ");

				if (!LtpUtil.validarData(data, dt)) {
					System.out.println("Data invalida.");
					continue;
				}

				if (dt.after(new GregorianCalendar())) {
					System.out.println(" Data maior que a data atual !!");
				}

			} while ((data.matches("^(\\d{2}\\/\\d{2}\\/\\d{4})$"))
					&& (dt.after(new GregorianCalendar())));

			do {

				int codigo = Console
						.readInt("Informe o codigo do produto para o cadastro: ");
				try {
					produto = Cadastro.buscarProdutoCod(codigo);
					if (produto == null) {
						System.out.println("Nao existe produto neste codigo");
					}
				} catch (SisVendasException e) {
					System.out.println(e.getMessage());
				}

			} while (produto == null);

			do {

				quantidade = Console
						.readInt("Informe a quantidade de itens vendidos: ");
				if (quantidade <= 0) {
					System.out
							.println("A quantidade tem que ser maior que zero!");
				} else {

					do {
						preco = Console
								.readDouble("Informe o preco do produto vendido: ");
						valor = preco * quantidade;
						if (preco <= 0) {
							System.out
									.println("A quantidade tem que ser maior que zero!");
						}
					} while (preco <= 0);

				}
			} while (quantidade <= 0);

			itensVendas.add(new ItemVenda(produto, preco, quantidade, preco));
			Cadastro.incluirVenda(new Venda(cliente, dt, itensVendas));
		} catch (SisVendasException e) {
			System.out.println(e.getMessage());
		}
	}

	private static void excluirVenda() throws SisVendasException {

		int codigo = Console
				.readInt("Digite o código da Venda que deseja exlcuir: ");

		try {
			System.out.println(Cadastro.buscarProdutoCod(codigo));
		} catch (SisVendasException erro) {
			System.out.println(erro.getMessage());
		}

		String entrada = Console
				.readLine("Voce deseja excluir esta venda? / (S/N) ");
		if (entrada.equalsIgnoreCase("S")) {

			Venda obj = Cadastro.buscarVendaCod(codigo);
			if (obj != null) {
				System.out.println(obj);
				Cadastro.excluirVenda(obj);
				System.out.println("A venda foi excluida com sucesso!");
			} else {
				System.out.println("Nao existe venda neste codigo");
			}
		}

	}

	private static void pesqOrdemVendas() {
		try {
			System.out.println("\nPesquisa de Vendas pelo Nome");
			String nome = Console.readLine("Informe o nome: ");
			Cliente cli = Cadastro.buscarClienteNome(nome);
			ArrayList<Venda> resp = Cadastro.buscarVendaClienteNome(cli);
			if (resp.isEmpty()) {
				System.out.println("Nao existe nehum cliente para o nome.");
			} else {
				for (Venda objSocio : resp) {
					System.out.println(objSocio.toString());

				}
			}

		} catch (SisVendasException erro) {
			System.out.println(erro.getMessage());
		}
	}

	private static void vendaClientePerido() {

		String data;
		GregorianCalendar dt1 = new GregorianCalendar();
		GregorianCalendar dt2 = new GregorianCalendar();

		do {

			data = Console
					.readLine("Favor informar a data1 :\n EX: DD/MM/YYYY ");

			if (!LtpUtil.validarData(data, dt1)) {
				System.out.println("Data invalida.");
				continue;
			}

			if (dt1.after(new GregorianCalendar())) {
				System.out.println(" Data maior que a data atual !!");
			}

		} while ((data.matches("^(\\d{2}\\/\\d{2}\\/\\d{4})$"))
				&& (dt1.after(new GregorianCalendar())));

		do {

			data = Console
					.readLine("Favor informar a data2 :\n EX: DD/MM/YYYY ");

			if (!LtpUtil.validarData(data, dt2)) {
				System.out.println("Data invalida.");
				continue;
			}

			if (dt2.after(new GregorianCalendar())) {
				System.out.println(" Data maior que a data atual !!");
			}

		} while ((data.matches("^(\\d{2}\\/\\d{2}\\/\\d{4})$"))
				&& (dt2.after(new GregorianCalendar())));

		ArrayList<Venda> resp = Cadastro.vendaClientePerido(dt1, dt2);
		if (resp.isEmpty()) {
			System.out
					.println("Nao existe nehuma venda cadastrada neste periodo.");
		} else {
			for (Venda objProduto : resp) {
				System.out.println(objProduto.toString());

			}
		}

	}

	private static boolean fileExist() {
		if (new File("Vendas.obj").exists()
				&& new File("Clientes.obj").exists()
				&& new File("Produtos.obj").exists()) {
			return true;
		}

		return false;

	}

	private static void lerArqVendas() {
		try {
			ObjectInputStream inp = new ObjectInputStream(new FileInputStream(
					"Vendas.obj"));
			Cadastro.venda = (ArrayList<Venda>) inp.readObject();
			inp.close();
		} catch (Exception erro) {
			System.out.println(erro.getMessage());
			System.exit(1); // termino por falha na leitura do arquivo
		}

	}

}