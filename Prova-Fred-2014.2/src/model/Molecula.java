package model;

public class Molecula {
	private Receptor[] receptores;

	//PARTE II - LETRA A
	public Molecula(int tamanho) {
		this.receptores = new Receptor[tamanho];
		for (int i = 0; i < receptores.length; i++) {
			this.setReceptor(new Receptor(0), i);
		}
	}

	//PARTE II - LETRA B
	public int getTamanhoMolecula() {
		return this.receptores.length;
	}

	//PARTE II - LETRA B
	public Receptor getReceptor(int i) {
		return this.receptores[i];
	}

	public void setReceptor(Receptor receptor, int i) {
		this.receptores[i] = receptor;
	}

	//PARTE II - LETRA C
	@Override
	public String toString() {
		String rep = "";
		for (int i = 0; i < this.receptores.length; i++) {
			rep += i + "[" + this.receptores[i].getProteina() + "] ";
		}
		return rep;
	}

	//PARTE II - LETRA D
	private int getMenorMolecula(Molecula molecula) {
		if (this.receptores.length <= molecula.getTamanhoMolecula()) {
			return receptores.length;
		} else {
			return molecula.getTamanhoMolecula();
		}
	}

	//PARTE II - LETRA D
	public float getAfinidade(Molecula molecula) {
		float somaAfinidade = 0;
		for (int i = 0; i < getMenorMolecula(molecula); i++) {
			somaAfinidade += this.receptores[i].afinidade(molecula.getReceptor(i));
		}
		return somaAfinidade;
	}

	
}
