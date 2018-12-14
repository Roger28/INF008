package application;

import model.Molecula;
import model.Receptor;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Molecula molecula = new Molecula(5);
		Molecula molecula2 = new Molecula(5);

		for (int i = 0; i < molecula.getTamanhoMolecula(); i++) {
			molecula.setReceptor(new Receptor(310), i);
		}
		
		for (int i = 0; i < molecula2.getTamanhoMolecula(); i++) {
			molecula2.setReceptor(new Receptor(10), i);
		}

		System.out.println(molecula.getAfinidade(molecula2));

	}

}
