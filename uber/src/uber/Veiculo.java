package uber;

public abstract class Veiculo {
	private String Modelo;
	private String Cor;
	private String Placa;
	
	public Veiculo(String Modelo,String Cor, String Placa) {
		this.setModelo(Modelo);
		this.setCor(Cor);
		this.setPlaca(Placa);
	}
	public String getModelo() {
		return Modelo;
	}
	public void setModelo(String Modelo) {
		this.Modelo = Modelo;
		
	}
	public String getCor() {
		return Cor;
	}
	public void setCor(String cor) {
		Cor = cor;
	}
	public String getPlaca() {
		return Placa;
	}
	public void setPlaca(String placa) {
		Placa = placa;
	}
}
