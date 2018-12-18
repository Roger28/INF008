package model;

public class CorRGB {
	private int red;
	private int green;
	private int blue;

	public CorRGB(int red, int green, int blue) {
		this.setRed(red);
		this.setGreen(green);
		this.setBlue(blue);
	}

	private void setRed(int red) {
		if (red >= 0 && red <= 255) {
			this.red = red;
		}
	}

	private void setGreen(int green) {
		if (red >= 0 && red <= 255) {
			this.green = green;
		}
	}

	private void setBlue(int blue) {
		if (red >= 0 && red <= 255) {
			this.blue = blue;
		}
	}

	public int getRed() {
		return red;
	}

	public int getGreen() {
		return this.green;
	}

	public int getBlue() {
		return this.blue;
	}

	public int getLuminosidade() {
		return (int) (this.getRed() * 0.3 + this.getGreen() * 0.59 + this.getBlue() * 0.11);
	}

	public boolean equals(CorRGB cor) {
		return this.getRed() == cor.getRed() && this.getGreen() == cor.getGreen() && this.getBlue() == cor.getBlue();
	}

	public String toString() {
		return "#" + this.toHex(this.getRed()/16) + this.toHex(this.getRed()%16) +
				this.toHex(this.getGreen()/16) + this.toHex(this.getGreen()%16) +
				this.toHex(this.getBlue()/16) + this.toHex(this.getBlue()%16);
	}

	private char toHex(int valor) {
		if(valor < 10) {
			return (char) (valor + '0');
		}else {
			return (char)((valor - 10) + 'A');
		}
	}

}
