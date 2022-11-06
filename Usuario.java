import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Usuario {

	private int id;
	private String usuario;
	private String usuarioID;
	private String senha;
	private String dataCriacao;
	private String email;
	private String telefone;
	private String nome;
	
	public Usuario (int id, String usuario, String senha, String nome, String email, String telefone) {
		this.dataCriacao = this.getDateTime();
		this.usuario = usuario;
		this.senha = senha;
		this.email = email;
		this.telefone = telefone;
		this.nome = nome;
	}
	
	public Usuario () {
		
	}
	
	private String getDateTime() {
		DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy, HH:mm:ss");
		Date date = new Date();
		return dateFormat.format(date);
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getDataCriacao() {
		return dataCriacao;
	}

	public void setDataCriacao(String dataCriacao) {
		this.dataCriacao = dataCriacao;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUsuarioID() {
		return usuarioID;
	}

	public void setUsuarioID(String usuarioID) {
		this.usuarioID = usuarioID;
	}
	
}
