package model;

public class ImagemRGB {

	private CorRGB[][] imagem;

	public ImagemRGB(int dimensaoN, int dimensaoM) {
		this.setImagem(new CorRGB[dimensaoN][dimensaoM]);

		for (int i = 0; i < this.imagem.length; i++) {
			for (int j = 0; j < this.imagem[i].length; j++) {
				this.imagem[i][j] = new CorRGB(255, 255, 255);
			}
		}
	}

	public void setImagem(CorRGB[][] imagem) {
		this.imagem = imagem;
	}

	public void setPixel(int i, int j, CorRGB corRGB) {
		this.imagem[i][j] = corRGB;
	}

	public CorRGB getPixel(int i, int j) {
		return this.imagem[i][j];
	}

	public int getAltura() {
		return this.imagem.length;
	}

	public int getLargura() {
		return this.imagem[0].length;
	}

	public ImagemRGB novaImagem() {
		ImagemRGB novo = new ImagemRGB(this.getAltura(), this.getLargura());

		for (int i = 0; i < this.getAltura(); i++) {
			for (int j = 0; j < this.getLargura(); j++) {
				int luminosidade = this.getPixel(i, j).getLuminosidade();
				novo.setPixel(i, j, new CorRGB(luminosidade, luminosidade, luminosidade));
			}
		}

		return novo;
	}

	public boolean equals(ImagemRGB imagem) {
		if (this.getAltura() == imagem.getAltura() && this.getLargura() == imagem.getLargura()) {
			for (int i = 0; i < this.imagem.length; i++) {
				for (int j = 0; j < this.imagem[i].length; j++) {
					if (!this.getPixel(i, j).equals(imagem.getPixel(i, j)))
						return false;
				}
			}
		}
		return true;
	}

}
