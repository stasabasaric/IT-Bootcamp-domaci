package domaci_IV_nedelja;

import java.util.Scanner;

public class Palindrom2 {

	public static void main(String[] args) {
		// Napisati program koji ce na standarnom izlazu ispisati poruku
		// “Niz je palindrom” ili “Niz nije palindrom” (u zavisnosti da li niz jeste ili
		// nije palindrom). URADITI KORISTECI METODE
		// Korisnik unosi int [ ]

		// Niz je palindrom ukoliko se i sa leve i desne strane cita isto
		// Niz je celobrojnog tipa

		Scanner sc = new Scanner(System.in);

		System.out.println("Unesite duzinu niza");
		int n = sc.nextInt();

		while (n <= 1) {
			System.out.println("Duzina niza ne moze biti negativna, 0 ili 1, unesite opet");
			// U startu ne dozvoljavamo da korisnik unosi 1 kao duzinu niza
			// kako program ne bi proveravao jednoclani niz bespotrebno
			n = sc.nextInt();
		}

		int[] niz = ucitavanjeNiza(sc, n);

		if (palindrom(niz))
			System.out.println("Niz je palindrom");
		else
			System.out.println("Niz nije palindrom");
	}

	public static int[] ucitavanjeNiza(Scanner s, int n) {

		int[] niz = new int[n];
		System.out.println("Unesite elemente niza, dozvoljeni elementi su tipa celih brojeva");
		for (int i = 0; i < niz.length; i++) {
			niz[i] = s.nextInt();
		}

		return niz;

	}

	public static boolean palindrom(int[] niz) {

		for (int i = 0, j = niz.length - 1; i < niz.length / 2 && j >= niz.length / 2; i++, j--) {
			// ukoliko je duzina niza neparna, ne mora da se uzima u obzir srednji clan
			// jer je svakako i kad se cita sa leva i sa desna srednji clan uvek isti

			if (!(niz[i] == niz[j])) {
				return false;

			}

		}
		return true;

	}

}
