package main.java.model;

public class SoruTipiMultipleChoice extends Sorular {
	private String cevap;
	private String secenek1;
	private String secenek2;
	private String secenek3;
	private String secenek4;

	public SoruTipiMultipleChoice() {
	}

	public SoruTipiMultipleChoice(int soruNo, String soruMetni, int soruPaun, String zorlukDerecesi, String secenek1,
			String secenek2, String secenek3, String secenek4, String cevap) {
		super(soruNo, soruMetni, soruPaun, zorlukDerecesi);
		// TODO Auto-generated constructor stub
		this.secenek1 = secenek1;
		this.secenek2 = secenek2;
		this.secenek3 = secenek3;
		this.secenek4 = secenek4;
		this.cevap = cevap;

	}

	public String getCevap() {
		return cevap;
	}

	public void setCevap(String cevap) {
		this.cevap = cevap;
	}
	
	public String getSecenekler() {
		return secenek1 + " " + secenek2 + " "+ secenek3 + " " + secenek4;
	}
	
	@Override
	public String toString() {
		return "SoruTipiMultipleChoice [cevap=" + cevap + ", secenek1=" + secenek1 + ", secenek2=" + secenek2
				+ ", secenek3=" + secenek3 + ", secenek4=" + secenek4 + "]";
	}

}
