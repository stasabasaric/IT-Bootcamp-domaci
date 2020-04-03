package domaci_IV_nedelja;

import java.util.Scanner;

public class ReciNaSlovoD {

	public static void main(String[] args) {
		// Dodatni neobavezni zadatak
		//Korisnik unosi recenicu po izboru. Prebrojati koliko ima reci koje pocinju slovom d.

	Scanner sc = new Scanner(System.in);
	
	System.out.println("Unesite recenicu za koju program proverava koliko reci ima koje pocinju slovom d");
	
	String recenica = sc.nextLine();
	
	String [] niz = recenica.split(" ");
	
	int brojac=0;
	String reci = "";
	for (int i = 0; i<niz.length; i++) {
		
		if (niz[i].charAt(0)== 'd') {
			brojac++;
			reci += niz[i] + " ";
			
		}
		
	}
	
	System.out.println("Reci koje pocinju na slovo d: " + reci + "\nUkupan broj je: " + brojac);
	

	}

}
