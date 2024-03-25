package cliente;

public class Cliente {
	private String nome;
	private double saldo;
	private double limite;
	
	public void sacar(double quantia) {
		if(checarSaldo() < quantia) {
			System.out.println("Impossível sacar.");
		} else {
			saldo -= quantia;
		}
	}
	
	public void depositar(double quantia) {
		saldo += quantia;
	}

	public double checarSaldo() {
		return saldo + limite;
	}
	
	public String obterNome() {
		return nome;
	}
}
