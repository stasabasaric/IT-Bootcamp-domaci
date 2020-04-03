package domaci_IV_nedelja;

import java.util.Scanner;

public class ElementiVeciOdIndeksa {

	public static void main(String[] args) {
		// Napisati program koji ce na standardnom izlazu ispisati proizvod elemenata
		// niza koji su veci od svog indeksa (preko konzole uneti duzinu i clanove niza)

		Scanner sc = new Scanner(System.in);

		System.out.println("Unesite duzinu niza");
		int n = sc.nextInt();

		while (n <= 0) {
			System.out.println("Duzina niza ne moze biti negativna ili 0, unesite opet");
			n = sc.nextInt();
		}
		

		double[] niz = new double[n];
		double proizvod = 1;
		String veci = "";
		boolean postoji = true;

		System.out.println("Unesite elemente niza, dozvoljeni elementi su tipa prirodnih brojeva\n(napomena za korisnika - indeksi krecu od 0)");
		
		for (int i = 0; i < niz.length; i++) {

			niz[i] = sc.nextDouble();
			if (niz[i] > i) {
				proizvod *= niz[i];
				veci += niz[i] + " ";
			} else
				postoji = false;
		}

		if (postoji) {
			System.out.println("Brojevi koji su veci od svog indeksa: " + veci);
			System.out.println("Proizvod tih brojeva je: " + proizvod);
		} else
			System.out.println("Nema elemenata koji su veci od svog indeksa");

	}

}
