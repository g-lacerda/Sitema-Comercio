
/**
 * @author Guilherme Lacerda
 *
 */
public class Estoque {

	private int id;
	private String nome;
	private String nomeID;
	private String fornecedor;
	private double valor;
	private int idInterno;
	private int qtd;


	public Estoque () {
		
	}

	public Estoque (int id, String nome, String fornecedor, double valor, int qtd, int idInterno) {
		this.id = id;
		this.nome = nome;
		this.nomeID = (id+1 + "- " + nome);
		this.fornecedor = fornecedor;
		this.valor = valor;
		this.qtd = qtd;
		this.idInterno = idInterno;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNomeID() {
		return nomeID;
	}

	public void setNomeID(String nomeID) {
		this.nomeID = nomeID;
	}

	public String getFornecedor() {
		return fornecedor;
	}

	public void setFornecedor(String fornecedor) {
		this.fornecedor = fornecedor;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public int getQtd() {
		return qtd;
	}

	public void setQtd(int qtd) {
		this.qtd = qtd;
	}

	public int getIdInterno() {
		return idInterno;
	}

	public void setIdInterno(int idInterno) {
		this.idInterno = idInterno;
	}

	
	
	
}
