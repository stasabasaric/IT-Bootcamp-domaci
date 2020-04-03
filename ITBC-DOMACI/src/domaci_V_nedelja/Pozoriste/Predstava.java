package domaci_V_nedelja.Pozoriste;

import java.util.ArrayList;

public class Predstava {

	/*
	 * Predstava je opisana nazivom, pozoristem u kojem se izvodi i sadrzi zaposlene
	 * koji ucestvuju u realizaciji predstave. Zaposleni za realizaciju predstave
	 * mogu da se dodaju i izbace. Moze da se dohvati broj zaposlenih na predstavi.
	 * Sastavlja se tekstualni opis predstave navodeci naziv predstave i naziv
	 * pozorista u kojem se predstava odrzava razdvojene zarezom, a potom a potom
	 * zaposlene koji ucestvuju u realizaciji predstave (svakog zaposlenog u
	 * zasebnom redu).
	 */

	private String naziv;
	private Pozoriste pozoriste;
	private ArrayList<Zaposleni> zaposleni;

	public Predstava(String naziv, Pozoriste pozoriste) {
		super();
		this.naziv = naziv;
		this.pozoriste = pozoriste;
		zaposleni = new ArrayList<Zaposleni>();
	}

	public void dodajGlumca(Glumac g) {
		zaposleni.add(g);

	}

	public void izbaciZaposlenog(int i) {
		System.out.println("Uspesno je izbacen zaposleni: " + zaposleni.get(i));
		zaposleni.remove(i);

	}

	public void dodajReditelja(Reditelj r) {
		zaposleni.add(r);
	}

	public int brZaposlenih() {
		return zaposleni.size();
	}

	public String getNaziv() {
		return naziv;
	}

	public Pozoriste getPozoriste() {
		return pozoriste;
	}

	/*
	 * naziv predstave i naziv pozorista u kojem se predstava odrzava razdvojene
	 * zarezom, a potom a potom zaposlene koji ucestvuju u realizaciji predstave
	 * (svakog zaposlenog u zasebnom redu).
	 */

	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(naziv + ", " + pozoriste + "\n");

		for (int i = 0; i < zaposleni.size(); i++) {
			sb.append(zaposleni.get(i));
			sb.append("\n");

		}

		return sb.toString();
	}
}
