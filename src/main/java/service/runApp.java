package main.java.service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import main.java.model.SoruBankasi;
import main.java.model.SoruTipiDogruYanlis;
import main.java.model.SoruTipiMultipleChoice;
import main.java.model.Sorular;

public class runApp {

	public static void main(String[] args) {
		SoruBankasiServiceImpl sbs = new SoruBankasiServiceImpl();
		SoruBankasi sb1;
		// sb1= sbs.getBanka(2);
		System.out.println("deneme");
		System.out.println(sbs.getBanka(1).getSoruBankasiNo());
		// System.out.println(sb1.getSoruBankasiIsim().toString());

		sbs.addSoruDogruYanlis(sbs.getBanka(1).getSoruBankasiNo(), "Insan 2 ayaklidir", 1, "KOLAY", true);
		// System.out.println(sbs.getBanka(1).toString());

		List<SoruTipiDogruYanlis> myList = new ArrayList<SoruTipiDogruYanlis>();

		// myList=sbs.getBanka(1).getDogruYanlislist1();
		myList = sbs.birinciDogruYanlis;

		for (SoruTipiDogruYanlis c : myList) {
			System.out.println(c.getSoruMetni());
			System.out.println(c.toString());
		}

		System.out.println("-----------------------------------------");
		// Soru cikar!!
		sbs.deleteSoruDogruYanlis(1, "2 ayaklidir");

		for (SoruTipiDogruYanlis c : myList) {
			System.out.println(c.getSoruMetni());
			System.out.println(c.toString());
		}
		System.out.println("--------------------Soru 3 a---------------------");
		List<Sorular> metindenBuldum = new ArrayList<Sorular>();
		metindenBuldum = sbs.soruMetnindekiler(sbs.getBanka(1).getSoruBankasiNo(), "su");
		
		for (Sorular p : metindenBuldum) {
			System.out.println(p.getSoruMetni());
		}
		
		System.out.println("--------------------Soru 3 b---------------------");
		List<Sorular> cevaptanBuldum = new ArrayList<Sorular>();
		cevaptanBuldum = sbs.soruCevabindakiler(sbs.getBanka(1).getSoruBankasiNo(), "MaSa");
		
		for (Sorular p : cevaptanBuldum) {
			System.out.println(p.getSoruMetni());
		}
		
		System.out.println("--------------------Soru 3c,e ---------------------");

		List<SoruTipiMultipleChoice> myMultipleList = new ArrayList<SoruTipiMultipleChoice>();

		myMultipleList = sbs.zorSorular(sbs.coktanSecmeliSorular);
		Collections.sort(myMultipleList);

		for (SoruTipiMultipleChoice d : myMultipleList) {
			System.out.println(d.getSoruMetni());
			System.out.println(d.toString());
		}

		System.out.println("--------------------Soru 3 d ---------------------");
		List<Sorular> birPuanlik = new ArrayList<Sorular>();
		birPuanlik = sbs.birPuanlikSorular(sbs.getBanka(1).getSoruBankasiNo());

		for (Sorular s : birPuanlik) {
			System.out.println(s.toString());
		}
		System.out.println("--------------------Soru 3 d, Kac puanlik ---------------------");
		List<Sorular> kacPuanlik = new ArrayList<Sorular>();
		kacPuanlik = sbs.kacPuanlikSorular(sbs.getBanka(1).getSoruBankasiNo(), 2);
		for (Sorular v : kacPuanlik) {
			System.out.println(v.toString());
		}
	}

}
