package main.java.model;

public class SoruTipiDogruYanlis extends Sorular {
	private boolean cevap;

	public SoruTipiDogruYanlis() {
		
	}
	
	public SoruTipiDogruYanlis(int soruNo, String soruMetni, int soruPaun, String zorlukDerecesi, boolean cevap) {
		super(soruNo, soruMetni, soruPaun, zorlukDerecesi);
		this.cevap = cevap;
	}

	public boolean isCevap() {
		return cevap;
	}

	@Override
	public String toString() {
		return "SoruTipiDogruYanlis [cevap=" + cevap + "]";
	}

	public void setCevap(boolean cevap) {
		this.cevap = cevap;
	}
	
}
