package model;

public class Gene {
	private int codigoGene;

	public Gene() {
		
	}

	public Gene(int codigoGene) {
		this.setCodigoGene(codigoGene);
	}

	public int getCodigoGene() {
		return codigoGene;
	}

	public void setCodigoGene(int codigoGene) {
		this.codigoGene = codigoGene;
	}

	public boolean isIgual(Gene gene) {
		return this.getCodigoGene() == gene.getCodigoGene();
	}
	
	public Gene clonarGene() {
		return new Gene(this.getCodigoGene());
	}
	
}
