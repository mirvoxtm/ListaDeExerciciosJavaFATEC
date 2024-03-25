package pack;

public class Churrasco {
	private double qtdCarne;
	
	public void verificarConsumo(Pessoa pessoa) {
		if (pessoa.isVegetariana() == true || pessoa.getIdade() <= 3) {
			qtdCarne = 0.00;
		}
		
		else {
			if (pessoa.getIdade() <= 12) {
				qtdCarne = 1.00;
			}
			
			else {
				qtdCarne = 2.00;
			}
		}
	}
	
}
