package exercicio1;

public class Retangulo {
	public double altura;
	public double largura;
	
	public double area() {
		return altura * largura;
	}
	
	public double perimetro() {
		return (altura * 2) + (largura * 2);
	}
	
	public double diagonal() {
		double diagonal = (altura * 2) + (largura * 2);
		return Math.sqrt(diagonal * 2);
	}
}
