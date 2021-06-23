package models;

public abstract class Forma {

	private double calcularArea;
	private String tipoForma;

	public double getCalcularArea() {
		return calcularArea;
	}

	public void setCalcularArea(double calcularArea) {
		this.calcularArea = calcularArea;
	}

	public String getTipoForma() {
		return tipoForma;
	}

	public void setTipoForma(String tipoForma) {
		this.tipoForma = tipoForma;
	}
	
}
