package complexos;

public class Complexo {
	private double a, b;
	private Complexo complexo;
	
	public Complexo(double a, double b) {
		this.a = a;
		this.b = b;
	}
	
	public Complexo soma(Complexo complexo) {
		complexo.a += this.a;
		complexo.b += this.b;
		return complexo;
	}
	
	/*
	 * Esse aqui tu acabou comigo...
	public Complexo multiplica(Complexo complexo) {
		return ();
	}*/
	
	public String toString() {
		return "(" + this.a + " " + this.b + ")";
	}
}
