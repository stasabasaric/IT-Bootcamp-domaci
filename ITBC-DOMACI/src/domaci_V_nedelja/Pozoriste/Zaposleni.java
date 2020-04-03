package domaci_V_nedelja.Pozoriste;

public class Zaposleni {

	/*
	 * Zaposleni u pozoristu je opisan imenom (i prezimenom, jedno polje) i
	 * pozoristem u kojem je zaposlen. Svi podaci mogu da se dohvate. Moze da se
	 * sastavi tekstualni opis u obliku ime[naziv_pozorista].
	 */

	private String imePrezime;
	private Pozoriste pozoriste;

	public Zaposleni(String imePrezime, Pozoriste pozoriste) {
		super();
		this.imePrezime = imePrezime;
		this.pozoriste = pozoriste;
	}

	public String getImePrezime() {
		return imePrezime;
	}

	public Pozoriste getPozoriste() {
		return pozoriste;
	}

	public String toString() {
		return imePrezime + "[" + pozoriste.getNaziv() + "]";
	}

}
