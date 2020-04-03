package test_2.zadatak2;

import java.util.*;


public class Torta extends Jelo {

	/*
	 * Torta je jelo za koje se moze doci do informacije o tome da li sadrzi
	 * margarin ili ne. Dodatni zahtev: moze se doci i do informacije o tome koliko
	 * procenata secera postoji u odnosu na celu tortu.
	 */
	
	private int sadrzaj;

	public Torta(String naziv) {
		super(naziv);

	}
	
	public boolean getSastojak(String s) {
		
		List<Sastojak> sastojci1 = getSastojci();
		
		for (int i = 0; i< sastojci1.size(); i++) {
			if(sastojci1.get(i).getNaziv().equals(s)) 
				return true;
		}
	
		return false;
	}
}
