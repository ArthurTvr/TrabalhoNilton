package Trabalho;

public class Eletronico extends Produto {
	private double consumoEmWatts;
	
	Eletronico () {
		System.out.println("Estou funcionando!");
	}

	public double getConsumoEmWatts () {
		return this.consumoEmWatts;
	}
	
	public void setConsumoEmWatts (int valorEmWatts) {
		this.consumoEmWatts = valorEmWatts;
	}
}
