package main.java.service;

import main.java.model.CoktanSecmeliSinav;
import main.java.model.SoruTipiMultipleChoice;

public class runCoktanSecmeliSinav {

	public static void main(String[] args) {
		SoruBankasiServiceImpl sbs = new SoruBankasiServiceImpl();
		CoktanSecmeliSinav mCSS= new CoktanSecmeliSinav(0, null, 0, null);
		mCSS= sbs.sinavOlustur2(1);
		
		for( SoruTipiMultipleChoice c: mCSS.getSinavSorulari()) {
			System.out.println(c.getSoruMetni());
			System.out.print(c.getSecenekler() );
			System.out.println();
		}
		
	}

}
