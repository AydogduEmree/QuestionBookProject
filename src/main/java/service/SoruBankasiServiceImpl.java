package main.java.service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import main.java.model.CoktanSecmeliSinav;
import main.java.model.Sinav;
import main.java.model.SoruBankasi;
import main.java.model.SoruTipiDogruYanlis;
import main.java.model.SoruTipiMultipleChoice;
import main.java.model.Sorular;

public class SoruBankasiServiceImpl implements SoruBankasiService {

	private static final String DERECE_ZOR = "ZOR";
	private static final String DERECE_ORTA = "ORTA";
	private static final String DERECE_KOLAY = "KOLAY";

	private static final int PUAN_ZOR = 3;
	private static final int PUAN_ORTA = 2;
	private static final int PUAN_KOLAY = 1;

	List<SoruBankasi> soruBankasiList = new ArrayList<SoruBankasi>();
	List<SoruTipiDogruYanlis> birinciDogruYanlis = new ArrayList<SoruTipiDogruYanlis>();
	List<SoruTipiMultipleChoice> coktanSecmeliSorular = new ArrayList<SoruTipiMultipleChoice>();
	
	public SoruBankasiServiceImpl() { // List<SoruBankasi> soruBankasiGen

		birinciDogruYanlis.add(new SoruTipiDogruYanlis(1, "Su 100 de kaynar ? ", PUAN_ZOR, DERECE_ZOR, true));
		birinciDogruYanlis.add(new SoruTipiDogruYanlis(2, "Su 200 de kaynar ? ", PUAN_ZOR, DERECE_ZOR, false));
		birinciDogruYanlis.add(new SoruTipiDogruYanlis(3, "Su 300 de kaynar ? ", PUAN_ZOR, DERECE_ZOR, false));

		coktanSecmeliSorular.add(new SoruTipiMultipleChoice(1, "Aşağıdakilerden hangisi gitarda tel notalarıdır?",
				PUAN_ZOR, DERECE_ZOR, "A", "Z", "H", "M", "1"));
		coktanSecmeliSorular.add(new SoruTipiMultipleChoice(2, "Aşağıdakilerden hangisi peynir çeşitleridir?",
				PUAN_ORTA, DERECE_ORTA, "Tel", "Karpuz", "Pastırma", "Kavurma", "1"));
		coktanSecmeliSorular.add(new SoruTipiMultipleChoice(3, "Aşağıdakilerden hangisi yüzümüzde bulunur?", PUAN_KOLAY,
				DERECE_KOLAY, "Göz", "Ayak", "Bacak", "Kol", "1"));
		coktanSecmeliSorular.add(new SoruTipiMultipleChoice(4, "Aşağıdakilerden hangisi beynimizde bulunur?",
				PUAN_KOLAY, DERECE_KOLAY, "Kol", "Ayak", "Bacak", "Nöron", "4"));
		coktanSecmeliSorular.add(new SoruTipiMultipleChoice(5, "Aşağıdakilerden hangisi mutfakta kullanilir?", PUAN_ZOR,
				DERECE_ZOR, "Kamyon", "Taksi", "Araba", "Masa", "4"));
		coktanSecmeliSorular.add(new SoruTipiMultipleChoice(6, "Aşağıdakilerden hangisi berberde kullanilir?", PUAN_ZOR,
				DERECE_ZOR, "Kamyon", "Makas", "Araba", "Masa", "2"));
		coktanSecmeliSorular.add(new SoruTipiMultipleChoice(7, "Aşağıdakilerden hangisi kuaforde kullanilir?", PUAN_ZOR,
				DERECE_ZOR, "Kamyon", "Hair Dryer", "Araba", "Masa", "2"));
		coktanSecmeliSorular.add(new SoruTipiMultipleChoice(8, "Aşağıdakilerden hangisi tamircide kullanilir?",
				PUAN_ZOR, DERECE_ZOR, "Kamyon", "Pense", "Araba", "Masa", "2"));
		coktanSecmeliSorular.add(new SoruTipiMultipleChoice(9, "Aşağıdakilerden hangisi sucuda kullanilir?", PUAN_ZOR,
				DERECE_ZOR, "Kamyon", "Damacana", "Araba", "Masa", "2"));
		coktanSecmeliSorular.add(new SoruTipiMultipleChoice(10, "Aşağıdakilerden hangisi firinda kullanilir?", PUAN_ZOR,
				DERECE_ZOR, "Kamyon", "Damacana", "Hamur", "Masa", "3"));

		// soruBankasiList.add(new SoruBankasi(1, "1. Banka", birinciDogruYanlis));
		// soruBankasiList.add(new SoruBankasi(2, "2. Banka", birinciDogruYanlis));

		soruBankasiList.add(new SoruBankasi(1, "1. Banka", birinciDogruYanlis, coktanSecmeliSorular));

	}

	@Override
	public List<SoruBankasi> getSoruBankasi() {
		return soruBankasiList;
	}

	@Override
	public SoruBankasi getBanka(int SoruBankaNo) {
		Iterator<SoruBankasi> iterator = soruBankasiList.iterator();
		while (iterator.hasNext()) {

			SoruBankasi sb = iterator.next();
			if (sb.getSoruBankasiNo() == (SoruBankaNo)) {
				return sb;
			}
		}

		return null;
	}

	@Override
	public void addSoruBankasi(int soruBankasiNo, String soruBankasiIsim, List<SoruTipiDogruYanlis> dogruYanlislist) {
		soruBankasiList.add(new SoruBankasi(soruBankasiNo, soruBankasiIsim, dogruYanlislist));

	}

	@Override
	public void addSoruBankasi2(int soruBankasiNo, String soruBankasiIsim, List<SoruTipiDogruYanlis> dogruYanlislist,
			List<SoruTipiMultipleChoice> coktanSecmeliList1) {
		soruBankasiList.add(new SoruBankasi(soruBankasiNo, soruBankasiIsim, dogruYanlislist, coktanSecmeliList1));

	}

	@Override
	public void addSoruDogruYanlis(int soruBankasiNo, String soruMetni, int soruPaun, String zorlukDerecesi,
			boolean cevap) {
		int maxSoruNo;
		SoruBankasi sb = soruBankasiList.get(soruBankasiNo - 1);
		List<SoruTipiDogruYanlis> addNewList = sb.getDogruYanlislist1();

		if (addNewList.size() == 0) {
			maxSoruNo = 1;
		} else {
			maxSoruNo = addNewList.size() + 1;
		}

		addNewList.add(new SoruTipiDogruYanlis(maxSoruNo, soruMetni, soruPaun, zorlukDerecesi, cevap));

		sb.setDogruYanlislist1(addNewList);

	}

	@Override
	public void addSoruMultipleChoice(int soruBankasiNo, String soruMetni, int soruPaun, String zorlukDerecesi,
			String secenek1, String secenek2, String secenek3, String secenek4, String cevap) {

		int maxSoruNo;
		SoruBankasi sb = soruBankasiList.get(soruBankasiNo - 1);
		List<SoruTipiMultipleChoice> addNewList = sb.getCoktanSecmeliList1();

		if (addNewList.size() == 0) {
			maxSoruNo = 1;
		} else {
			maxSoruNo = addNewList.size() + 1;
		}

		addNewList.add(new SoruTipiMultipleChoice(maxSoruNo, soruMetni, soruPaun, zorlukDerecesi, secenek1, secenek2,
				secenek3, secenek4, cevap));
		sb.setCoktanSecmeliList1(addNewList);

	}

	@Override
	public void deleteSoruDogruYanlis(int soruBankasiNo, String soruMetni) {
		// TODO Auto-generated method stub
		SoruBankasi sb = soruBankasiList.get(soruBankasiNo - 1);
		List<SoruTipiDogruYanlis> addNewList = sb.getDogruYanlislist1();
		boolean isFound = false;
		int soruNo = -1;
		for (SoruTipiDogruYanlis d : addNewList) {
			isFound = d.getSoruMetni().toString().contains(soruMetni);
			if (isFound) {
				soruNo = d.getSoruNo();
			}
		}
		addNewList.remove(soruNo - 1);
		sb.setDogruYanlislist1(addNewList);

	}

	@Override
	public List<SoruTipiMultipleChoice> zorSorular(List<SoruTipiMultipleChoice> soruList) {
		List<SoruTipiMultipleChoice> tempList = new ArrayList<SoruTipiMultipleChoice>();
		for (SoruTipiMultipleChoice k : soruList) {
			if (k.getZorlukDerecesi() == DERECE_ZOR) {
				tempList.add(k);
			}
		}
		return tempList;
	}

	@Override
	public List<SoruTipiDogruYanlis> zorSorularDogruYanlis(List<SoruTipiDogruYanlis> soruList) {
		List<SoruTipiDogruYanlis> tempList = new ArrayList<SoruTipiDogruYanlis>();
		for (SoruTipiDogruYanlis k : soruList) {
			if (k.getZorlukDerecesi() == DERECE_ZOR) {
				tempList.add(k);
			}
		}
		return tempList;
	}

	@Override
	public List<Sorular> birPuanlikSorular(int soruBankasiNo) {
		SoruBankasi sb = soruBankasiList.get(soruBankasiNo - 1);
		List<Sorular> tempSorular = new ArrayList<Sorular>();

		for (SoruTipiDogruYanlis k : sb.getDogruYanlislist1()) {
			if (k.getSoruNo() == 1) {
				tempSorular.add(k);
			}

		}
		for (SoruTipiMultipleChoice m : sb.getCoktanSecmeliList1()) {

			if (m.getSoruNo() == 1) {
				tempSorular.add(m);
			}

		}

		return tempSorular;
	}

	@Override
	public List<Sorular> kacPuanlikSorular(int soruBankasiNo, int kacPuan) {
		SoruBankasi sb = soruBankasiList.get(soruBankasiNo - 1);
		List<Sorular> tempSorular = new ArrayList<Sorular>();

		for (SoruTipiDogruYanlis k : sb.getDogruYanlislist1()) {
			if (k.getSoruNo() == kacPuan) {
				tempSorular.add(k);
			}

		}

		for (SoruTipiMultipleChoice m : sb.getCoktanSecmeliList1()) {

			if (m.getSoruNo() == kacPuan) {
				tempSorular.add(m);
			}

		}
		return tempSorular;
	}

	@Override
	public List<Sorular> soruMetnindekiler(int soruBankasiNo, String soruMetni) {
		SoruBankasi sb = soruBankasiList.get(soruBankasiNo - 1);
		List<Sorular> tempSorular = new ArrayList<Sorular>();

		for (SoruTipiDogruYanlis k : sb.getDogruYanlislist1()) {
			if (k.getSoruMetni().toLowerCase().contains(soruMetni.toLowerCase())) {
				tempSorular.add(k);
			}
		}
		for (SoruTipiMultipleChoice m : sb.getCoktanSecmeliList1()) {

			if (m.getSoruMetni().toLowerCase().contains(soruMetni.toLowerCase())) {
				tempSorular.add(m);
			}
		}

		return tempSorular;
	}

	@Override
	public List<Sorular> soruCevabindakiler(int soruBankasiNo, String soruCevabi) {
		SoruBankasi sb = soruBankasiList.get(soruBankasiNo - 1);
		List<Sorular> tempSorular = new ArrayList<Sorular>();

		for (SoruTipiMultipleChoice m : sb.getCoktanSecmeliList1()) {

			if (m.getSecenekler().toLowerCase().contains(soruCevabi.toLowerCase())) {
				tempSorular.add(m);
			}
		}

		return tempSorular;
	}

	@Override
	public CoktanSecmeliSinav sinavOlustur2(int soruBankasiNo) {
		SoruBankasi sb = soruBankasiList.get(soruBankasiNo - 1);
		List<SoruTipiMultipleChoice> sinavSorulari = new ArrayList<SoruTipiMultipleChoice>();
		int totalSinavPuan = 0;
		List<SoruTipiMultipleChoice> soruBankasiSorulari = new ArrayList<SoruTipiMultipleChoice>();
		soruBankasiSorulari = sb.getCoktanSecmeliList1();

		//int lastPoint=-8;
		while (totalSinavPuan < 10) {// 110
			int soruTempNo = (int) (Math.random() * soruBankasiSorulari.size());

			totalSinavPuan = totalSinavPuan + soruBankasiSorulari.get(soruTempNo).getSoruPaun();
//			if (totalSinavPuan > 10) {// 110
//				lastPoint = soruBankasiSorulari.get(soruTempNo).getSoruPaun();
//			}

			if (totalSinavPuan <= 10) {// 110
				sinavSorulari.add(soruBankasiSorulari.get(soruTempNo));
			}
		}

		CoktanSecmeliSinav mCSS = new CoktanSecmeliSinav(1, "COKTAN_SECMELI", totalSinavPuan,// - lastPoint
				sinavSorulari);
		mCSS.setSinavSorulari(sinavSorulari);
		mCSS.setSinavPuan(totalSinavPuan); // - lastPoint
		return mCSS;
	}

}
