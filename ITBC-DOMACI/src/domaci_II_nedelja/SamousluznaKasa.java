package domaci_II_nedelja;

import java.util.Scanner;

public class SamousluznaKasa {

	public static void main(String[] args) {
		/*
		 * Napisati program koji ima meni za samousluznu kasu u prodavnici. Meni za
		 * potrosace sadrzi sledece opcije:
		 * 
		 * 0 - Izlaz iz programa 1 - dodavanje cene proizvoda na racun (ubacivanje u
		 * potrosacku korpu) 2 - naplata racuna
		 * 
		 * Ukoliko korisnik unese opciju 0 program se zavrsava. Ukoliko korisnik unese
		 * opciju 1 program pita korisnika da unese cenu proizvoda i ta cena se dodaje
		 * na racun u prodavnici. Ukoliko korisnik unese opciju 2 program pita korisnika
		 * da unese kolicinu novca za naplatu racuna. Ukoliko korisnik unese vrednost
		 * manju od vrednosti racuna, potrebno je da se ispise greska, bez umanjenja
		 * racuna i da se ponovo ispise meni. Ukoliko korisnik unese vrednost vecu ili
		 * jednaku od cene racuna ispisuje se kusur i racun se ponovo postavlja na nulu.
		 * Zatim se ponovo ispisuje meni.
		 * 
		 */

		Scanner sc = new Scanner(System.in);

		double cena, racun, naplata;
		int opcija;

		racun = 0; // Pretpostavka je da je racun na pocetku 0

		do {

			System.out.println("\nIzaberite jednu od ponudjenih opcija:\n0 - za izlaz iz programa"
					+ "\n1 - za dodavanje cene proizvoda na racun (ubacivanje u potrosacku korpu)\n2 - za naplatu racuna");

			opcija = sc.nextInt();

			switch (opcija) {

			case 1:
				System.out.println("Unesite cenu proizvoda koja se dodaje na racun");
				cena = sc.nextDouble();

				while (cena <= 0) {
					System.out.println(
							"Cena ne moze biti negativna ili 0, molim vas unesite cenu opet, ako zelite da se vratite na odabir opcija unesite 0");
					cena = sc.nextDouble();

					if (cena == 0)
						break;
				}

				if (cena != 0) {
					racun += cena;
					System.out.println("Uspesno ste uneli cenu, trenutni racun je: " + racun);
				}
				break;

			case 2:
				if (racun == 0) {
					System.out
							.println("Racun je 0, molim vas unesite cene proizvoda kako bi mogla da se izvrsi naplata");
					break;
				}
				System.out.println("Unesite iznos novca za racun koji treba da se naplati");
				naplata = sc.nextDouble();

				if (naplata < 0) {
					System.out.println("Iznos ne moze biti u minusu, pokusajte opet");
					break;
				}

				if (naplata < racun)
					System.out.println("Greska! Uneli ste manji iznos nego sto je iznos na racunu, pokusajte opet");
				else {

					System.out.println("Racun je uspesno placen, iznos kusura je: " + (naplata - racun));
					racun = 0;
				}

				break;

			case 0:
				System.out.println("Hvala na koriscenju samousluzne kase!");
				break;

			default:
				System.out.println("Niste uneli jednu od ponudjenih opcija, molim vas pokusajte opet");

			}

		} while (opcija != 0);

	}

}
