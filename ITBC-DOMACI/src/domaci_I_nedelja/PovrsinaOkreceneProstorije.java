package domaci_I_nedelja;

import java.util.Scanner;

public class PovrsinaOkreceneProstorije {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Zadatak: Napisati program koji ce racunati povrsinu okrecene prostorije, tako
		 * sto se ivice prostorije ucitavaju preko konzole (za pretpostavku uzeti da
		 * soba ima zidove oblika pravougaonika i da nema prozora)
		 */

		// Uvodim sledece pretpostavke:
		// S obzirom na to da u zadatku nije specifirano koliko prostorija ima zidova,
		// pretpostavka je da ima 4 zida

		// Povrsinu ce biti racunata kao za kvadar P=2B+M, P=2*(a*b + a*c + b*c)
		// S obzirom da racunamo povrsinu okrecenih zidova to bi bila formula bez jedne
		// baze
		// tj a*b+2*c*(a+b), jer ne uzimamo u obzir da se pod krecio..
		// Takodje, ukoliko prostorija ima vrata, korisnik moze da unese i dimenzije za
		// vrata, kako se ne bi uzimale u obzir prilikom racunanja povrsine

		Scanner sc = new Scanner(System.in);

		float a, b, c;

		System.out.println("Unesite ivice prostorije, a, b i c");

		a = sc.nextFloat();
		b = sc.nextFloat();
		c = sc.nextFloat();

		double povrsina;

		if (a <= 0 || b <= 0 || c <= 0) {

			System.out.println("Niste uneli adekvatan iznos za ivice, dimenzije moraju biti pozitivne");

			return;

		}

		float a2, b2;

		a2 = 0;
		b2 = 0;

		System.out.println("Ukoliko prostorija ima vrata unesite dimenzije, a2 i b2, ukoliko ne unesite samo 0");

		a2 = sc.nextFloat();

		if (a2 < 0) {
			System.out.println("Dimenzije ne mogu biti negativne, pokusajte opet");
			return;
		}

		else {
			if (a2 > 0) {
				b2 = sc.nextFloat();
				if (b2 <= 0) {
					System.out.println("Ivica b2 ne moze biti negativna ni 0, pokusajte opet");
					return;
				}

			}

			if (a2 > 0 && b2 > 0) {

				if ((a2 * b2) > (a * c)) {
					System.out.println("Dimenzije vrata ne mogu biti vece od zida, molim vas unesite opet");
					return;
				}

			}

			double okrecpovrsina = a * b + 2 * c * (a + b) - (a2 * b2);

			System.out.println("Povrsina okrecenih delova prostorije: " + okrecpovrsina);

		}
	}

}
