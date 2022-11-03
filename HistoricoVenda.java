import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
public class HistoricoVenda {

	private int id;
	private String data;
	private String nomeProduto;
	private String nomeCliente;
	private int qtdProduto;
	private double valorProduto;
	private double valorTotal;
	private int idInternoCliente;
	private int idInternoProduto;
	private boolean clienteAtivo;
	private boolean houveDevolucao;

	
	



	public HistoricoVenda(int id, String nomeProduto, String nomeCliente, int qtdProduto, double valorProduto, double valorTotal, int idInternoCliente, int idInternoProduto) {
		this.id = id;
		this.data = getDateTime();
		this.nomeProduto = nomeProduto;
		this.nomeCliente = nomeCliente;
		this.qtdProduto = qtdProduto;
		this.valorProduto = valorProduto;
		this.valorTotal = valorTotal;
		this.idInternoCliente = idInternoCliente;
		this.idInternoProduto = idInternoProduto;
		this.clienteAtivo = true;
		this.houveDevolucao = false;
	}

	public HistoricoVenda () {
		
	}
	

	
	
	private String getDateTime() {
		DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy, HH:mm:ss");
		Date date = new Date();
		return dateFormat.format(date);
	}

	
	
	
	
	
	
	
	
	
	public String getNomeProduto() {
		return nomeProduto;
	}
	public void setNomeProduto(String nomeProduto) {
		this.nomeProduto = nomeProduto;
	}
	public String getNomeCliente() {
		return nomeCliente;
	}
	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}
	public int getQtdProduto() {
		return qtdProduto;
	}
	public void setQtdProduto(int qtdProduto) {
		this.qtdProduto = qtdProduto;
	}
	public double getValorProduto() {
		return valorProduto;
	}
	public void setValorProduto(double valorProduto) {
		this.valorProduto = valorProduto;
	}
	public double getValorTotal() {
		return valorTotal;
	}
	public void setValorTotal(double valorTotal) {
		this.valorTotal = valorTotal;
	}
	public int getIdInternoCliente() {
		return idInternoCliente;
	}
	public void setIdInternoCliente(int idInternoCliente) {
		this.idInternoCliente = idInternoCliente;
	}

	public int getIdInternoProduto() {
		return idInternoProduto;
	}

	public void setIdInternoProduto(int idInternoProduto) {
		this.idInternoProduto = idInternoProduto;
	}

	public boolean isClienteAtivo() {
		return clienteAtivo;
	}

	public void setClienteAtivo(boolean clienteAtivo) {
		this.clienteAtivo = clienteAtivo;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public boolean getDevolucao() {
		return houveDevolucao;
	}

	public void setHouveDevolucao(boolean houveDevolucao) {
		this.houveDevolucao = houveDevolucao;
	}
	
	
	

	
}
