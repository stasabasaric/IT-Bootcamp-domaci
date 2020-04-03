package domaci_V_nedelja.Pozoriste;

public class Glumac extends Zaposleni {

	/*
	 * Glumac je zaposleni koji ima i naziv uloge. Tekstualni oblik je
	 * uloga_ime[naziv_pozorista].
	 */

	private String uloga;

	public Glumac(String imePrezime, Pozoriste pozoriste, String uloga) {
		super(imePrezime, pozoriste);
		this.uloga = uloga;
	}

	public String getUloga() {
		return uloga;
	}

	public String toString() {
		return uloga + "_" + super.toString();
	}

}
