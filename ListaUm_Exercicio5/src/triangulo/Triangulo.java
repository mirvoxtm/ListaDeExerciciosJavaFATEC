package triangulo;

public class Triangulo {
	private double lado, perimetro, area;
	
	public Triangulo(double lado) {
		this.lado = lado;
		this.perimetro = calcPerimetro();
		this.area = calcArea();
	}
	
	public double calcArea() {
	   return area = (lado * Math.sqrt(3)) / 2;
	}
	
	public double calcPerimetro() {
		return perimetro = 3 * lado;
	}
	
	public double getArea() {
		return area;
	}
	
	public double getPerimetro() {
		return perimetro;
	}
}
