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
		this.red = red;
	}

	private void setGreen(int green) {
		this.green = green;
	}

	private void setBlue(int blue) {
		this.blue = blue;
	}

	public int getRed() {
		return red;
	}

	public int getGreen() {
		return green;
	}

	public int getBlue() {
		return blue;
	}

	private int luminosidade() {
		return (int) (this.red * 0.3 + this.green * 0.59 + this.blue * 0.11);
	}

	public int getLuminosidade() {
		return luminosidade();
	}

	public boolean equals(CorRGB corRGB) {
		return this.getRed() == corRGB.getRed() && 
				this.getGreen() == corRGB.getGreen()
				&& this.getBlue() == corRGB.getBlue();
	}

	public String toString() {
		return "#" + Integer.toHexString(this.red) + Integer.toHexString(this.green) + Integer.toHexString(this.blue);
	}

}
