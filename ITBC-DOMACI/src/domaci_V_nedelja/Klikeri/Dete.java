package domaci_V_nedelja.Klikeri;

public class Dete {

	/*
	 * Dete ima ime, prezime, broj godina i broj klikera. Napraviti mogucnost da se
	 * kreira vise objekata klase Dete. Ako se pozove metoda dodajKlikere ili metoda
	 * oduzmiKlikere, broj klikera se azurira. Napraviti metodu koja ce ispisivati
	 * broj klikera i metodu koja ispisuje prosecan broj decjih godina (ako imamo
	 * troje dece, broj prosecnih godina za njih troje; ako imamo dvoje racunamo
	 * prosecne godine za to dvoje) .
	 * 
	 */

	private String ime;
	private String prezime;
	private int brGodina;
	private static int ukupanBrGodina;
	private static int ukupanBrDece;
	private int brKlikera;

	public Dete(String ime, String prezime, int brGodina, int brKlikera) {
		super();
		this.ime = ime;
		this.prezime = prezime;
		this.brGodina = brGodina;
		this.brKlikera = brKlikera;
		ukupanBrGodina += brGodina;
		ukupanBrDece++;
	}

	public void dodajKlikere(int plus) {
		if (plus > 0) {
			brKlikera += plus;
			System.out.println("Klikeri su uspesno dodati");
			return;
		}
		System.out.println("Greska, ne mozete dodati negativan broj klikera");
	}

	public void oduzmiKlikere(int minus) {
		if (minus > 0 && minus <= brKlikera) {
			brKlikera -= minus;
			System.out.println("Klikeri su uspesno oduzeti");
			return;
		}
		if (minus < 0)
			System.out.println("Greska, ne mozete oduzeti negativan br klikera");
		else
			System.out.println("Broj klikera koji zelite da oduzmete je veci nego sto dete ima");
	}

	public static double prosecanBrGodina() {
		return ukupanBrGodina / (double)ukupanBrDece;
	}

	public String getIme() {
		return ime;
	}

	public String getPrezime() {
		return prezime;
	}

	public int getBrGodina() {
		return brGodina;
	}

	public int getBrKlikera() {
		return brKlikera;
	}
	
	public static int ukupanBrGodina() {
		return ukupanBrGodina;
	}

	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(ime).append(" ").append(prezime);
		sb.append(" (" + brGodina + ")");
		sb.append(" - Broj klikera: " + brKlikera);

		return sb.toString();
	}

}
