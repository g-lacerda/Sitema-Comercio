import java.util.ArrayList;
import java.util.InputMismatchException;
public class Metodos {

	private int totalVendas;
	private int totalClientes;
	private int totalProdutos;
	private ArrayList<Estoque> produtos;
	private ArrayList<Cliente> clientes;
	private ArrayList<HistoricoVenda> vendas;
	private ArrayList<Estoque> produtosRemovidos;
	private ArrayList<Usuario> usuarios;
	private int totalProdutosRemovidos;
	private int totalGeralProduto;
	private int totalGeralCliente;
	private int totalUsuarios;

	public void adicionaCliente(String nome, String cpf, String cidade, String bairro, String rua, String numero, String telefone) {
		Cliente cliente = new Cliente(totalClientes, nome, cpf, cidade, bairro, rua, numero, telefone, totalGeralCliente+1);
		ArrayList<Cliente> adicionarCliente = new ArrayList<Cliente>();
		if (totalClientes == 0) {
			adicionarCliente.add(cliente);
			clientes = adicionarCliente;
			totalClientes++;
			this.totalGeralCliente++;

		}
		else {

			this.clientes.add(cliente);
			totalClientes++;
			this.totalGeralCliente++;

		}
	}

	public void removeCliente(int id) {
		if (id <= totalClientes) {
			Cliente cliente = new Cliente();
			this.clientes.remove(id-1);
			for (int i = 0; i < this.totalClientes-1; i++) {
				cliente = this.clientes.get(i);
				cliente.setId(i+1);
				cliente.setNomeID(i+1 + "- " + cliente.getNome());

			}
			this.totalClientes--;
		}
	}

	public void adicionaProduto(String nome, String fornecedor, Double valor, int qtd) {
		Estoque produto = new Estoque(totalProdutos, nome, fornecedor, valor, qtd, totalGeralProduto+1);
		ArrayList<Estoque> adicionarProduto = new ArrayList<Estoque>();
		if (totalProdutos == 0) {
			adicionarProduto.add(produto);
			produtos = adicionarProduto;
			this.totalProdutos++;
			this.totalGeralProduto++;

		}
		else {

			this.produtos.add(produto);
			this.totalProdutos++;
			this.totalGeralProduto++;
		}
	}

	public void removeProduto(int id) {
		if (id <= totalProdutos) {
			id--;
			ArrayList<Estoque> produtoRemovido = new ArrayList<Estoque>();
			if (totalProdutosRemovidos == 0) {
				produtoRemovido.add(produtos.get(id));
				produtosRemovidos = produtoRemovido;
				this.totalProdutosRemovidos++;

			}
			else {

				this.produtosRemovidos.add(produtos.get(id));
				this.totalProdutosRemovidos++;
			}


			Estoque produto = new Estoque();
			this.produtos.remove(id);
			for (int i = 0; i < this.totalProdutos-1; i++) {
				produto = this.produtos.get(i);
				produto.setId(i+1);
				produto.setNomeID(i+1 + "- " + produto.getNome());

			}
			this.totalProdutos--;
		}


	}

	public String contasReceber() {
		Cliente cliente = new Cliente();
		double valor = 0;
		String nomeCliente = "";
		double maiorValor = 0;
		for(int i =0; i < totalClientes; i++) {
			cliente = clientes.get(i);

			if(cliente.getDividaPendente() > maiorValor) {
				nomeCliente = cliente.getNome();
				maiorValor = cliente.getDividaPendente();

			}
			valor = valor + cliente.getDividaPendente();
		}

		String nome = "";
		nome = ("Valor total a receber é de: R$"+valor+ "\nO cliente com mais pendência é: "+ nomeCliente);

		return nome;

	}

	public void venda(int idCliente, int idProduto, int qtdComprado) {
		Cliente cliente = new Cliente();
		Estoque produto = new Estoque();
		cliente = this.clientes.get(idCliente-1);
		produto = this.produtos.get(idProduto-1);
		if ((produto.getValor()*qtdComprado) - cliente.getCredito() >= 0) {
			cliente.setDividaPendente(cliente.getDividaPendente() + ((produto.getValor()*qtdComprado)- cliente.getCredito()));
			cliente.setCredito(0);
		}
		else {
			cliente.setCredito(cliente.getCredito() - (qtdComprado*produto.getValor()));
		}
		double valorTotalCompra = (produto.getValor()*qtdComprado);

		HistoricoVenda venda = new HistoricoVenda(totalVendas+1, produto.getNome(), cliente.getNome(), qtdComprado, produto.getValor(), valorTotalCompra, cliente.getIdInterno(), produto.getIdInterno());
		ArrayList<HistoricoVenda> adicionarVenda = new ArrayList<HistoricoVenda>();
		if (totalVendas == 0) {
			adicionarVenda.add(venda);
			this.vendas = adicionarVenda;
			totalVendas++;
		}
		else {

			this.vendas.add(venda);
			totalVendas++;
		}

		if (produto.getQtd() - qtdComprado > 0)
			produto.setQtd(produto.getQtd() - qtdComprado);
		else if (produto.getQtd() - qtdComprado <= 0)
			this.removeProduto(idProduto);





	}

	public void devolveProduto (int idCompra, int qtd, boolean credito) {

		HistoricoVenda venda = new HistoricoVenda();
		Cliente cliente = new Cliente();
		Estoque produto = new Estoque();
		venda = vendas.get(idCompra-1);	
		if (qtd <= venda.getQtdProduto()) {
			for (int i = 0; i < totalClientes; i++) {
				cliente = clientes.get(i);
				if (venda.getIdInternoCliente() == cliente.getIdInterno()) {

					break;
				}
				else
					cliente = null;
			}
			for (int i = 0; i < totalProdutos; i++) {
				produto = produtos.get(i);
				if (venda.getIdInternoProduto() == produto.getIdInterno()) {

					break;
				}
				else 
					produto = null;
			}

			if (cliente == null)
				System.out.println("Cliente não encontrado");
			if (produto == null) {
				for (int i = 0; i < totalProdutosRemovidos; i++) {
					produto = produtosRemovidos.get(i);
					if (venda.getIdInternoProduto() == produto.getIdInterno()) {

						break;
					}
					else 
						produto = null;
				}
				this.adicionaProduto(produto.getNome(), produto.getFornecedor(), produto.getValor(), qtd);
				produtosRemovidos.remove(produto);

			}
			double valorRestante = 0;

			if (cliente != null) {
				venda.setQtdProduto(venda.getQtdProduto() - qtd);
				produto.setQtd(produto.getQtd() + qtd);


				valorRestante = (cliente.getDividaPendente() - (produto.getValor()*qtd));

				cliente.setDividaPendente(cliente.getDividaPendente() - (produto.getValor()*qtd));



				if (valorRestante * -1 > 0) {


					if (credito)
						cliente.setCredito(cliente.getCredito() + valorRestante* -1);

					else 
						cliente.setDividaPaga(cliente.getDividaPaga() - valorRestante* -1);

					cliente.setDividaPendente(0);
				}

				venda.setHouveDevolucao(true);
			}
		}

		else
			System.out.println("Quantidade devolvida maior do que a quantidade que havia sido vendida");





	}

	public void recebeCobranca(int idCliente, double valorRecebido) {
		Cliente cliente = new Cliente();
		cliente = this.clientes.get(idCliente-1);
		cliente.setDividaPendente(cliente.getDividaPendente() - valorRecebido);
		cliente.setDividaPaga(cliente.getDividaPaga() + valorRecebido);
		if (cliente.getDividaPendente() < 0) {
			cliente.setCredito(cliente.getCredito() + (cliente.getDividaPendente()*-1));
			cliente.setDividaPendente(0);
		}

	}

	public String consultaCliente (int id) {
		String info = "";
		Cliente cliente = new Cliente();
		cliente = this.clientes.get(id-1);
		info = ("Nome: " +cliente.getNome()
		+ "\nCPF: " + cliente.getCpf()
		+ "\nCidade: " + cliente.getCidade()
		+ "\nBairro: " + cliente.getBairro()
		+ "\nNúmero: " + cliente.getNumero()
		+ "\nTelefone: " + cliente.getTelefone()
		+ "\nData de cadastro: " + cliente.getData()
		+ "\n\nValor pendente: R$" +cliente.getDividaPendente()
		+ "\nValor quitado: R$" + cliente.getDividaPaga());

		if (cliente.getCredito() > 0)
			info = (info + "\nCréditos: R$" + cliente.getCredito());
		return info;
	}

	public String consultaProduto (int id) {
		String info = "";
		Estoque produto = new Estoque();
		produto = this.produtos.get(id-1);
		info = ("Nome: " +produto.getNome()
		+ "\nFornecedor: " + produto.getFornecedor()
		+ "\nQuantidade: " + produto.getQtd() + "x"
		+ "\nValor: R$" + produto.getValor()
		+ "\nData de cadastro: " + produto.getData());

		return info;
	}

	public String consultaVenda (int id) {
		String info = "";
		HistoricoVenda consultavenda = new HistoricoVenda();
		consultavenda = this.vendas.get(id-1);
		info = ("Cliente: " + consultavenda.getNomeCliente() + "\n"+
				"Produto: " + consultavenda.getNomeProduto() + "\n"+
				"Quantidade: " + consultavenda.getQtdProduto() + "\n"+
				"Data: " + consultavenda.getData() + "\n"+
				"Valor unitário: R$" + consultavenda.getValorProduto() + "\n"+
				"Valor total: R$" + consultavenda.getValorTotal());
		if (consultavenda.getDevolucao()) 
			info = info + ("\nPossui devolução: Sim" );

		else
			info = info + ("\nPossui devolução: Não" );
		return info;
	}

	public String montaPaginaCliente(int pagina, ArrayList<String> sublista, String lista, int totalItens) {

		if ((totalItens-(10*pagina)) > 10 && totalItens > 10) {

			lista = String.join("\n", sublista.subList((pagina*10), (pagina*10)+10));
			return lista;
		}
		else
			return this.montaUltimaPaginaCliente(sublista, lista, totalItens);

	}

	public String montaUltimaPaginaCliente(ArrayList<String> sublista, String lista, int totalItens) {
		int qtdUltimaListagem = totalItens%10;
		lista = String.join("\n", sublista.subList(totalItens-qtdUltimaListagem, totalItens));
		return lista;

	}


	public String montaListaCliente (int pagina) {
		int totalClientes = this.totalClientes;
		String lista = "";
		Cliente cliente = new Cliente();
		ArrayList<String> sublista = new ArrayList<String>();
		for (int i = 0; i < totalClientes; i++) {
			cliente = clientes.get(i);
			sublista.add(cliente.getNomeID());
		}
		pagina--;

		return this.montaPaginaCliente(pagina, sublista, lista, totalClientes);

	}

	public String montaListaClienteComPendencia  (int pagina) {

		int totalClientesComPendencia = 0; 

		ArrayList<String> sublista = new ArrayList<String>();

		String lista = "";
		Cliente cliente = new Cliente();
		for (int i = 0; i < this.totalClientes; i++) {
			cliente = clientes.get(i);
			if (cliente.getDividaPendente() > 0) {
				totalClientesComPendencia++;
				sublista.add(totalClientesComPendencia+"- "+cliente.getNome());
			}

		}
		pagina--;
		return this.montaPaginaCliente(pagina, sublista, lista, totalClientesComPendencia);

	}


	public String montaListaProduto  (int pagina) {

		int totalProdutos = this.totalProdutos;
		String lista = "";
		Estoque produto = new Estoque();
		ArrayList<String> sublista = new ArrayList<String>();
		for (int i = 0; i < totalProdutos; i++) {
			produto = produtos.get(i);
			sublista.add(produto.getNomeID());
		}
		pagina--;

		return this.montaPaginaCliente(pagina, sublista, lista, totalProdutos);

	}

	public String montaListaVendas  (int pagina) {

		int totalVendas = this.totalVendas;
		String lista = "";
		HistoricoVenda venda = new HistoricoVenda();
		ArrayList<String> sublista = new ArrayList<String>();
		for (int i = 0; i < this.totalVendas; i++) {
			venda = vendas.get(i);
			if (venda.getDevolucao())
				sublista.add(venda.getId() + "-" + venda.getNomeCliente() + " (" +venda.getQtdProduto() + "x " + venda.getNomeProduto()  +")"+ " *Possui devoluções");
			else
				sublista.add(venda.getId() + "-" + venda.getNomeCliente() + " (" +venda.getQtdProduto() + "x " + venda.getNomeProduto()+")");
		}
		pagina--;

		return this.montaPaginaCliente(pagina, sublista, lista, totalVendas);

	}



	public void removeUsuario (int id) {
		Usuario usuario = new Usuario();
		this.usuarios.remove(id-1);
		for (int i = 0; i < this.totalUsuarios; i++) {
			usuario = this.usuarios.get(i);
			usuario.setId(i+1);
			usuario.setUsuarioID(usuario.getId() + 1 + "- " + usuario.getUsuario());

		}
		this.totalUsuarios--;
	}

	public void adicionaUsuario (String login, String senha, String nome, String email, String telefone) {
		Usuario usuario = new Usuario(totalUsuarios, login, senha, nome, email, telefone);
		ArrayList<Usuario> adicionarUsuario = new ArrayList<Usuario>();
		if (totalUsuarios == 0) {
			adicionarUsuario.add(usuario);
			usuarios = adicionarUsuario;
			this.totalUsuarios++;
		}
		else {
			this.usuarios.add(usuario);
			totalUsuarios++;
		}
	}

	public boolean validaUsuario (String login, String senha) {
		Usuario usuario = new Usuario();
		for (int i = 0; i < totalUsuarios; i++){
			usuario = usuarios.get(i);
			if (login == usuario.getUsuario()) {
				if (senha == usuario.getSenha())
					return true;
				else
					return false;
			}
		}
		return false;
	}

	public String consultaUsuario (int id) {
		Usuario usuario = new Usuario();
		usuario = this.usuarios.get(id-1);
		String info = "";
		info = ("Usuário: " +usuario.getUsuario()
		+ "\nNome: " + usuario.getNome()
		+ "\nEmail: " + usuario.getEmail()
		+ "\nTelefone: " + usuario.getTelefone()
		+ "\nData de criação: " + usuario.getDataCriacao());

		return info;
	}

	public String listagemUsuario (int pagina) {
		String lista = "";
		Usuario usuario = new Usuario();
		ArrayList<String> sublista = new ArrayList<String>();
		for (int i = 0; i < totalUsuarios; i++) {
			usuario = usuarios.get(i);
			sublista.add(usuario.getUsuarioID());
		}
		pagina--;

		return this.montaPaginaCliente(pagina, sublista, lista, totalUsuarios);

	}


	









	public static boolean isCPF(String CPF) {
		if (CPF.equals("00000000000") ||
				CPF.equals("11111111111") ||
				CPF.equals("22222222222") || CPF.equals("33333333333") ||
				CPF.equals("44444444444") || CPF.equals("55555555555") ||
				CPF.equals("66666666666") || CPF.equals("77777777777") ||
				CPF.equals("88888888888") || CPF.equals("99999999999") ||
				(CPF.length() != 11))
			return(false);
		char dig10, dig11;
		int sm, i, r, num, peso;
		try {
			sm = 0;
			peso = 10;
			for (i=0; i<9; i++) {
				num = (int)(CPF.charAt(i) - 48);
				sm = sm + (num * peso);
				peso = peso - 1;
			}
			r = 11 - (sm % 11);
			if ((r == 10) || (r == 11))
				dig10 = '0';
			else dig10 = (char)(r + 48); 
			sm = 0;
			peso = 11;
			for(i=0; i<10; i++) {
				num = (int)(CPF.charAt(i) - 48);
				sm = sm + (num * peso);
				peso = peso - 1;
			}
			r = 11 - (sm % 11);
			if ((r == 10) || (r == 11))
				dig11 = '0';
			else dig11 = (char)(r + 48);
			if ((dig10 == CPF.charAt(9)) && (dig11 == CPF.charAt(10)))
				return(true);
			else return(false);
		} catch (InputMismatchException erro) {
			return(false);
		}
	}
	public static String imprimeCPF(String CPF) {
		return(CPF.substring(0, 3) + "." + CPF.substring(3, 6) + "." +
				CPF.substring(6, 9) + "-" + CPF.substring(9, 11));
	}
	public static boolean isNumeric(String strNum) {
		if (strNum == null) {
			return false;
		}
		try {

			@SuppressWarnings("unused")
			double d = Double.parseDouble(strNum);
		} catch (NumberFormatException nfe) {
			return false;
		}
		return true;
	}

}
