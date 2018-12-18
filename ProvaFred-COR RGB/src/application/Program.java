package application;

import model.ImagemRGB;

public class Program {

	public static void main(String[] args) {

		ImagemRGB iRgb = new ImagemRGB(5, 1);
		iRgb = iRgb.novaImagem();
		System.out.println(iRgb.toString());

		

	}
}
