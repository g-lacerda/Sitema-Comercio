import javax.swing.JOptionPane;
import java.util.ArrayList;
public class Comercio {
	public static void main(String[] args) {
		try {
			ArrayList<Integer> idCliente = new ArrayList<Integer>();
			ArrayList<String> nomeCliente = new ArrayList<String>();
			ArrayList<String> cpfCliente = new ArrayList<String>();
			ArrayList<String> cidadeCliente = new ArrayList<String>();
			ArrayList<String> ruaCliente = new ArrayList<String>();
			ArrayList<String> numeroCliente = new ArrayList<String>();
			ArrayList<String> nomeClienteComID = new ArrayList<String>();
			ArrayList<Integer> idProduto = new ArrayList<Integer>();
			ArrayList<String> nomeProduto = new ArrayList<String>();
			ArrayList<String> fornecedorProduto = new ArrayList<String>();
			ArrayList<String> valorProduto = new ArrayList<String>();
			ArrayList<String> nomeProdutoComID = new ArrayList<String>();
			ArrayList<Integer> qtdProduto = new ArrayList<Integer>();
			ArrayList<Double> dividaPendente = new ArrayList<Double>();
			ArrayList<Double> dividaPaga = new ArrayList<Double>();
			ArrayList<String> pendenciaNomeClienteComID = new ArrayList<String>();
			ArrayList<String> pendenciaNomeCliente = new ArrayList<String>();
			
			Random random = new Random();
			nomeCliente.add("Antônio Aragão");nomeCliente.add("Antônio Duarte");nomeCliente.add("Lara Novaes");nomeCliente.add("Maitê Correia");nomeCliente.add("Carlos Eduardo Teixeira");nomeCliente.add("Nicolas Costela");nomeCliente.add("Maysa da Paz");nomeCliente.add("Sarah Ferreira");nomeCliente.add("João Miguel Gonçalves");nomeCliente.add("Ana Carolina da Cunha");nomeCliente.add("Juliana da Luz");nomeCliente.add("Juan Monteiro");nomeCliente.add("Thales Nogueira");nomeCliente.add("Luiza Cardoso");nomeCliente.add("Sophie das Neves");nomeCliente.add("Carlos Eduardo Martins");nomeCliente.add("Laura Nunes");nomeCliente.add("Marcela Ferreira");nomeCliente.add("Diego da Conceição");nomeCliente.add("Maria Cecília Monteiro");nomeCliente.add("Bruna Gomes");nomeCliente.add("Breno da Luz");nomeCliente.add("Raquel Silva");nomeCliente.add("Heloísa Lima");nomeCliente.add("Isabelly Jesus");nomeCliente.add("Bruna Fernandes");nomeCliente.add("Fernanda Moraes");nomeCliente.add("Vinicius Araújo");nomeCliente.add("Brenda Nogueira");nomeCliente.add("Ana Julia Costela");nomeCliente.add("Gabriel Santos");nomeCliente.add("Breno da Cruz");nomeCliente.add("Stella da Mata");nomeCliente.add("Davi Luiz Ribeiro");nomeCliente.add("Emanuelly Nogueira");nomeCliente.add("João Miguel das Neves");		
			cpfCliente.add("01511773685");cpfCliente.add("04193917622");cpfCliente.add("06795434656");cpfCliente.add("67215407624");cpfCliente.add("16340561675");cpfCliente.add("10325608601");cpfCliente.add("91482039630");cpfCliente.add("65490818662");cpfCliente.add("12064107606");cpfCliente.add("75053778680");cpfCliente.add("60927635674");cpfCliente.add("49811596689");cpfCliente.add("13712124651");cpfCliente.add("46109744603");cpfCliente.add("76079697645");cpfCliente.add("20794838626");cpfCliente.add("53767537605");cpfCliente.add("51361195606");cpfCliente.add("18791476615");cpfCliente.add("07837158628");cpfCliente.add("43276762684");cpfCliente.add("53810121606");cpfCliente.add("12777023654");cpfCliente.add("84370297672");cpfCliente.add("33510013638");cpfCliente.add("71166790657");cpfCliente.add("52089670657");cpfCliente.add("56523784681");cpfCliente.add("45760244698");cpfCliente.add("13334744663");cpfCliente.add("10404504663");cpfCliente.add("38437009669");cpfCliente.add("39557372680");cpfCliente.add("44828014616");cpfCliente.add("81826670629");cpfCliente.add("90593600606");
			ruaCliente.add("Avenida Afonso Pena");ruaCliente.add("Rua Arlindo Nogueira");ruaCliente.add("Rua das Fiandeiras");ruaCliente.add("Rua Tenente-Coronel Cardoso");ruaCliente.add("Avenida Rio Branco");ruaCliente.add("Rua Serra de Bragança");ruaCliente.add("Avenida Governador José Malcher");ruaCliente.add("Rua Carlos Augusto Cornelsen");ruaCliente.add("Rua Pereira Estéfano");ruaCliente.add("Rua Carlos Augusto Cornelsen");ruaCliente.add("Rua Frederico Moura");ruaCliente.add("Rua Arlindo Nogueira");ruaCliente.add("Rua Carlos Augusto Cornelsen");ruaCliente.add("Rua Paracatu");ruaCliente.add("Avenida Governador José Malcher");ruaCliente.add("Rua Serra de Bragança");ruaCliente.add("Rua Carlos Augusto Cornelsen");ruaCliente.add("Avenida Governador José Malcher");ruaCliente.add("Avenida Rio Branco");ruaCliente.add("Avenida São João");ruaCliente.add("Avenida Rio Branco");ruaCliente.add("Avenida Tocantins");ruaCliente.add("Rua Arlindo Nogueira");ruaCliente.add("Rua da Imprensa");ruaCliente.add("Rua Arlindo Nogueira");ruaCliente.add("Rua Carlos Augusto Cornelsen");ruaCliente.add("Avenida Tocantins");ruaCliente.add("Rua Paracatu");ruaCliente.add("Rua Serra de Bragança");ruaCliente.add("Rua Arlindo Nogueira");ruaCliente.add("Rua Frederico Moura");ruaCliente.add("Rua Paracatu");ruaCliente.add("Avenida Afonso Pena");ruaCliente.add("Rua Serra de Bragança");ruaCliente.add("Avenida Governador José Malcher");ruaCliente.add("Avenida São João");
			cidadeCliente.add("Teresina");cidadeCliente.add("São Mateus");cidadeCliente.add("Vila Pavão");cidadeCliente.add("Londrina");cidadeCliente.add("Campo Grande");cidadeCliente.add("São Paulo");cidadeCliente.add("Vila Pavão");cidadeCliente.add("Londrina");cidadeCliente.add("Belo Horizonte");cidadeCliente.add("Belo Horizonte");cidadeCliente.add("Belo Horizonte");cidadeCliente.add("Cotia");cidadeCliente.add("São Paulo");cidadeCliente.add("São Paulo");cidadeCliente.add("Nova Cruz");cidadeCliente.add("Brasília");cidadeCliente.add("Belo Horizonte");cidadeCliente.add("São Mateus");cidadeCliente.add("Fortaleza");cidadeCliente.add("Vila Pavão");cidadeCliente.add("São Paulo");cidadeCliente.add("Franca");cidadeCliente.add("São Mateus");cidadeCliente.add("Jundiaí");cidadeCliente.add("Franca");cidadeCliente.add("Gramado");cidadeCliente.add("Araçatuba");cidadeCliente.add("Capanema");cidadeCliente.add("Assaí");cidadeCliente.add("Nova Cruz");cidadeCliente.add("Nova Cruz");cidadeCliente.add("Capanema");cidadeCliente.add("Belém");cidadeCliente.add("Belo Horizonte");cidadeCliente.add("Jataí");cidadeCliente.add("São Paulo");
			nomeProduto.add("Martelo");nomeProduto.add("Prego");nomeProduto.add("Lanterna");nomeProduto.add("Porca");nomeProduto.add("Parafuso");nomeProduto.add("Ruela");nomeProduto.add("Cano PVC");nomeProduto.add("Tinta");nomeProduto.add("Pincel");nomeProduto.add("Cimento");nomeProduto.add("Areia");nomeProduto.add("Britadeira");nomeProduto.add("Tambor");nomeProduto.add("Durex");nomeProduto.add("Super cola");nomeProduto.add("Chave de fenda");nomeProduto.add("Alicate");nomeProduto.add("Chave inglesa");nomeProduto.add("Azulejo");nomeProduto.add("Arame");nomeProduto.add("Grade");nomeProduto.add("Tábua");nomeProduto.add("Verniz");
			for (int i = 1; i < 24; i++) {
				idProduto.add(i);
				if (i%2 == 0)
					fornecedorProduto.add("Caslar");
				if (i%2 != 0)
					fornecedorProduto.add("Casa Rios");
				valorProduto.add(Integer.toString(random.nextInt(4000)));
				qtdProduto.add(random.nextInt(1100));
				nomeProdutoComID.add(i + "- " + nomeProduto.get(i-1));
			}
			double x = 0;
			for(int i = 1; i < 37; i++) {
				nomeClienteComID.add(i + "- " + nomeCliente.get(i-1));
				idCliente.add(i);
				numeroCliente.add(Integer.toString(random.nextInt(2601)));
				x = (random.nextInt(8960));
				dividaPendente.add(x);
				dividaPaga.add(x/4);
			} 
			String  validaQtdProduto = "", nomeMaiorDivida = "", listaClientes = "", validarCPF = "", auxNomeCliente = "", consultaCliente = "";
			int confirmarRemocao = 0, opcaoConsulta = 0, opcaoMenu = -1, opcaoModulos = -1, qtdPenultimaListagem = 0, auxListarClientes = 0, qtdClientesListados = 0, qtdClientes = 0, qtdClientesNaoListados = 0, opcaoFuncao = 0, qtdUltimaListagem = 0;
			boolean opcaoVoltar = false, todosClientesListados = false, sistemaLigado = true, moduloCliente = false, moduloEstoque = false, moduloFinanceiro = false;
			boolean voltarListaConsultaCliente = false, listarClientes = false, adicionarCliente = false, removerCliente = false, buscarCliente = false, contasReceber = false, listaClientesComPendencias = false, receberValor = false;
			double valorRecebido = 0, valorTotalReceber = 0, maiorDivida = 0;
			String listaProdutos = "", auxNomeProduto = "", consultaProduto = "";
			int auxListarProdutos = 0, qtdProdutosListados = 0, qtdProdutos = 0, qtdProdutosNaoListados = 0, idProdutoVendido = 0, idComprador = 0;
			boolean todosProdutosListados = false, venderProduto = false;
			boolean voltarListaConsultaProduto = false, listarProdutos = false, adicionarProduto = false, removerProduto = false, buscarProduto = false;
			JOptionPane.showMessageDialog(null, "Seja bem-vindo!\n\nPor:\nGuilherme Lacerda\nLuciano Bueno\nRhuan Martins");
			while(sistemaLigado) {
				opcaoMenu = Integer.parseInt(JOptionPane.showInputDialog("Qual módulo deseja acessar?"
						+ "\n1- Cliente"
						+ "\n2- Estoque"
						+ "\n3- Financeiro"
						+ "\n4- Finalizar o sistema"));
				while (opcaoMenu > 4 || opcaoMenu < 1) {
					opcaoMenu = Integer.parseInt(JOptionPane.showInputDialog("Escolha uma opção válida."
							+ "\n\nQual módulo deseja acessar?"
							+ "\n1- Cliente"
							+ "\n2- Estoque"
							+ "\n3- Financeiro"
							+ "\n4- Finalizar o sistema"));
				}
				if (opcaoMenu == 1) 
					moduloCliente = true;
				else if (opcaoMenu == 2)
					moduloEstoque = true;
				else if (opcaoMenu == 3) 
					moduloFinanceiro = true;
				else {
					JOptionPane.showMessageDialog(null, "Sistema finalizado.");
					break;}
				while (moduloCliente) {
					opcaoModulos = Integer.parseInt(JOptionPane.showInputDialog("Qual módulo deseja acessar?"
							+ "\n1- Listar clientes"
							+ "\n2- Adicionar cliente"
							+ "\n3- Remover cliente"
							+ "\n4- Consultar cliente"
							+ "\n5- Voltar"));
					while (opcaoModulos > 5 || opcaoModulos < 1) {
						opcaoModulos = Integer.parseInt(JOptionPane.showInputDialog("Escolha uma opção válida."
								+"\n\nQual módulo deseja acessar?"
								+ "\n1- Listar clientes"
								+ "\n2- Adicionar clientes"
								+ "\n3- Remover cliente"
								+ "\n4- Consultar cliente"
								+ "\n5- Voltar"));
					}
					if (opcaoModulos == 1) 
						listarClientes = true;
					else if (opcaoModulos == 2)
						adicionarCliente = true;
					else if (opcaoModulos == 3) 
						removerCliente = true;
					else if (opcaoModulos == 4)
						buscarCliente = true;
					else {
						moduloCliente = false;
						break;
					}
					while(listarClientes) {
						qtdClientes = nomeClienteComID.size();
						if(qtdClientes < 1) {
							JOptionPane.showMessageDialog(null, "Não há clientes cadastrados no sistema.");
							listarClientes = false;
							break;
						}
						qtdClientesNaoListados = nomeClienteComID.size();
						qtdClientesNaoListados -= qtdClientesListados;
						if (opcaoVoltar) {
							if (qtdClientesListados > 10) {
								listaClientes = String.join("\n", nomeClienteComID.subList(qtdClientesListados-(10+qtdUltimaListagem), qtdClientesListados-qtdUltimaListagem));
								qtdClientesListados -= qtdUltimaListagem;
								qtdClientesNaoListados += qtdUltimaListagem; 
								qtdUltimaListagem = 10;
							}
						}
						else if (todosClientesListados == false) {
							if (qtdClientesNaoListados < 10) {
								if (qtdClientes > 10 && qtdClientesListados > 10)
									qtdPenultimaListagem = 10;
								qtdUltimaListagem = qtdClientesNaoListados;
								listaClientes = String.join("\n", nomeClienteComID.subList(qtdClientesListados, qtdClientesListados+qtdClientesNaoListados));
								qtdClientesListados += qtdClientesNaoListados;
							}
							else if (qtdClientesNaoListados >= 10) {
								qtdUltimaListagem = 10;
								listaClientes = String.join("\n", nomeClienteComID.subList(qtdClientesListados, qtdClientesListados+10));
								qtdClientesListados += 10;
							}
						}
						if (qtdClientesListados == qtdClientes)
							todosClientesListados = true;
						opcaoFuncao = Integer.parseInt(JOptionPane.showInputDialog(
								"\n"
										+ listaClientes
										+ "\n\nTotal de clientes: " + qtdClientes
										+ "\nClientes listados: " + qtdClientesListados
										+ "\n\n\n1- Próxima página"
										+ "\n2- Voltar Página"
										+ "\n3- Voltar ao menu "));
						while (opcaoFuncao > 3 || opcaoFuncao < 1) {
							opcaoFuncao = Integer.parseInt(JOptionPane.showInputDialog(
									"\n"
											+ listaClientes
											+ "\n\nTotal de clientes: " + qtdClientes
											+ "\nClientes listados: " + qtdClientesListados
											+ "\n\n\nSELECIONE UMA OPÇÃO VÁLIDA!"
											+ "\n\n1- Próxima página"
											+ "\n2- Voltar Página"
											+ "\n3- Voltar ao menu "));
						}
						opcaoVoltar = false;
						if (opcaoFuncao == 3) {
							qtdClientesListados = 0;
							qtdPenultimaListagem = 0;
							qtdClientesNaoListados = idCliente.size();
							listarClientes = false;
							todosClientesListados = false;
							break;
						}
						if (opcaoFuncao == 2) {
							opcaoVoltar = true;
							if (qtdClientesListados > 10) 
								todosClientesListados = false;
							else
								JOptionPane.showMessageDialog(null, "Não há páginas para voltar.");
						}
						else {
							if (qtdClientesListados == qtdClientes) {
								JOptionPane.showMessageDialog(null, "Todos clientes já foram listados.");
							}
						}
					}
					while (adicionarCliente) {
						idCliente.add(idCliente.size()+1);
						auxNomeCliente = JOptionPane.showInputDialog("Digite o nome do cliente:");
						try {
							while (Integer.parseInt(auxNomeCliente) == 0 || Integer.parseInt(auxNomeCliente) == 1 || Integer.parseInt(auxNomeCliente) == 2 || Integer.parseInt(auxNomeCliente) == 3 || Integer.parseInt(auxNomeCliente) == 4 || Integer.parseInt(auxNomeCliente) == 5 || Integer.parseInt(auxNomeCliente) == 6 || Integer.parseInt(auxNomeCliente) == 7 || Integer.parseInt(auxNomeCliente) == 8 || Integer.parseInt(auxNomeCliente) == 9)
								auxNomeCliente = JOptionPane.showInputDialog("O nome do cliente deve ser diferente de números de 0 a 9.\nDigite o nome do cliente:");
						}
						catch (NumberFormatException e){
							nomeClienteComID.add(idCliente.size() + "- " + auxNomeCliente);	
							nomeCliente.add(auxNomeCliente);
						}
						finally {
							while (nomeCliente.get(nomeCliente.size()-1) == null || nomeCliente.get(nomeCliente.size()-1) == "") {
								auxNomeCliente = JOptionPane.showInputDialog("Digite o nome do cliente:");
								nomeCliente.set(nomeCliente.size()-1, auxNomeCliente);
								nomeClienteComID.set(nomeCliente.size()-1, idCliente.size() + "- " + auxNomeCliente);
							}
							validarCPF = (JOptionPane.showInputDialog("Digite o CPF do cliente:"));
							while (ValidaCPF.isCPF(validarCPF) == false) {
								validarCPF = (JOptionPane.showInputDialog("CPF Inválido!"
										+ "\nDigite novamente:"));
							}
							if (ValidaCPF.isCPF(validarCPF) == true) {
								JOptionPane.showMessageDialog(null, "CPF Válido");
								cpfCliente.add(validarCPF);
							}
							cidadeCliente.add(JOptionPane.showInputDialog("O cliente mora em qual cidade?"));
							ruaCliente.add(JOptionPane.showInputDialog("O cliente mora em qual rua?"));
							numeroCliente.add(JOptionPane.showInputDialog("Qual número da casa/apartamento do cliente?"));
							dividaPendente.add(0.0);
							dividaPaga.add(0.0);
							JOptionPane.showMessageDialog(null, "Cliente " + nomeCliente.get(nomeCliente.size() - 1) + " adicionado.");
							qtdClientes++;
							qtdClientesListados = 0;
							qtdPenultimaListagem = 0;
							qtdClientesNaoListados = idCliente.size();
							adicionarCliente = false;
						}
					}
					while (removerCliente) {
						qtdClientes = idCliente.size();
						if(qtdClientes < 1) {
							JOptionPane.showMessageDialog(null, "Não há clientes cadastrados no sistema.");
							removerCliente = false;
							break;
						}
						qtdClientesNaoListados = idCliente.size();
						qtdClientesNaoListados -= qtdClientesListados;
						if (opcaoVoltar) {
							if (qtdClientesListados > 10) {
								listaClientes = String.join("\n", nomeClienteComID.subList(qtdClientesListados-(10+qtdUltimaListagem), qtdClientesListados-qtdUltimaListagem));
								qtdClientesListados -= qtdUltimaListagem;
								qtdClientesNaoListados += qtdUltimaListagem; 
								qtdUltimaListagem = 10;
							}
						}
						else if (todosClientesListados == false) {
							if (qtdClientesNaoListados < 10) {
								if (qtdClientes > 10 && qtdClientesListados > 10)
									qtdPenultimaListagem = 10;
								qtdUltimaListagem = qtdClientesNaoListados;
								listaClientes = String.join("\n", nomeClienteComID.subList(qtdClientesListados, qtdClientesListados+qtdClientesNaoListados));
								qtdClientesListados += qtdClientesNaoListados;
							}
							else if (qtdClientesNaoListados >= 10) {
								qtdUltimaListagem = 10;
								listaClientes = String.join("\n", nomeClienteComID.subList(qtdClientesListados, qtdClientesListados+10));
								qtdClientesListados += 10;
							}
						}
						if (qtdClientesListados == qtdClientes)
							todosClientesListados = true;
						opcaoFuncao = Integer.parseInt(JOptionPane.showInputDialog(
								"\n"
										+ listaClientes
										+ "\n\nTotal de clientes: " + qtdClientes
										+ "\nClientes listados: " + qtdClientesListados
										+ "\n\n"+ (idCliente.size() +1) + "- Próxima página"
										+ "\n"+(idCliente.size() +2)+"- Voltar Página"
										+ "\n"+(idCliente.size() +3)+"- Voltar ao menu "
										+"\nSelecione o ID do cliente que deseja remover, ou qual ação deseja que seja feita:"));
						while (opcaoFuncao > idCliente.size() +3 || opcaoFuncao < 1) {
							opcaoFuncao = Integer.parseInt(JOptionPane.showInputDialog(
									"\n"
											+ listaClientes
											+ "\n\nTotal de clientes: " + qtdClientes
											+ "\nClientes listados: " + qtdClientesListados
											+ "\n\n\nSELECIONE UMA OPÇÃO VÁLIDA!"
											+ "\n\n"+( idCliente.size() +1) + "- Próxima página"
											+ "\n"+(idCliente.size() +2)+"- Voltar Página"
											+ "\n"+(idCliente.size() +3)+"- Voltar ao menu "
											+"\nSelecione o ID do cliente que deseja remover, ou qual ação deseja que seja feita:"));
						}
						opcaoVoltar = false;
						if (opcaoFuncao < (idCliente.size() + 1)) {
							confirmarRemocao = Integer.parseInt(JOptionPane.showInputDialog("Você deseja remover o cliente " + nomeCliente.get(opcaoFuncao-1) + "?\nDigite 1 para remover, e 2 para cancelar."));
							while (confirmarRemocao != 2 && confirmarRemocao != 1) 
								confirmarRemocao = Integer.parseInt(JOptionPane.showInputDialog("SELECIONE UMA OPÇÃO VÁLIDA!\nVocê deseja remover o cliente " + nomeCliente.get(opcaoFuncao-1) + "?\nDigite 1 para remover, e 2 para cancelar."));
							if (confirmarRemocao == 2) {
								qtdClientesListados = 0;
								qtdPenultimaListagem = 0;
								qtdClientesNaoListados = idCliente.size();
							}
							else if (confirmarRemocao == 1) {
								JOptionPane.showMessageDialog(null, "O cliente " + nomeCliente.get(opcaoFuncao-1) + " foi removido.");
								idCliente.remove(idCliente.size()-1);
								nomeCliente.remove(opcaoFuncao-1);
								nomeClienteComID.remove(opcaoFuncao-1);
								cpfCliente.remove(opcaoFuncao-1);
								cidadeCliente.remove(opcaoFuncao-1);
								ruaCliente.remove(opcaoFuncao-1);
								numeroCliente.remove(opcaoFuncao-1);
								dividaPendente.remove(opcaoFuncao-1);
								dividaPaga.remove(opcaoFuncao-1);
								nomeClienteComID.removeAll(nomeClienteComID);
								for(int i = 1; i < nomeCliente.size()+1; i++)
									nomeClienteComID.add(i + "- " + nomeCliente.get(i-1));
								qtdClientesListados = 0;
								qtdPenultimaListagem = 0;
								qtdClientesNaoListados = idCliente.size();
								removerCliente = false;
								confirmarRemocao = 0;
								todosClientesListados = false;
								break;
							}
						}
						else if (opcaoFuncao == (idCliente.size() + 3)) {
							qtdClientesListados = 0;
							qtdPenultimaListagem = 0;
							qtdClientesNaoListados = idCliente.size();
							removerCliente = false;
							confirmarRemocao = 0;
							todosClientesListados = false;
							break;
						}
						else if (opcaoFuncao == (idCliente.size() + 2)) {
							opcaoVoltar = true;
							if (qtdClientesListados > 10) 
								todosClientesListados = false;
							else
								JOptionPane.showMessageDialog(null, "Não há páginas para voltar.");
						}
						else if (opcaoFuncao == (idCliente.size() + 1)) {
							if (qtdClientesListados == qtdClientes) {
								JOptionPane.showMessageDialog(null, "Todos clientes já foram listados.");
							}
						}
					}
					while (buscarCliente) {
						qtdClientes = idCliente.size();
						if(qtdClientes < 1) {
							JOptionPane.showMessageDialog(null, "Não há clientes cadastrados no sistema.");
							buscarCliente = false;
							break;
						}
						qtdClientesNaoListados = idCliente.size();
						qtdClientesNaoListados -= qtdClientesListados;
						if (opcaoVoltar) {
							if (qtdClientesListados > 10) {
								listaClientes = String.join("\n", nomeClienteComID.subList(qtdClientesListados-(10+qtdUltimaListagem), qtdClientesListados-qtdUltimaListagem));
								qtdClientesListados -= qtdUltimaListagem;
								qtdClientesNaoListados += qtdUltimaListagem; 
								qtdUltimaListagem = 10;
							}
						}
						else if (todosClientesListados == false && voltarListaConsultaCliente != true) {
							if (qtdClientesNaoListados < 10) {
								if (qtdClientes > 10 && qtdClientesListados > 10)
									qtdPenultimaListagem = 10;
								qtdUltimaListagem = qtdClientesNaoListados;
								listaClientes = String.join("\n", nomeClienteComID.subList(qtdClientesListados, qtdClientesListados+qtdClientesNaoListados));
								qtdClientesListados += qtdClientesNaoListados;
							}
							else if (qtdClientesNaoListados >= 10) {
								qtdUltimaListagem = 10;
								listaClientes = String.join("\n", nomeClienteComID.subList(qtdClientesListados, qtdClientesListados+10));
								qtdClientesListados += 10;
							}
						}
						if (qtdClientesListados == qtdClientes)
							todosClientesListados = true;
						opcaoFuncao = Integer.parseInt(JOptionPane.showInputDialog(
								"\n"
										+ listaClientes
										+ "\n\nTotal de clientes: " + qtdClientes
										+ "\nClientes listados: " + qtdClientesListados
										+ "\n\n"+( idCliente.size() +1) + "- Próxima página"
										+ "\n"+(idCliente.size() +2)+"- Voltar Página"
										+ "\n"+(idCliente.size() +3)+"- Voltar ao menu "
										+"\nSelecione o ID do cliente que deseja consultar, ou qual ação deseja que seja feita:"));
						while (opcaoFuncao > idCliente.size() +3 || opcaoFuncao < 1) {
							opcaoFuncao = Integer.parseInt(JOptionPane.showInputDialog(
									"\n"
											+ listaClientes
											+ "\n\nTotal de clientes: " + qtdClientes
											+ "\nClientes listados: " + qtdClientesListados
											+ "\n\n\nSELECIONE UMA OPÇÃO VÁLIDA!"
											+ "\n\n"+( idCliente.size() +1) + "- Próxima página"
											+ "\n"+(idCliente.size() +2)+"- Voltar Página"
											+ "\n"+(idCliente.size() +3)+"- Voltar ao menu "
											+"\nSelecione o ID do cliente que deseja consultar, ou qual ação deseja que seja feita:"));
						}
						opcaoVoltar = false;
						voltarListaConsultaCliente = false;
						if (opcaoFuncao < (idCliente.size() + 1)) {
							consultaCliente = "Nome do cliente: " + nomeCliente.get(opcaoFuncao-1)
							+ "\nCPF: " + cpfCliente.get(opcaoFuncao-1)
							+ "\nCidade: " + cidadeCliente.get(opcaoFuncao-1)
							+ "\nRua: " + ruaCliente.get(opcaoFuncao-1)
							+ "\nNúmero: " + numeroCliente.get(opcaoFuncao-1)
							+ "\n\nValor pendente: " + dividaPendente.get(opcaoFuncao-1)
							+ "\nValor pago: " + dividaPaga.get(opcaoFuncao-1);
							opcaoConsulta = Integer.parseInt(JOptionPane.showInputDialog(
									consultaCliente
									+ "\n\n1- Voltar"));
							while (opcaoConsulta != 1) {
								opcaoConsulta = Integer.parseInt(JOptionPane.showInputDialog(
										consultaCliente
										+ "\n\n1- Voltar"
										+ "\nSELECIONE 1 PARA VOLTAR!"));	
							}
							if (opcaoConsulta == 1) 
								voltarListaConsultaCliente = true;		
						}
						if (opcaoFuncao == (idCliente.size() +3)) {
							qtdClientesListados = 0;
							qtdPenultimaListagem = 0;
							qtdClientesNaoListados = idCliente.size();
							buscarCliente = false;
							todosClientesListados = false;
							break;
						}
						if (opcaoFuncao == (idCliente.size() +2)) {
							opcaoVoltar = true;
							if (qtdClientesListados > 10) 
								todosClientesListados = false;
							else
								JOptionPane.showMessageDialog(null, "Não há páginas para voltar.");
						}
						else if (opcaoFuncao == (idCliente.size() +1)) {
							if (qtdClientesListados == qtdClientes) {
								JOptionPane.showMessageDialog(null, "Todos clientes já foram listados.");
							}
						}
					}
				}
				while (moduloEstoque) {
					opcaoModulos = Integer.parseInt(JOptionPane.showInputDialog("Qual módulo deseja acessar?"
							+ "\n1- Listar produto"
							+ "\n2- Adicionar produto"
							+ "\n3- Remover produto"
							+ "\n4- Consultar produto"
							+ "\n5- Vender produto"
							+ "\n6- Voltar"));
					while (opcaoModulos > 6 || opcaoModulos < 1) {
						opcaoModulos = Integer.parseInt(JOptionPane.showInputDialog("Escolha uma opção válida."
								+"\n\nQual módulo deseja acessar?"
								+ "\n1- Listar produto"
								+ "\n2- Adicionar produto"
								+ "\n3- Remover produto"
								+ "\n4- Consultar produto"
								+ "\n5- Vender produto"
								+ "\n6- Voltar"));
					}
					if (opcaoModulos == 1) 
						listarProdutos = true;
					else if (opcaoModulos == 2)
						adicionarProduto = true;
					else if (opcaoModulos == 3) 
						removerProduto = true;
					else if (opcaoModulos == 4)
						buscarProduto = true;
					else if (opcaoModulos == 5)
						venderProduto = true;
					else {
						moduloEstoque = false;
						break;
					}
					while(listarProdutos) {
						qtdProdutos = idProduto.size();
						if(qtdProdutos < 1) {
							JOptionPane.showMessageDialog(null, "Não há produto cadastrados no sistema.");
							listarProdutos = false;
							break;
						}
						qtdProdutosNaoListados = idProduto.size();
						qtdProdutosNaoListados -= qtdProdutosListados;
						if (opcaoVoltar) {
							if (qtdProdutosListados > 10) {
								listaProdutos = String.join("\n", nomeProdutoComID.subList(qtdProdutosListados-(10+qtdUltimaListagem), qtdProdutosListados-qtdUltimaListagem));
								qtdProdutosListados -= qtdUltimaListagem;
								qtdProdutosNaoListados += qtdUltimaListagem; 
								qtdUltimaListagem = 10;
							}
						}
						else if (todosProdutosListados == false) {
							if (qtdProdutosNaoListados < 10) {
								if (qtdProdutos > 10 && qtdProdutosListados > 10)
									qtdPenultimaListagem = 10;
								qtdUltimaListagem = qtdProdutosNaoListados;
								listaProdutos = String.join("\n", nomeProdutoComID.subList(qtdProdutosListados, qtdProdutosListados+qtdProdutosNaoListados));
								qtdProdutosListados += qtdProdutosNaoListados;
							}
							else if (qtdProdutosNaoListados >= 10) {
								qtdUltimaListagem = 10;
								listaProdutos = String.join("\n", nomeProdutoComID.subList(qtdProdutosListados, qtdProdutosListados+10));
								qtdProdutosListados += 10;
							}
						}
						if (qtdProdutosListados == qtdProdutos)
							todosProdutosListados = true;
						opcaoFuncao = Integer.parseInt(JOptionPane.showInputDialog(
								"\n"
										+ listaProdutos
										+ "\n\nTotal de produto: " + qtdProdutos
										+ "\nProduto listados: " + qtdProdutosListados
										+ "\n\n\n1- Próxima página"
										+ "\n2- Voltar Página"
										+ "\n3- Voltar ao menu "));
						while (opcaoFuncao > 3 || opcaoFuncao < 1) {
							opcaoFuncao = Integer.parseInt(JOptionPane.showInputDialog(
									"\n"
											+ listaProdutos
											+ "\n\nTotal de produto: " + qtdProdutos
											+ "\nProduto listados: " + qtdProdutosListados
											+ "\n\n\nSELECIONE UMA OPÇÃO VÁLIDA!"
											+ "\n\n1- Próxima página"
											+ "\n2- Voltar Página"
											+ "\n3- Voltar ao menu "));
						}
						opcaoVoltar = false;
						if (opcaoFuncao == 3) {
							qtdProdutosListados = 0;
							qtdPenultimaListagem = 0;
							qtdProdutosNaoListados = idProduto.size();
							listarProdutos = false;
							break;
						}
						if (opcaoFuncao == 2) {
							opcaoVoltar = true;
							if (qtdProdutosListados > 10) 
								todosProdutosListados = false;
							else
								JOptionPane.showMessageDialog(null, "Não há páginas para voltar.");
						}
						else {
							if (qtdProdutosListados == qtdProdutos) {
								JOptionPane.showMessageDialog(null, "Todos produtos já foram listados.");
							}
						}
					}
					if (adicionarProduto) {
						idProduto.add(idProduto.size()+1);
						auxNomeProduto = JOptionPane.showInputDialog("Digite o nome do produtos:");
						try {
							while (Integer.parseInt(auxNomeProduto) == 0 || Integer.parseInt(auxNomeProduto) == 1 || Integer.parseInt(auxNomeProduto) == 2 || Integer.parseInt(auxNomeProduto) == 3 || Integer.parseInt(auxNomeProduto) == 4 || Integer.parseInt(auxNomeProduto) == 5 || Integer.parseInt(auxNomeProduto) == 6 || Integer.parseInt(auxNomeProduto) == 7 || Integer.parseInt(auxNomeProduto) == 8 || Integer.parseInt(auxNomeProduto) == 9)
								auxNomeProduto = JOptionPane.showInputDialog("O nome do produto deve ser diferente de números de 0 a 9.\nDigite o nome do produto:");
						}
						catch (NumberFormatException e){
							nomeProdutoComID.add(idProduto.size() + "- " + auxNomeProduto);	
							nomeProduto.add(auxNomeProduto);
						}
						finally {
							fornecedorProduto.add(JOptionPane.showInputDialog("Qual o fornecedor do produto? "));
							valorProduto.add(JOptionPane.showInputDialog("Qual o valor do produto? "));
							validaQtdProduto = (JOptionPane.showInputDialog("Quantas unidades serão adicionadas? "));
							while (ValidaCPF.isNumeric(validaQtdProduto) == false)
								validaQtdProduto = (JOptionPane.showInputDialog("Quantas unidades serão adicionadas?\nDIGITE UM VALOR NUMÉRICO!"));
							if (ValidaCPF.isNumeric(validaQtdProduto))
								qtdProduto.add(Integer.parseInt(validaQtdProduto));
							JOptionPane.showMessageDialog(null, "produto " + nomeProduto.get(nomeProduto.size() - 1) + " adicionado.");
							qtdProdutos++;
							adicionarProduto = false;
						}
					}
					while (removerProduto) {
						qtdProdutos = idProduto.size();
						if(qtdProdutos < 1) {
							JOptionPane.showMessageDialog(null, "Não há produto cadastrados no sistema.");
							removerProduto = false;
							break;
						}
						qtdProdutosNaoListados = idProduto.size();
						qtdProdutosNaoListados -= qtdProdutosListados;
						if (opcaoVoltar) {
							if (qtdProdutosListados > 10) {
								listaProdutos = String.join("\n", nomeProdutoComID.subList(qtdProdutosListados-(10+qtdUltimaListagem), qtdProdutosListados-qtdUltimaListagem));
								qtdProdutosListados -= qtdUltimaListagem;
								qtdProdutosNaoListados += qtdUltimaListagem; 
								qtdUltimaListagem = 10;
							}
						}
						else if (todosProdutosListados == false) {
							if (qtdProdutosNaoListados < 10) {
								if (qtdProdutos > 10 && qtdProdutosListados > 10)
									qtdPenultimaListagem = 10;
								qtdUltimaListagem = qtdProdutosNaoListados;
								listaProdutos = String.join("\n", nomeProdutoComID.subList(qtdProdutosListados, qtdProdutosListados+qtdProdutosNaoListados));
								qtdProdutosListados += qtdProdutosNaoListados;
							}
							else if (qtdProdutosNaoListados >= 10) {
								qtdUltimaListagem = 10;
								listaProdutos = String.join("\n", nomeProdutoComID.subList(qtdProdutosListados, qtdProdutosListados+10));
								qtdProdutosListados += 10;
							}
						}
						if (qtdProdutosListados == qtdProdutos)
							todosProdutosListados = true;
						opcaoFuncao = Integer.parseInt(JOptionPane.showInputDialog(
								"\n"
										+ listaProdutos
										+ "\n\nTotal de produtos: " + qtdProdutos
										+ "\nProduto listados: " + qtdProdutosListados
										+ "\n\n"+ (idProduto.size() +1) + "- Próxima página"
										+ "\n"+(idProduto.size() +2)+"- Voltar Página"
										+ "\n"+(idProduto.size() +3)+"- Voltar ao menu "
										+"\nSelecione o ID do produto que deseja remover, ou qual ação deseja que seja feita:"));
						while (opcaoFuncao > idProduto.size() +3 || opcaoFuncao < 1) {
							opcaoFuncao = Integer.parseInt(JOptionPane.showInputDialog(
									"\n"
											+ listaProdutos
											+ "\n\nTotal de produtos: " + qtdProdutos
											+ "\nProduto listados: " + qtdProdutosListados
											+ "\n\n\nSELECIONE UMA OPÇÃO VÁLIDA!"
											+ "\n\n"+( idProduto.size() +1) + "- Próxima página"
											+ "\n"+(idProduto.size() +2)+"- Voltar Página"
											+ "\n"+(idProduto.size() +3)+"- Voltar ao menu "
											+"\nSelecione o ID do produto que deseja remover, ou qual ação deseja que seja feita:"));
						}
						opcaoVoltar = false;
						if (opcaoFuncao < (idProduto.size() + 1)) {
							confirmarRemocao = Integer.parseInt(JOptionPane.showInputDialog("Você deseja remover o produto " + nomeProduto.get(opcaoFuncao-1) + "?\nDigite 1 para remover, e 2 para cancelar."));
							while (confirmarRemocao != 2 && confirmarRemocao != 1) 
								confirmarRemocao = Integer.parseInt(JOptionPane.showInputDialog("SELECIONE UMA OPÇÃO VÁLIDA!\nVocê deseja remover o produto " + nomeProduto.get(opcaoFuncao-1) + "?\nDigite 1 para remover, e 2 para cancelar."));
							if (confirmarRemocao == 2) {
								qtdProdutosListados = 0;
								qtdPenultimaListagem = 0;
								qtdProdutosNaoListados = idProduto.size();
							}
							else if (confirmarRemocao == 1) {
								JOptionPane.showMessageDialog(null, "O produto " + nomeProduto.get(opcaoFuncao-1) + " foi removido.");
								idProduto.remove(idProduto.size()-1);
								nomeProduto.remove(opcaoFuncao-1);
								nomeProdutoComID.remove(opcaoFuncao-1);
								fornecedorProduto.remove(opcaoFuncao-1);
								valorProduto.remove(opcaoFuncao-1);
								qtdProduto.remove(opcaoFuncao-1);
								nomeProdutoComID.removeAll(nomeProdutoComID);
								for(int i = 1; i < nomeProduto.size()+1; i++)
									nomeProdutoComID.add(i + "- " + nomeProduto.get(i-1));
								qtdProdutosListados = 0;
								qtdPenultimaListagem = 0;
								qtdProdutosNaoListados = idProduto.size();
								removerProduto = false;
								confirmarRemocao = 0;
								break;
							}
						}
						else if (opcaoFuncao == (idProduto.size() + 3)) {
							qtdProdutosListados = 0;
							qtdPenultimaListagem = 0;
							qtdProdutosNaoListados = idProduto.size();
							removerProduto = false;
							confirmarRemocao = 0;
							break;
						}
						else if (opcaoFuncao == (idProduto.size() + 2)) {
							opcaoVoltar = true;
							if (qtdProdutosListados > 10) 
								todosProdutosListados = false;
							else
								JOptionPane.showMessageDialog(null, "Não há páginas para voltar.");
						}
						else if (opcaoFuncao == (idProduto.size() + 1)) {
							if (qtdProdutosListados == qtdProdutos) {
								JOptionPane.showMessageDialog(null, "Todos produtos já foram listados.");
							}
						}
					}
					while (buscarProduto) {
						qtdProdutos = idProduto.size();
						if(qtdProdutos < 1) {
							JOptionPane.showMessageDialog(null, "Não há produtos cadastrados no sistema.");
							buscarProduto = false;
							break;
						}
						qtdProdutosNaoListados = idProduto.size();
						qtdProdutosNaoListados -= qtdProdutosListados;
						if (opcaoVoltar) {
							if (qtdProdutosListados > 10) {
								listaProdutos = String.join("\n", nomeProdutoComID.subList(qtdProdutosListados-(10+qtdUltimaListagem), qtdProdutosListados-qtdUltimaListagem));
								qtdProdutosListados -= qtdUltimaListagem;
								qtdProdutosNaoListados += qtdUltimaListagem; 
								qtdUltimaListagem = 10;
							}
						}
						else if (todosProdutosListados == false && voltarListaConsultaProduto != true) {
							if (qtdProdutosNaoListados < 10) {
								if (qtdProdutos > 10 && qtdProdutosListados > 10)
									qtdPenultimaListagem = 10;
								qtdUltimaListagem = qtdProdutosNaoListados;
								listaProdutos = String.join("\n", nomeProdutoComID.subList(qtdProdutosListados, qtdProdutosListados+qtdProdutosNaoListados));
								qtdProdutosListados += qtdProdutosNaoListados;
							}
							else if (qtdProdutosNaoListados >= 10) {
								qtdUltimaListagem = 10;
								listaProdutos = String.join("\n", nomeProdutoComID.subList(qtdProdutosListados, qtdProdutosListados+10));
								qtdProdutosListados += 10;
							}
						}
						if (qtdProdutosListados == qtdProdutos)
							todosProdutosListados = true;
						opcaoFuncao = Integer.parseInt(JOptionPane.showInputDialog(
								"\n"
										+ listaProdutos
										+ "\n\nTotal de produtos: " + qtdProdutos
										+ "\nProduto listados: " + qtdProdutosListados
										+ "\n\n"+( idProduto.size() +1) + "- Próxima página"
										+ "\n"+(idProduto.size() +2)+"- Voltar Página"
										+ "\n"+(idProduto.size() +3)+"- Voltar ao menu "
										+"\nSelecione o ID do produto que deseja consultar, ou qual ação deseja que seja feita:"));
						while (opcaoFuncao > idProduto.size() +3 || opcaoFuncao < 1) {
							opcaoFuncao = Integer.parseInt(JOptionPane.showInputDialog(
									"\n"
											+ listaProdutos
											+ "\n\nTotal de produtos: " + qtdProdutos
											+ "\nProduto listados: " + qtdProdutosListados
											+ "\n\n\nSELECIONE UMA OPÇÃO VÁLIDA!"
											+ "\n\n"+( idProduto.size() +1) + "- Próxima página"
											+ "\n"+(idProduto.size() +2)+"- Voltar Página"
											+ "\n"+(idProduto.size() +3)+"- Voltar ao menu "
											+"\nSelecione o ID do produto que deseja consultar, ou qual ação deseja que seja feita:"));
						}
						opcaoVoltar = false;
						voltarListaConsultaProduto = false;
						if (opcaoFuncao < (idProduto.size() + 1)) {
							consultaProduto = "Nome do produto: " + nomeProduto.get(opcaoFuncao-1)
							+ "\nFornecedor: " + fornecedorProduto.get(opcaoFuncao-1)
							+ "\nValor: R$" + valorProduto.get(opcaoFuncao-1)
							+ "\nUnidades: " + qtdProduto.get(opcaoFuncao-1);
							opcaoConsulta = Integer.parseInt(JOptionPane.showInputDialog(
									consultaProduto
									+ "\n\n1- Voltar"));
							while (opcaoConsulta != 1) {
								opcaoConsulta = Integer.parseInt(JOptionPane.showInputDialog(
										consultaProduto
										+ "\n\n1- Voltar"
										+ "\nSELECIONE 1 PARA VOLTAR!"));	
							}
							if (opcaoConsulta == 1) 
								voltarListaConsultaProduto = true;		
						}
						if (opcaoFuncao == (idProduto.size() +3)) {
							qtdProdutosListados = 0;
							qtdPenultimaListagem = 0;
							qtdUltimaListagem = 0;
							qtdProdutosNaoListados = idProduto.size();
							buscarProduto = false;
							break;
						}
						if (opcaoFuncao == (idProduto.size() +2)) {
							opcaoVoltar = true;
							if (qtdProdutosListados > 10) 
								todosProdutosListados = false;
							else
								JOptionPane.showMessageDialog(null, "Não há páginas para voltar.");
						}
						else if (opcaoFuncao == (idProduto.size() +1)) {
							if (qtdProdutosListados == qtdProdutos) {
								JOptionPane.showMessageDialog(null, "Todos produtos já foram listados.");
							}
						}
					}
					while (venderProduto) {
						do {
							qtdProdutos = idProduto.size();
							if(qtdProdutos < 1) {
								JOptionPane.showMessageDialog(null, "Não há produtos cadastrados no sistema.");
								venderProduto = false;
								break;
							}
							qtdProdutosNaoListados = idProduto.size();
							qtdProdutosNaoListados -= qtdProdutosListados;
							if (opcaoVoltar) {
								if (qtdProdutosListados > 10) {
									listaProdutos = String.join("\n", nomeProdutoComID.subList(qtdProdutosListados-(10+qtdUltimaListagem), qtdProdutosListados-qtdUltimaListagem));
									qtdProdutosListados -= qtdUltimaListagem;
									qtdProdutosNaoListados += qtdUltimaListagem; 
									qtdUltimaListagem = 10;
								}
							}
							else if (todosProdutosListados == false && voltarListaConsultaProduto != true) {
								if (qtdProdutosNaoListados < 10) {
									if (qtdProdutos > 10 && qtdProdutosListados > 10)
										qtdPenultimaListagem = 10;
									qtdUltimaListagem = qtdProdutosNaoListados;
									listaProdutos = String.join("\n", nomeProdutoComID.subList(qtdProdutosListados, qtdProdutosListados+qtdProdutosNaoListados));
									qtdProdutosListados += qtdProdutosNaoListados;
								}
								else if (qtdProdutosNaoListados >= 10) {
									qtdUltimaListagem = 10;
									listaProdutos = String.join("\n", nomeProdutoComID.subList(qtdProdutosListados, qtdProdutosListados+10));
									qtdProdutosListados += 10;
								}
							}
							if (qtdProdutosListados == qtdProdutos) {
								todosProdutosListados = true;
								qtdUltimaListagem = (qtdProdutos%10);
							}
							opcaoFuncao = Integer.parseInt(JOptionPane.showInputDialog(
									"\n"
											+ listaProdutos
											+ "\n\nTotal de produtos: " + qtdProdutos
											+ "\nProduto listados: " + qtdProdutosListados
											+ "\n\n"+( idProduto.size() +1) + "- Próxima página"
											+ "\n"+(idProduto.size() +2)+"- Voltar Página"
											+ "\n"+(idProduto.size() +3)+"- Voltar ao menu "
											+"\nSelecione o ID do produto que deseja vender, ou qual ação deseja que seja feita:"));
							while (opcaoFuncao > idProduto.size() +3 || opcaoFuncao < 1) {
								opcaoFuncao = Integer.parseInt(JOptionPane.showInputDialog(
										"\n"
												+ listaProdutos
												+ "\n\nTotal de produtos: " + qtdProdutos
												+ "\nProduto listados: " + qtdProdutosListados
												+ "\n\n\nSELECIONE UMA OPÇÃO VÁLIDA!"
												+ "\n\n"+( idProduto.size() +1) + "- Próxima página"
												+ "\n"+(idProduto.size() +2)+"- Voltar Página"
												+ "\n"+(idProduto.size() +3)+"- Voltar ao menu "
												+"\nSelecione o ID do produto que deseja vender, ou qual ação deseja que seja feita:"));
							}
							opcaoVoltar = false;
							voltarListaConsultaProduto = false;
							if (opcaoFuncao < (idProduto.size() + 1)) {
								idProdutoVendido = opcaoFuncao;
								opcaoFuncao = 100;
								do {
									qtdClientes = idCliente.size();
									if(qtdClientes < 1) {
										JOptionPane.showMessageDialog(null, "Não há clientes cadastrados no sistema.");
										venderProduto = false;
										break;
									}
									qtdClientesNaoListados = idCliente.size();
									qtdClientesNaoListados -= qtdClientesListados;
									if (opcaoVoltar) {
										if (qtdClientesListados > 10) {
											listaClientes = String.join("\n", nomeClienteComID.subList(qtdClientesListados-(10+qtdUltimaListagem), qtdClientesListados-qtdUltimaListagem));
											qtdClientesListados -= qtdUltimaListagem;
											qtdClientesNaoListados += qtdUltimaListagem; 
											qtdUltimaListagem = 10;
										}
									}
									else if (todosClientesListados == false && voltarListaConsultaCliente != true) {
										if (qtdClientesNaoListados < 10) {
											if (qtdClientes > 10 && qtdClientesListados > 10)
												qtdPenultimaListagem = 10;
											qtdUltimaListagem = qtdClientesNaoListados;
											listaClientes = String.join("\n", nomeClienteComID.subList(qtdClientesListados, qtdClientesListados+qtdClientesNaoListados));
											qtdClientesListados += qtdClientesNaoListados;
										}
										else if (qtdClientesNaoListados >= 10) {
											qtdUltimaListagem = 10;
											listaClientes = String.join("\n", nomeClienteComID.subList(qtdClientesListados, qtdClientesListados+10));
											qtdClientesListados += 10;
										}
									}
									if (qtdClientesListados == qtdClientes)
										todosClientesListados = true;
									opcaoFuncao = Integer.parseInt(JOptionPane.showInputDialog(
											"\n"
													+ listaClientes
													+ "\n\nTotal de clientes: " + qtdClientes
													+ "\nClientes listados: " + qtdClientesListados
													+ "\n\n"+( idCliente.size() +1) + "- Próxima página"
													+ "\n"+(idCliente.size() +2)+"- Voltar Página"
													+ "\n"+(idCliente.size() +3)+"- Voltar ao menu "
													+"\nSelecione o ID do cliente que deseja fazer a venda, ou qual ação deseja que seja feita:"));
									while (opcaoFuncao > idCliente.size() +3 || opcaoFuncao < 1) {
										opcaoFuncao = Integer.parseInt(JOptionPane.showInputDialog(
												"\n"
														+ listaClientes
														+ "\n\nTotal de clientes: " + qtdClientes
														+ "\nClientes listados: " + qtdClientesListados
														+ "\n\n\nSELECIONE UMA OPÇÃO VÁLIDA!"
														+ "\n\n"+( idCliente.size() +1) + "- Próxima página"
														+ "\n"+(idCliente.size() +2)+"- Voltar Página"
														+ "\n"+(idCliente.size() +3)+"- Voltar ao menu "
														+"\nSelecione o ID do cliente que deseja fazer a venda, ou qual ação deseja que seja feita:"));
									}
									opcaoVoltar = false;
									voltarListaConsultaCliente = false;
									if (opcaoFuncao < (idCliente.size() + 1)) {
										idComprador = opcaoFuncao;
										opcaoFuncao = Integer.parseInt(JOptionPane.showInputDialog("Você deseja vender o produto " + nomeProduto.get(idProdutoVendido - 1) + " para o cliente " + nomeCliente.get(idComprador-1) + "?\n1-Sim\n2-Não"));	
										while (opcaoFuncao != 1 && opcaoFuncao != 2)
											opcaoFuncao = Integer.parseInt(JOptionPane.showInputDialog("Você deseja vender o produto " + nomeProduto.get(idProdutoVendido - 1) + " para o cliente " + nomeCliente.get(idComprador-1) + "?\n1-Sim\n2-Não\nSELECIONE UMA OPÇÃO VÁLIDA!"));	
										if (opcaoFuncao == 1) {
											opcaoFuncao = Integer.parseInt(JOptionPane.showInputDialog("Quantas unidades do produto " + nomeProduto.get(idProdutoVendido - 1) + " serão vendidas para o cliente " + nomeCliente.get(idComprador-1) + "?\n(Unidades disponíveis: " + qtdProduto.get(idProdutoVendido -1)+")"));	
											while (opcaoFuncao > qtdProduto.get(idProdutoVendido - 1) || opcaoFuncao < 1) 
												opcaoFuncao = Integer.parseInt(JOptionPane.showInputDialog("Quantas unidades do produto " + nomeProduto.get(idProdutoVendido - 1) + " serão vendidas para o cliente " + nomeCliente.get(idComprador-1) + "?\n(Unidades disponíveis: " + qtdProduto.get(idProdutoVendido -1)+")\nSELCIONE UM VALOR VÁLIDO"));	
											dividaPendente.set(idComprador-1, dividaPendente.get(idComprador-1)+(Integer.parseInt(valorProduto.get(idProdutoVendido-1)) * opcaoFuncao));
											JOptionPane.showMessageDialog(null, "Foi efetuada a venda de " + opcaoFuncao + "x " + nomeProduto.get(idProdutoVendido-1) + " para o cliente " + nomeCliente.get(idComprador-1) + ".\nA venda teve o valor de R$" + (Integer.parseInt(valorProduto.get(idProdutoVendido-1)) * opcaoFuncao));
											if (qtdProduto.get(idProdutoVendido-1) > opcaoFuncao)
												qtdProduto.set(idProdutoVendido-1, qtdProduto.get(idProdutoVendido -1)-opcaoFuncao);
											else if (qtdProduto.get(idProdutoVendido-1) == opcaoFuncao) {
												JOptionPane.showMessageDialog(null, "O produto "+ nomeProduto.get(idProdutoVendido-1) +" foi removido, pois todas unidades foram vendidas.");
												idProduto.remove(idProduto.size()-1);
												nomeProduto.remove(idProdutoVendido-1);
												nomeProdutoComID.remove(idProdutoVendido-1);
												fornecedorProduto.remove(idProdutoVendido-1);
												valorProduto.remove(idProdutoVendido-1);
												qtdProduto.remove(idProdutoVendido-1);
												nomeProdutoComID.removeAll(nomeProdutoComID);
												for(int i = 1; i < nomeProduto.size()+1; i++)
													nomeProdutoComID.add(i + "- " + nomeProduto.get(i-1));
											}
											qtdProdutosListados = 0;
											qtdPenultimaListagem = 0;
											qtdUltimaListagem = 0;
											qtdClientesListados = 0;
											qtdPenultimaListagem = 0;
											qtdClientesNaoListados = idCliente.size();
											todosClientesListados = false;
											qtdProdutosNaoListados = idProduto.size();
											venderProduto = false;
											break;
										}
										else {
											voltarListaConsultaCliente = true;
											voltarListaConsultaProduto = true;
										}
									}
									if (opcaoFuncao == (idCliente.size() +3)) {
										qtdClientesListados = 0;
										qtdPenultimaListagem = 0;
										qtdClientesNaoListados = idCliente.size();
										venderProduto = false;
										todosClientesListados = false;
										break;
									}
									if (opcaoFuncao == (idCliente.size() +2)) {
										opcaoVoltar = true;
										if (qtdClientesListados > 10) 
											todosClientesListados = false;
										else
											JOptionPane.showMessageDialog(null, "Não há páginas para voltar.");
									}
									else if (opcaoFuncao == (idCliente.size() +1)) {
										if (qtdClientesListados == qtdClientes) {
											JOptionPane.showMessageDialog(null, "Todos clientes já foram listados.");
										}
									}
								} while ((opcaoFuncao > (idProduto.size() + 1)) && venderProduto);
							}
							if (opcaoFuncao == (idProduto.size() +3)) {
								qtdProdutosListados = 0;
								qtdPenultimaListagem = 0;
								qtdUltimaListagem = 0;
								qtdProdutosNaoListados = idProduto.size();
								venderProduto = false;
								break;
							}
							if (opcaoFuncao == (idProduto.size() +2)) {
								opcaoVoltar = true;
								if (qtdProdutosListados > 10) 
									todosProdutosListados = false;
								else
									JOptionPane.showMessageDialog(null, "Não há páginas para voltar.");
							}
							else if (opcaoFuncao == (idProduto.size() +1)) {
								if (qtdProdutosListados == qtdProdutos) {
									JOptionPane.showMessageDialog(null, "Todos produtos já foram listados.");
								}
							}
						} while ((opcaoFuncao > (idProduto.size() + 1) && venderProduto));
					}
				}
				while (moduloFinanceiro) {
					opcaoModulos = Integer.parseInt(JOptionPane.showInputDialog(
							"Qual módulo deseja acessar?"
									+ "\n1- Receber valor"
									+ "\n2- Contas a receber"
									+ "\n3- Listar clientes com pendências"
									+ "\n4- Voltar"));
					while (opcaoModulos > 4 || opcaoModulos < 1) {
						opcaoModulos = Integer.parseInt(JOptionPane.showInputDialog("Escolha uma opção válida."
								+ "\n\nQual módulo deseja acessar?"
								+ "\n1- Receber pagamento"
								+ "\n2- Contas a receber"
								+ "\n3- Listar clientes com pendências"
								+ "\n4- Voltar"));
					}
					if (opcaoModulos == 1) 
						receberValor = true;
					else if (opcaoModulos == 2) 
						contasReceber = true;
					else if (opcaoModulos == 3)
						listaClientesComPendencias = true;
					else {
						moduloFinanceiro = false;
						break;}
					while (receberValor) {
						qtdClientes = idCliente.size();
						if(qtdClientes < 1) {
							JOptionPane.showMessageDialog(null, "Não há clientes cadastrados no sistema.");
							receberValor = false;
							break;
						}
						qtdClientesNaoListados = idCliente.size();
						qtdClientesNaoListados -= qtdClientesListados;
						if (opcaoVoltar) {
							if (qtdClientesListados > 10) {
								listaClientes = String.join("\n", nomeClienteComID.subList(qtdClientesListados-(10+qtdUltimaListagem), qtdClientesListados-qtdUltimaListagem));
								qtdClientesListados -= qtdUltimaListagem;
								qtdClientesNaoListados += qtdUltimaListagem; 
								qtdUltimaListagem = 10;
							}
						}
						else if (todosClientesListados == false && voltarListaConsultaCliente != true) {
							if (qtdClientesNaoListados < 10) {
								if (qtdClientes > 10 && qtdClientesListados > 10)
									qtdPenultimaListagem = 10;
								qtdUltimaListagem = qtdClientesNaoListados;
								listaClientes = String.join("\n", nomeClienteComID.subList(qtdClientesListados, qtdClientesListados+qtdClientesNaoListados));
								qtdClientesListados += qtdClientesNaoListados;
							}
							else if (qtdClientesNaoListados >= 10) {
								qtdUltimaListagem = 10;
								listaClientes = String.join("\n", nomeClienteComID.subList(qtdClientesListados, qtdClientesListados+10));
								qtdClientesListados += 10;
							}
						}
						if (qtdClientesListados == qtdClientes)
							todosClientesListados = true;
						opcaoFuncao = Integer.parseInt(JOptionPane.showInputDialog(
								"\n"
										+ listaClientes
										+ "\n\nTotal de clientes: " + qtdClientes
										+ "\nClientes listados: " + qtdClientesListados
										+ "\n\n"+( idCliente.size() +1) + "- Próxima página"
										+ "\n"+(idCliente.size() +2)+"- Voltar Página"
										+ "\n"+(idCliente.size() +3)+"- Voltar ao menu "
										+"\nSelecione o ID do cliente que deseja receber alguma pendência, ou qual ação deseja que seja feita:"));
						while (opcaoFuncao > idCliente.size() +3 || opcaoFuncao < 1) {
							opcaoFuncao = Integer.parseInt(JOptionPane.showInputDialog(
									"\n"
											+ listaClientes
											+ "\n\nTotal de clientes: " + qtdClientes
											+ "\nClientes listados: " + qtdClientesListados
											+ "\n\n\nSELECIONE UMA OPÇÃO VÁLIDA!"
											+ "\n\n"+( idCliente.size() +1) + "- Próxima página"
											+ "\n"+(idCliente.size() +2)+"- Voltar Página"
											+ "\n"+(idCliente.size() +3)+"- Voltar ao menu "
											+"\nSelecione o ID do cliente que deseja receber alguma pendência, ou qual ação deseja que seja feita:"));
						}
						opcaoVoltar = false;
						if (opcaoFuncao < (idCliente.size() + 1)) {
							while (opcaoConsulta != 2) {
								consultaCliente = "Nome do cliente: " + nomeCliente.get(opcaoFuncao-1)
								+ "\n\nValor pendente: " + dividaPendente.get(opcaoFuncao-1)
								+ "\nValor pago: " + dividaPaga.get(opcaoFuncao-1);
								opcaoConsulta = Integer.parseInt(JOptionPane.showInputDialog(
										consultaCliente
										+ "\n\n1- Receber pagamento"
										+ "\n2- Voltar"));
								while (opcaoConsulta != 1 && opcaoConsulta != 2) {
									opcaoConsulta = Integer.parseInt(JOptionPane.showInputDialog(
											consultaCliente
											+ "\n\n1- Receber pagamento"
											+ "\n2- Voltar"
											+ "\nSELECIONE UMA OPÇÃO VÁLIDA!"));	
								}
								if (opcaoConsulta == 2) {
									voltarListaConsultaCliente = true;
									break;
								}
								else {
									if (dividaPendente.get(opcaoFuncao-1) <= 0)
										JOptionPane.showMessageDialog(null, "Este cliente não há nenhuma pendência.");
									else {
										valorRecebido = Double.parseDouble(JOptionPane.showInputDialog("Valor pendente: "+ dividaPendente.get(opcaoFuncao-1)
										+ "\nValor pago: "+ dividaPaga.get(opcaoFuncao-1)
										+ "\n\nQual foi o valor recebido?"));
										while (valorRecebido > dividaPendente.get(opcaoFuncao-1)) {
											valorRecebido = Double.parseDouble(JOptionPane.showInputDialog("O cliente está devendo um valor menor.\nValor pendente: " + dividaPendente.get(opcaoFuncao-1)
											+ "\nValor pago: " + dividaPaga.get(opcaoFuncao-1)
											+ "\n\nQual foi o valor recebido?"));
										}
										dividaPendente.set((opcaoFuncao-1), (dividaPendente.get(opcaoFuncao-1) - valorRecebido));
										dividaPaga.set((opcaoFuncao-1), dividaPaga.get(opcaoFuncao-1) + valorRecebido);
										JOptionPane.showMessageDialog(null, "Você recebeu um pagamento de R$" + valorRecebido + " do cliente " + nomeCliente.get(opcaoFuncao-1) + ".");
										qtdClientesListados = 0;
										qtdPenultimaListagem = 0;
										qtdClientesNaoListados = idCliente.size();
										receberValor = false;
										break;
									}
								}
							}
						}
						if (opcaoFuncao == (idCliente.size() +3)) {
							qtdClientesListados = 0;
							qtdPenultimaListagem = 0;
							qtdClientesNaoListados = idCliente.size();
							receberValor = false;
							todosClientesListados = false;
							break;
						}
						if (opcaoFuncao == (idCliente.size() +2)) {
							opcaoVoltar = true;
							if (qtdClientesListados > 10) 
								todosClientesListados = false;
							else
								JOptionPane.showMessageDialog(null, "Não há páginas para voltar.");
						}
						else if (opcaoFuncao == (idCliente.size() +1)) {
							if (qtdClientesListados == qtdClientes) {
								JOptionPane.showMessageDialog(null, "Todos clientes já foram listados.");
							}
						}
					}
					if (contasReceber) {
						if (idCliente.size() == 0) {
							JOptionPane.showMessageDialog(null, "Não há clientes cadastrados no sistema.");	
							contasReceber = false;
						}
						else {
						valorTotalReceber = 0;
						maiorDivida = 0;
						for (int i = 0; i < idCliente.size(); i++) {
							valorTotalReceber = valorTotalReceber + dividaPendente.get(i);
							if (dividaPendente.get(i) > maiorDivida) {
								maiorDivida = dividaPendente.get(i);
								nomeMaiorDivida = nomeCliente.get(i);
							}
						}
						JOptionPane.showMessageDialog(null, "Você possui R$" + valorTotalReceber + " à receber."
								+ "\nO cliente com maior pendência é " + nomeMaiorDivida + ", tendo R$" + maiorDivida + " pendentes.");
						contasReceber = false;
					}
					}
					if (listaClientesComPendencias) {
						pendenciaNomeCliente.removeAll(pendenciaNomeCliente);
						for (int i = 0; i < idCliente.size(); i++) {
							if (dividaPendente.get(i) > 0) {
								pendenciaNomeCliente.add(nomeCliente.get(i));
							}
						}
						pendenciaNomeClienteComID.removeAll(pendenciaNomeClienteComID);
						for (int i = 1; i <= pendenciaNomeCliente.size(); i++) {
							pendenciaNomeClienteComID.add(i + "- " + pendenciaNomeCliente.get(i-1));
						}
						while(listaClientesComPendencias) {
							qtdClientes = pendenciaNomeClienteComID.size();
							if(qtdClientes < 1) {
								JOptionPane.showMessageDialog(null, "Não há clientes cadastrados no sistema.");
								listarClientes = false;
								break;
							}
							qtdClientesNaoListados = pendenciaNomeClienteComID.size();
							qtdClientesNaoListados -= qtdClientesListados;
							if (opcaoVoltar) {
								if (qtdClientesListados > 10) {
									listaClientes = String.join("\n", pendenciaNomeClienteComID.subList(qtdClientesListados-(10+qtdUltimaListagem), qtdClientesListados-qtdUltimaListagem));
									qtdClientesListados -= qtdUltimaListagem;
									qtdClientesNaoListados += qtdUltimaListagem; 
									qtdUltimaListagem = 10;
								}
							}
							else if (todosClientesListados == false) {
								if (qtdClientesNaoListados < 10) {
									if (qtdClientes > 10 && qtdClientesListados > 10)
										qtdPenultimaListagem = 10;
									qtdUltimaListagem = qtdClientesNaoListados;
									listaClientes = String.join("\n", pendenciaNomeClienteComID.subList(qtdClientesListados, qtdClientesListados+qtdClientesNaoListados));
									qtdClientesListados += qtdClientesNaoListados;
								}
								else if (qtdClientesNaoListados >= 10) {
									qtdUltimaListagem = 10;
									listaClientes = String.join("\n", pendenciaNomeClienteComID.subList(qtdClientesListados, qtdClientesListados+10));
									qtdClientesListados += 10;
								}
							}
							if (qtdClientesListados == qtdClientes)
								todosClientesListados = true;
							opcaoFuncao = Integer.parseInt(JOptionPane.showInputDialog(
									"\n"
											+ listaClientes
											+ "\n\nTotal de clientes: " + qtdClientes
											+ "\nClientes listados: " + qtdClientesListados
											+ "\n\n\n1- Próxima página"
											+ "\n2- Voltar Página"
											+ "\n3- Voltar ao menu "));
							while (opcaoFuncao > 3 || opcaoFuncao < 1) {
								opcaoFuncao = Integer.parseInt(JOptionPane.showInputDialog(
										"\n"
												+ listaClientes
												+ "\n\nTotal de clientes: " + qtdClientes
												+ "\nClientes listados: " + qtdClientesListados
												+ "\n\n\nSELECIONE UMA OPÇÃO VÁLIDA!"
												+ "\n\n1- Próxima página"
												+ "\n2- Voltar Página"
												+ "\n3- Voltar ao menu "));
							}
							opcaoVoltar = false;
							if (opcaoFuncao == 3) {
								qtdClientesListados = 0;
								qtdPenultimaListagem = 0;
								qtdClientesNaoListados = pendenciaNomeClienteComID.size();
								listaClientesComPendencias = false;
								todosClientesListados = false;
								break;
							}
							if (opcaoFuncao == 2) {
								opcaoVoltar = true;
								if (qtdClientesListados > 10) 
									todosClientesListados = false;
								else
									JOptionPane.showMessageDialog(null, "Não há páginas para voltar.");
							}
							else {
								if (qtdClientesListados == qtdClientes) {
									JOptionPane.showMessageDialog(null, "Todos clientes já foram listados.");
								}
							}
						}
						listaClientesComPendencias = false;
					}
				}
			}
		}
		catch (NumberFormatException e){
			JOptionPane.showMessageDialog(null,"Sistema finalizado.");
		}
	}
}