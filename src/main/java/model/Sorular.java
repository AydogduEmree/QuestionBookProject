package main.java.model;

public class Sorular implements Comparable<Sorular>{
	private int soruNo;
	private String soruMetni;
	private int soruPaun;
	private String zorlukDerecesi;

	public Sorular() {
	}	
	
	public Sorular(int soruNo, String soruMetni, int soruPaun, String zorlukDerecesi) {
		this.soruNo = soruNo;
		this.soruMetni = soruMetni;
		this.soruPaun = soruPaun;
		this.zorlukDerecesi = zorlukDerecesi;
	}

	public int getSoruNo() {
		return soruNo;
	}

	public void setSoruNo(int soruNo) {
		this.soruNo = soruNo;
	}

	public String getSoruMetni() {
		return soruMetni;
	}

	public void setSoruMetni(String soruMetni) {
		this.soruMetni = soruMetni;
	}

	public int getSoruPaun() {
		return soruPaun;
	}

	public void setSoruPaun(int soruPaun) {
		this.soruPaun = soruPaun;
	}

	public String getZorlukDerecesi() {
		return zorlukDerecesi;
	}

	public void setZorlukDerecesi(String zorlukDerecesi) {
		this.zorlukDerecesi = zorlukDerecesi;
	}

	@Override
	public int compareTo(Sorular o) {
		
		return this.soruPaun > o.soruPaun ? 1 : this.soruPaun < o.soruPaun ? -1 : 0;
	}
	

}
