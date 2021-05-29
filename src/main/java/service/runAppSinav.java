package main.java.service;

import java.util.ArrayList;
import java.util.List;

import main.java.model.CoktanSecmeliSinav;
import main.java.model.Sinav;
import main.java.model.SoruBankasi;
import main.java.model.SoruTipiMultipleChoice;

public class runAppSinav {

	public static void main(String[] args) {
		SoruBankasiServiceImpl sbs = new SoruBankasiServiceImpl();
		
		
		SoruBankasi sb = sbs.getBanka(1);
		List<SoruTipiMultipleChoice> sinavSorulari = new ArrayList<SoruTipiMultipleChoice>();
		int totalSinavPuan=0;
		List<SoruTipiMultipleChoice> soruBankasiSorulari = new ArrayList<SoruTipiMultipleChoice>();
		soruBankasiSorulari= sb.getCoktanSecmeliList1();
		
		
		int lastPoint=0;
		while(  totalSinavPuan <10) {//110
			int soruTempNo =(int)(Math.random()*soruBankasiSorulari.size()) ;
			
			totalSinavPuan = totalSinavPuan+ soruBankasiSorulari.get(soruTempNo).getSoruPaun();
			if(totalSinavPuan>10) {//110
				lastPoint = soruBankasiSorulari.get(soruTempNo).getSoruPaun();
			}
			
			if(totalSinavPuan<10) {//110
				sinavSorulari.add(soruBankasiSorulari.get(soruTempNo));
			}
		}

		for(SoruTipiMultipleChoice c: sinavSorulari  ) {
			System.out.println(c);
		}
		
				
		CoktanSecmeliSinav mCSS = new CoktanSecmeliSinav(1, "COKTAN_SECMELI", totalSinavPuan, sinavSorulari);
		mCSS.setSinavSorulari(sinavSorulari);
		mCSS.setSinavPuan(totalSinavPuan-lastPoint);
		
		System.out.println(mCSS.getSinavPuan());
	}

}
