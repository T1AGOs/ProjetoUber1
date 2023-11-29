package uber;

public class TipoDaViagem extends Viagem{

	public String Black;
	public String Flash;
	public String Comfort;
	public String Moto;
	public String Economy;
	public TipoDaViagem(String nome, String cpf, String DataNascimento, String PontoInicial, String Destino,
			String Rota, String Distancia, String TempoPrevisto, String Valor,String Black, String Flash, String Moto,String Comfort,String Economy) {
		super(nome, cpf, DataNascimento, PontoInicial, Destino, Rota, Distancia, TempoPrevisto, Valor);
		this.Black = Black;
		this.Flash = Flash;
		this.Comfort = Comfort;
		this.Moto = Moto;
		this.Economy = Economy;
	}
	public String getBlack() {
		return Black;
	}
	public void setBlack (String Black) {
		this.Black = Black;
	}
	public String getFlash() {
		return Flash;
	}
	public void setFlash (String Flash) {
		this.Flash = Flash;
	}
	public String getComfort() {
		return Comfort;
	}
	public void setComfort (String Comfort) {
		this.Comfort = Comfort;
	}
	public String getMoto() {
		return Moto;
	}
	public void setMoto (String Moto) {
		this.Moto = Moto;
	}
	public String getEconomy() {
		return Economy;
	}
	public void setEconomy(String Economy) {
		this.Economy = Economy;
	}
	

}
