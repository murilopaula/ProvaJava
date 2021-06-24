package models;

public class Retangulo extends Forma {
	
	public Retangulo() {
		setTipoForma("Retângulo");
	}

	private int altura;
	private int largura;
	
	public int getAltura() {
		return altura;
	}
	public void setAltura(int altura) {
		this.altura = altura;
	}
	public int getLargura() {
		return largura;
	}
	public void setLargura(int largura) {
		this.largura = largura;
	}
	
	
}
