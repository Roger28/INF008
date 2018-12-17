package model;

public class Cromossomo {
	private Gene[] genes;

	public Cromossomo(int tamanho) {
		this.setGene(new Gene[tamanho]);
	}

	private void setGene(Gene[] gene) {
		this.genes = gene;
	}

	public Gene getGene(int alelo) {
		return this.genes[alelo];
	}

	public void setGene(int alelo, Gene gene) {
		this.genes[alelo] = gene;
	}

	public Cromossomo clonarCromossomo() {
		Cromossomo novoCromossomo = new Cromossomo(this.genes.length);
		for (int i = 0; i < this.genes.length; i++) {
			novoCromossomo.setGene(i, this.getGene(i).clonarGene());
		}
		return novoCromossomo;
	}

	private int getTamanho() {
		return this.genes.length;
	}

	public double calculaPercentual(Cromossomo cromossomo) {
		double count = 0;
		int i;

		for (i = 0; i < this.getTamanho() && i < cromossomo.getTamanho(); i++) {
			if (this.getGene(i) == null || cromossomo.getGene(i) == null) {
				if (!(this.getGene(i) == null && cromossomo.getGene(i) == null))
					count -= 2;
			} else {
				if (this.getGene(i).equals(cromossomo.getGene(i)))
					count += 1;
				else
					count -= 1;
			}
		}

		Cromossomo maior = this.getTamanho() > cromossomo.getTamanho() ? this : cromossomo;

		for (; i < maior.getTamanho(); i++)
			if (maior.getGene(i) != null)
				count -= 2;

		return (count / this.getTamanho());
	}

}
