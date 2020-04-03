package domaci_V_nedelja.Autobus;

public class Putnik extends Covek {

	/*
	 * Putnik je covek koji poseduje novac. poseduje odredjenu kolicinu novca koja
	 * mu se zadaje prilikom kreiranja. Odredjena svota novca moze da mu se doda
	 * i/ili oduzme, gde je potrebno vratiti indikator uspesnosti.
	 */

	private double novac;

	public Putnik(String ime, String prezime, double novac) {
		super(ime, prezime);
		if (novac > 0)
			this.novac = novac;
	}

	public double getNovac() {
		return novac;
	}

	public boolean dodajNovac(double plus) {
		if (plus > 0) {
			novac += plus;
			return true;
		}

		return false;
	}

	public boolean oduzmiNovac(double minus) {
		if (minus > 0 && minus <= novac) {
			novac -= minus;
			return true;
		}

		return false;
	}

}
