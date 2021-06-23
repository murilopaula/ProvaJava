package models;

public class Triangulo extends Forma {
	
	

	public Triangulo() {
		setTipoForma("Triângulo");
	}

	private int alturaTriangulo;
	private int baseTriangulo;
	
	public int getAlturaTriangulo() {
		return alturaTriangulo;
	}
	public void setAlturaTriangulo(int alturaTriangulo) {
		this.alturaTriangulo = alturaTriangulo;
	}
	public int getBaseTriangulo() {
		return baseTriangulo;
	}
	public void setBaseTriangulo(int baseTriangulo) {
		this.baseTriangulo = baseTriangulo;
	}
	
	@Override
	public String toString() {
		return super.toString();
	}
	
}
