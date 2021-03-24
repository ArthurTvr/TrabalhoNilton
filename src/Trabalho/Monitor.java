package Trabalho;

public class Monitor extends Eletronico {
	
	private int polegadas;

	Monitor(){
		this.setPolegadas(21);
		System.out.println("Polegadas: " +this.getPolegadas());
	}
	
	public int getPolegadas() {
		return polegadas;
	}

	public void setPolegadas(int polegadas) {
		this.polegadas = polegadas;
	}
}
