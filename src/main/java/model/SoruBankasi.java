package main.java.model;

import java.util.List;

public class SoruBankasi {
	private int soruBankasiNo;
	private String soruBankasiIsim;
	List<SoruTipiDogruYanlis> dogruYanlislist1;
	List<SoruTipiMultipleChoice> coktanSecmeliList1;
	public SoruBankasi(int soruBankasiNo, String soruBankasiIsim, List<SoruTipiDogruYanlis> dogruYanlislist1) {
		super();
		this.soruBankasiNo = soruBankasiNo;
		this.soruBankasiIsim = soruBankasiIsim;
		this.dogruYanlislist1 = dogruYanlislist1;
	}
	public SoruBankasi(int soruBankasiNo, String soruBankasiIsim, List<SoruTipiDogruYanlis> dogruYanlislist1, List<SoruTipiMultipleChoice> coktanSecmeliList1) {
		super();
		this.soruBankasiNo = soruBankasiNo;
		this.soruBankasiIsim = soruBankasiIsim;
		this.dogruYanlislist1 = dogruYanlislist1;
		this.coktanSecmeliList1 = coktanSecmeliList1;
	}
	
	public SoruBankasi() {
		super();
	}
	public int getSoruBankasiNo() {
		return soruBankasiNo;
	}

	public void setSoruBankasiNo(int soruBankasiNo) {
		this.soruBankasiNo = soruBankasiNo;
	}

	public String getSoruBankasiIsim() {
		return soruBankasiIsim;
	}

	public void setSoruBankasiIsim(String soruBankasiIsim) {
		this.soruBankasiIsim = soruBankasiIsim;
	}

	public List<SoruTipiDogruYanlis> getDogruYanlislist1() {
		return dogruYanlislist1;
	}

	public void setDogruYanlislist1(List<SoruTipiDogruYanlis> dogruYanlislist1) {
		this.dogruYanlislist1 = dogruYanlislist1;
	}
	
	public List<SoruTipiMultipleChoice> getCoktanSecmeliList1() {
		return coktanSecmeliList1;
	}
	public void setCoktanSecmeliList1(List<SoruTipiMultipleChoice> coktanSecmeliList1) {
		this.coktanSecmeliList1 = coktanSecmeliList1;
	}
	@Override
	public String toString() {
		return "SoruBankasi [soruBankasiNo=" + soruBankasiNo + ", soruBankasiIsim=" + soruBankasiIsim
				+ ", dogruYanlislist1=" + dogruYanlislist1 + ", coktanSecmeliList1=" + coktanSecmeliList1 + "]";
	}
	
}
