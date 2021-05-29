package main.java.service;

import java.util.List;

import main.java.model.CoktanSecmeliSinav;
import main.java.model.Sinav;
import main.java.model.SoruBankasi;
import main.java.model.SoruTipiDogruYanlis;
import main.java.model.SoruTipiMultipleChoice;
import main.java.model.Sorular;

public interface SoruBankasiService {

	List<SoruBankasi> getSoruBankasi();

	SoruBankasi getBanka(int SoruBankaNo);

	void addSoruBankasi(int soruBankasiNo, String soruBankasiIsim, List<SoruTipiDogruYanlis> dogruYanlislist);

	void addSoruBankasi2(int soruBankasiNo, String soruBankasiIsim, List<SoruTipiDogruYanlis> dogruYanlislist,
			List<SoruTipiMultipleChoice> coktanSecmeliList1);
	
	void addSoruDogruYanlis(int soruBankasiNo, String soruMetni, int soruPaun, String zorlukDerecesi, boolean cevap);

	void addSoruMultipleChoice(int soruBankasiNo, String soruMetni, int soruPaun, String zorlukDerecesi,
			String secenek1, String secenek2, String secenek3, String secenek4, String cevap);
	
	//Soru 2
	void deleteSoruDogruYanlis(int soruBankasiNo, String soruMetni);
	
	
	//Soru 3
	List<Sorular> soruMetnindekiler(int soruBankasiNo, String soruMetni);
	List<Sorular> soruCevabindakiler(int soruBankasiNo, String soruCevabi);
	
	List<SoruTipiMultipleChoice> zorSorular(List<SoruTipiMultipleChoice> soruList);
	List<SoruTipiDogruYanlis> zorSorularDogruYanlis(List<SoruTipiDogruYanlis> soruList);
	
	List<Sorular>	birPuanlikSorular(int soruBankasiNo);
	List<Sorular>	kacPuanlikSorular(int soruBankasiNo, int kacPuan);
	
	//Soru4
	CoktanSecmeliSinav sinavOlustur2(int soruBankasiNo);
}
