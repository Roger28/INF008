package application;

import model.ImagemRGB;

public class Program {

	public static void main(String[] args) {

		ImagemRGB iRgb = new ImagemRGB(2, 2);
		iRgb = iRgb.novaImagem();
		
		for (int i = 0; i < iRgb.getAltura(); i++) {
			for (int j = 0; j < iRgb.getLargura(); j++) {
				System.out.println(iRgb.getPixel(i, j).toString());
				
	
			}
		}

	}
}
