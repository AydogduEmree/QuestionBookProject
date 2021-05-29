package main.java.model;

public class Sinav {
	private int sinavNo;
	private String sinavCinsi;
	private int sinavPuan;
	public int getSinavNo() {
		return sinavNo;
	}
	public void setSinavNo(int sinavNo) {
		this.sinavNo = sinavNo;
	}
	public String getSinavCinsi() {
		return sinavCinsi;
	}
	public void setSinavCinsi(String sinavCinsi) {
		this.sinavCinsi = sinavCinsi;
	}
	
	public int getSinavPuan() {
		return sinavPuan;
	}
	public void setSinavPuan(int sinavPuan) {
		this.sinavPuan = sinavPuan;
	}
	public Sinav(int sinavNo, String sinavCinsi) {
		super();
		this.sinavNo = sinavNo;
		this.sinavCinsi = sinavCinsi;
	}
	public Sinav(int sinavNo, String sinavCinsi, int sinavPuan) {
		super();
		this.sinavNo = sinavNo;
		this.sinavCinsi = sinavCinsi;
		this.sinavPuan = sinavPuan;
	}
}
