package domaci_III_nedelja;

import java.util.Arrays;
import java.util.Scanner;

public class NizoviDeljvost {

	public static void main(String[] args) {
		// Zadatak: Korisnik ucitava niz od n elemenata niza, kao i neki broj br.
		// Program ispisuje elemente niza deljive brojem br.
		// pretpostavka koju uvodim jeste da radimo za ovaj domaci samo sa celim
		// brojevima, takodje po postavci zadatka 1, deluje da n niza odredjujem ja, tako da biram da niz ima ukupno 7 elemenata :)

		Scanner sc = new Scanner(System.in);
		

		int n = 7;

		int niz[] = new int[n];
		
		System.out.println("Niz ima predefinisanu duzinu, odnosno, niz ima 7 elemenata\n");

		for (int i = 0; i < niz.length; i++) {

			System.out.println("Unesite " + (i + 1) + ". element");

			niz[i] = sc.nextInt();

		}
		
		System.out.println("Elementi niza su " + Arrays.toString(niz));

		System.out.println("Unesite broj sa kojim zelite da proverite deljivost elemenata niza");

		int broj = sc.nextInt();

		while (broj <= 0) {

			System.out.println("Necemo proveravati deljivost sa negativnim brojem ili nulom, molim vas unesite pozitvan broj");
			broj = sc.nextInt();
		}

		System.out.println("Elementi koji su deljivi sa brojem " + broj + ": ");
		
		int brojac = 0;
		
		for (int i = 0; i < niz.length; i++) {
			
			if (niz[i]%broj == 0) {
				System.out.print(niz[i]);
				brojac++; 
				
				if (i+1<n) {
					if (brojac > 0) 
						System.out.print(", ");
				
				}
				
			
			}
				

		}
		
		if (brojac ==0)
			System.out.println("Nema elemenata u nizu koji su deljivi sa brojem " + broj);

	}

}
