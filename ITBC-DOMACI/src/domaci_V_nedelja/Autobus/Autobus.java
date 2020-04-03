package domaci_V_nedelja.Autobus;

import java.awt.List;
import java.util.ArrayList;

public class Autobus {

	/*
	 * Autobus poseduje naziv, vozaca, cenu karte i listu putnika koji se njime
	 * voze. Naziv i cena karte i zadaju se prilikom kreiranja. Moguce je
	 * dodati/ukloniti putnika kao i vozaca. Moguce je naplatiti kartu putnicima
	 * samo ako je vozac prisutan. Autobus ispisati u sledecem obliku: Naziv ( vozac
	 * - Putnik1[novac], Putnik2 [novac],... )
	 */

	// pretpostavljamo da je kapacitet nekog autobusa 100 putnika

	private String naziv;
	private Vozac vozac;
	private double cenaKarte;
	private ArrayList<Putnik> putnici;

	public Autobus(String naziv, double cenaKarte) {
		super();
		this.naziv = naziv;
		this.cenaKarte = cenaKarte;
		putnici = new ArrayList<Putnik>();

	}

	public String getNaziv() {
		return naziv;
	}

	public Vozac getVozac() {
		return vozac;
	}

	public double getCenaKarte() {
		return cenaKarte;
	}

	public boolean dodajVozaca(Vozac v) {
		if (vozac == null) {
			vozac = v;
			return true;
		}

		return false;
	}

	public boolean ukloniVozaca() {
		if (!(vozac == null)) {
			vozac = null;
			return true;

		}

		return false;
	}

	public boolean dodajPutnika(Putnik p) {
		if (putnici.size() <= 100) {
			putnici.add(p);
			return true;
		}
		return false;
	}

	public void ukloniPutnika(Putnik p) {
		putnici.remove(p);
	}

	public boolean naplati() { // naplacujemo svim putnicima u autobusu kartu
		if (!(vozac == null)) {
			for (int i = 0; i < putnici.size(); i++) {
				if (!(putnici.get(i).oduzmiNovac(cenaKarte))) {
					System.out.println("Putnik " + putnici.get(i) + " je uklonjen jer nema dovoljno novca za kartu");
					putnici.remove(i);
					i--;
					
					
				}
			}
			return true;
		}
		return false;
	}

	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(naziv).append(" ( ");
		sb.append(vozac).append(" - ");

		for (int i = 0; i < putnici.size() - 1; i++) {
			sb.append(putnici.get(i)).append("[").append(putnici.get(i).getNovac());
			sb.append("], ");
		}
		sb.append(putnici.get(putnici.size() - 1)).append("[").append(putnici.get(putnici.size() - 1).getNovac());
		sb.append("] )");

		return sb.toString();

	}

}
