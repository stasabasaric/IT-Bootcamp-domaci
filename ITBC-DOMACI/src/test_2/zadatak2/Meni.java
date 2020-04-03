package test_2.zadatak2;

import java.util.*;

public class Meni {

	/*
	 * Meni sadrzi listu jela. Sadrzi metodu koja dodaje jelo u meni. Moze da se
	 * ispise ceo meni u sledecem formatu: Naziv_jela: nazivNamirnice,
	 * nazivNamirnice, … , nazivNamirnice Naziv_jela: nazivNamirnice,
	 * nazivNamirnice, … , nazivNamirnice Naziv_jela: nazivNamirnice,
	 * nazivNamirnice, … , nazivNamirnice
	 */

	private List<Jelo> jela;
	
	public Meni() {
		jela = new ArrayList<Jelo>();
	}

	public void DodajJelo(Jelo j) {
		
		jela.add(j);
	 
 }
	
	public String toString() {
		StringBuilder sb = new StringBuilder();

		for(int i = 0; i<jela.size(); i++) {
			sb.append(jela.get(i).getNaziv() + ": ");
			for(int j = 0; j<jela.get(i).getSastojci().size()-1; j++) {
				sb.append(jela.get(i).getSastojci().get(j).getNaziv() + ",");
			}
			
			int c = jela.get(i).getSastojci().size();
			sb.append(jela.get(i).getSastojci().get(c-1).getNaziv());
			sb.append("\n");
		}
		
		return sb.toString();
	}

}