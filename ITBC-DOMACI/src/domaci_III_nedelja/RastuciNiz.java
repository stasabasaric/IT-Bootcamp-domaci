package domaci_III_nedelja;

import java.util.Arrays;
import java.util.Scanner;

public class RastuciNiz {

	public static void main(String[] args) {
		// Zadatak:Napisati program koji ucitava duzinu niza, niz i proverava da li je
		// niz rastuci.
		// Primer1 niza: 3 54 123 18
		// Ispis: Niz nije rastuci.
		// Primer2 niza: 71 422 1001 5054
		// Ispis: Niz je rastuci.

		Scanner sc = new Scanner(System.in);

		System.out.println("Unesite n niza");

		int n = sc.nextInt();

		if (n <= 0) {
			System.out.println("Ne mozete uneti negativnu vrednost ili 0 za n, pokusajte opet");
			return;
		}

		int[] niz = new int[n];

		System.out.println("Unos elemenata niza duzine " + n);

		for (int i = 0; i < niz.length; i++) {

			niz[i] = sc.nextInt();
		}

		System.out.println("Elementi niza su " + Arrays.toString(niz));

		boolean rastuci = true;

		for (int i = 1; i < niz.length; i++) {

			if (niz[i] < niz[i - 1])
				rastuci = false;
		}

		if (rastuci)
			System.out.println("Niz je rastuci");
		else
			System.out.println("Niz nije rastuci");

	}

}
