package test_2.zadatak2;

import java.util.ArrayList;
import java.util.List;

public class Jelo {

	/*
	 * Jelo sadrži svoj naziv proizvoljno mnogo sastojaka, a za svaki sastojak treba
	 * znati i koliko grama je potrebno. Pri kreiranju se zadaje samo naziv jela.
	 * Treba napraviti metodu koja ce omoguciti dodavanje sastojka koja izgleda
	 * ovako: public void dodajSastojak(Sastojak s, int kolicina); Lista sastojaka
	 * može da se dohvati, kao i naziv. U klasi jelo postoji metoda koja racuna
	 * koliko novca je potrebno da bi se sve namirnice nabavile.
	 */
	
	private String naziv;
	private List<Sastojak> sastojci;
	private static double ukCena;
	
	public Jelo(String naziv) {
		super();
		
		this.naziv = naziv;
		sastojci = new ArrayList<Sastojak>();
	}
	
	public void dodajSastojak(Sastojak s, int kolicina) {
		sastojci.add(s);
		ukCena += kolicina * s.getCena()/1000; 
	}
	
	public String getNaziv() {
		return naziv;
	}
	
	public List<Sastojak> getSastojci() {
		return sastojci;
	}
	
	public double potrebanNovac() {
		return ukCena;
	}
	
	

}
