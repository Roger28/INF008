package model;

public class Receptor {
	private float proteina;

	//PARTE I - LETRA A
	public Receptor(float proteina) {
		this.setProteina(proteina);
	}

	//PARTE I - LETRA B
	public Receptor() {
		this(0);
	}

	//PARTE I - LETRA C
	public float getProteina() {
		return proteina;
	}
	
	//PARTE I - LETRA C
	private void setProteina(float proteina) {
		this.proteina = proteina;
	}

	//PARTE I - LETRA D
	public float afinidade(Receptor receptor) {
		return this.getProteina() - receptor.getProteina();
	}

	//PARTE I - LETRA E
	@Override
	public String toString() {
		return "[ valor_proteina ]" + "(" + this.getProteina() + ")";
	}
}
