package test_2.zadatak2;

public class Supa extends Jelo {
	
	
	private int vremeKuvanja;

	public Supa(String naziv, int duzinaKuvanja) {
		super(naziv);
		
		this.vremeKuvanja=duzinaKuvanja;
	}
	
	/* 
Supa je jelo za koje se pamti informacija o tome koliko dugo se kuva koja može da se dohvati. */
	
	
	public int getVremeKuvanja() {
		return vremeKuvanja; 
	}

}
