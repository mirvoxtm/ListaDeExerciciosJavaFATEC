package lampada;

public class Lampada {
	private Estado estado;
	
	public void click() {
		if(checaEstado() == Estado.LIGADO) {
			this.estado = Estado.DESLIGADO;
		} else {
			qtdAcendimentos(1);
			this.estado = Estado.LIGADO;
		}
	}
	
	public int qtdAcendimentos(int ac) {
		return qtdAcendimentos(ac + 1);
	}
	
	public Estado checaEstado() {
		return this.estado;
	}
	
}
