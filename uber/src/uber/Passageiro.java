package uber;

public class Passageiro extends Pessoa {
	private String Email;
	private String Senha;
	public Passageiro(String nome, String cpf, String DataNascimento) {
		super(nome, cpf, DataNascimento);
	}
	public String getEmail () {
		return Email;
	}
	public void setEmail(String Email) {
		this.Email = Email;
	}
	public String getSenha () {
		return Senha;
	}
	public void setSenha(String Senha) {
		this.Senha = Senha;
	}
}