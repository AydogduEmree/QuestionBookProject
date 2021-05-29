package main.java.model;

import java.util.List;

public class CoktanSecmeliSinav extends Sinav {

	private List<SoruTipiMultipleChoice> sinavSorulari;

	public CoktanSecmeliSinav(int sinavNo, String sinavCinsi, int sinavPuan,
			List<SoruTipiMultipleChoice> sinavSorulari) {
		super(sinavNo, sinavCinsi, sinavPuan);
		this.sinavSorulari = sinavSorulari;
	}

	public List<SoruTipiMultipleChoice> getSinavSorulari() {
		return sinavSorulari;
	}

	public void setSinavSorulari(List<SoruTipiMultipleChoice> sinavSorulari) {
		this.sinavSorulari = sinavSorulari;
	}

	@Override
	public String toString() {
		return "CoktanSecmeliSinav [sinavSorulari=" + sinavSorulari + "]";
	}

}
