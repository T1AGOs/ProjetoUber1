package uber;

public abstract class Pessoa {
	private String nome;
	private String cpf;
	private String DataNascimento;
	
	public Pessoa(String nome, String cpf, String DataNascimento) {
		
		this.nome = nome;
		this.cpf = cpf;
		this.DataNascimento= DataNascimento;
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
	public String getDataNascimeto () {
		return DataNascimento;
	}
	public void setDataNascimento (String DataNascimento) {
		this.DataNascimento = DataNascimento;
	}
}
