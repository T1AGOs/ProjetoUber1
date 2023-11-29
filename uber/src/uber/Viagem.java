package uber;

public class Viagem extends Passageiro {
	
	String PontoInicial;
	String Destino;
	String Rota;
	String Distancia;
	String TempoPrevisto;
	String Valor;
	
	public Viagem(String nome, String cpf, String DataNascimento, String PontoInicial, String Destino, String Rota, String Distancia, String TempoPrevisto, String Valor) {
		super(nome, cpf, DataNascimento);
		this.PontoInicial = PontoInicial;
		this.Destino = Destino;
		this.Rota = Rota;
		this.Distancia = Distancia;
		this.TempoPrevisto = TempoPrevisto;
		this.Valor = Valor;
	}
	public String getPontoInicial() {
		return PontoInicial;
	}
	public void setPontoInicial(String PontoInicial) {
		this.PontoInicial = PontoInicial;
	}
	public String getDestino () {
		return Destino;
	}
	public void setDestino (String Destino) {
		this.Destino = Destino;
	}
	public String getRota() {
		return Rota;
	}
	public void setRota (String Rota) {
		this.Rota = Rota;
	}
	public String getDistancia() {
		return Distancia;
	}
	public void setDistancia(String Distancia) {
		this.Distancia = Distancia;
	}
	public String getTempoPrevisto() {
		return TempoPrevisto;
	}
	public void setTempoPrevisto(String TempoPrevisto) {
		this.TempoPrevisto = TempoPrevisto;
	}
	public String getValor () {
		return Valor;
	}
	public void setValor(String Valor) {
		this.Valor = Valor;
	}
}
