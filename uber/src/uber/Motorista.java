package uber;

public class Motorista extends Veiculo {
	private String Email;
	private String Senha;
	private String Login;
	public Motorista(String Modelo, String Cor, String Placa, String Senha, String Email) {
		super(Modelo, Cor, Placa);
		Email = this.setEmail(Email);
		Senha = this.setSenha(Senha);
		
	}

	public String getSenha() {
		return Senha;
	}

	public String setSenha(String senha) {
		return Senha = senha;
	}

	public String getEmail() {
		return Email;
	}

	public String setEmail(String email) {
		Email = email;
		return email;
	}
	public void Senha(String Senha) {
		this.Senha = Senha;
	}
	public void Login(String Login) {
	}


	public String getLogin() {
		return Login;
	}

	public void setLogin(String login) {
		Login = login;
	}
}

