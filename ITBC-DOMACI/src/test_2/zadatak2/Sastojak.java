package test_2.zadatak2;

public class Sastojak {

	/*
	 * Sastojak sadrzi naziv i cenu po kilogramu. Svi podaci mogu da se dohvate.
	 * Omoguciti da cena moze i da se promeni, ali da nikada nece biti negativna.
	 */

	private String naziv;
	private double cena; // cena po KG

	public Sastojak(String naziv, double cena) {
		super();
		this.naziv = naziv;
		this.cena = cena;
	}

	public double getCena() {
		return cena;
	}

	public void setCena(double cena) {
		if (cena < 0) {
			System.out.println("Cena ne moze biti negativna!");
			return;
		}
		this.cena = cena;
	}

	public String getNaziv() {
		return naziv;
	}

}
