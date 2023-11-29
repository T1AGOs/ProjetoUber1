package uber;

public class Pagamento {
	String Credito;
	String Debito;
	String Pix;
	String Especie;
	String ValeTransporte;
	
	public String getCredito() {
		return Credito;
	}
	public void setCredito(String Credito) {
		this.Credito = Credito;
	}
	public String getDebito() {
		return Debito;
	}
	public void setDebito(String Debito) {
		this.Debito = Debito;
	}
	public String getPix() {
		return Pix;
	}
	public void setPix(String Pix) {
		this.Pix = Pix;
	}
	public String getEspecie() {
		return Especie;
	}
	public void setEspecie(String Especie) {
		this.Especie = Especie;
	}
	public String setValeTransporte () {
		return ValeTransporte;
	}
	public void setValeTransporte(String ValeTransporte) {
		this.ValeTransporte = ValeTransporte;
	}
}
