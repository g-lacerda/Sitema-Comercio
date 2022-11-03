public class Cliente {

	private int id;
	private String nome;
	private String nomeID;
	private String cpf;
	private String cidade;
	private String bairro;
	private String rua;
	private String numero;
	private String telefone;
	private double dividaPendente;
	private double dividaPaga;
	private double credito;
	private int idInterno;
	
	public Cliente(int id, String nome, String cpf, String cidade, String bairro, String rua, String numero, String telefone, int idInterno) {
		this.id = id;
		this.nome = nome;
		this.nomeID = (id+1 + "- " + nome);
		this.cpf = cpf;
		this.cidade = cidade;
		this.bairro = bairro;
		this.rua = rua;
		this.numero = numero;
		this.telefone = telefone;
		this.dividaPaga = 0;
		this.dividaPendente = 0;
		this.credito = 0;
		this.idInterno = idInterno;
		
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNomeID() {
		return nomeID;
	}

	public void setNomeID(String nomeID) {
		this.nomeID = nomeID;
	}

	public Cliente () {
		
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
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public String getBairro() {
		return bairro;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	public String getRua() {
		return rua;
	}
	public void setRua(String rua) {
		this.rua = rua;
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public double getDividaPendente() {
		return dividaPendente;
	}

	public void setDividaPendente(double dividaPendente) {
		this.dividaPendente = dividaPendente;
	}

	public double getDividaPaga() {
		return dividaPaga;
	}

	public void setDividaPaga(double dividaPaga) {
		this.dividaPaga = dividaPaga;
	}

	public double getCredito() {
		return credito;
	}

	public void setCredito(double credito) {
		this.credito = credito;
	}

	public int getIdInterno() {
		return idInterno;
	}

	public void setIdInterno(int idInterno) {
		this.idInterno = idInterno;
	}
	


}
