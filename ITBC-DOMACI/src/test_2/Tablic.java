package test_2;

import java.util.Scanner;

public class Tablic {

	public static void main(String[] args) {

		// Napraviti metodu koja ce da u jedan niz ucita sve karte koje je jedan
		// korisnik sakupio.
		// Karte ucitavati kao cele brojeve - kec je broj 11, zandar 12, dama 13 i kralj
		// 14.
		// Traziti od korisnika da ucita koliko karata ima, a nakon toga koje su to
		// karte.
		// Voditi racuna o tome da li su broj karata, kao i svaka karta, korektne
		// vrednosti.

		// Napraviti metodu koja broji koliko ima stihova u nizu.
		// Podrazumevati da mala dvojka i dupla desetka nemaju specijalno znacenje.

		// Napraviti metodu koja ce za dva prosledena niza vratiti informaciju
		// o tome ko je pobednik (ko ima vise sakupljenih stihova).

		// Napraviti glavni program koji prikazuje primenu svih prethodno napisanih
		// metoda.

		Scanner sc = new Scanner(System.in);

		System.out.println("Ucitavanje niza za igraca 1");
		int[] niz1 = ucitavanjeNiza();
		if (niz1 == null)return;
		System.out.println("Ucitavanje niza za igraca 2");
		int[] niz2 = ucitavanjeNiza();
		if (niz2 == null) return;
		if (niz2.length + niz1.length > 52) {
			System.out.println("Ukupan broj sakupljenih karata je veci nego sto ima u spilu, pokusajte opet");
			return;
		}
		
		else
			if (niz2.length + niz1.length < 52) {
				System.out.println("Ukupan broj sakupljenih karata je manji nego sto ima u spilu, pokusajte opet");
				return;
			}
		
		Pobednik(niz1, niz2);

	}

	public static void Pobednik(int[] n1, int[] n2) {

		int brojac1 = brStihova(n1);
		int brojac2 = brStihova(n2);

		if (brojac1 > brojac2)
			System.out.println("Pobednik je igrac broj 1");
		else {
			if (brojac1 < brojac2)
				System.out.println("Pobednik je igrac broj 2");
			else
				System.out.println("Nereseno");
		}
	}

	public static int brStihova(int[] niz) {

		int stihovi = 0;
		for (int i = 0; i < niz.length; i++) {
			if (niz[i] >= 10) {
				stihovi++;
			}

		}

		return stihovi;
	}

	public static int[] ucitavanjeNiza() {

		Scanner sc = new Scanner(System.in);

		System.out.println("Unesite koliko karata ste sakupili");
		int broj = sc.nextInt();

		while (broj < 0 || broj > 52) {
			System.out.println("Ne mozete uneti negativnu vrednost sakupljenih karata ili vecu od 52, pokusajte opet");
			broj = sc.nextInt();
		}

		if (broj == 0)
			return null;

		System.out.println("Unesite karte koje ste sakupili, napomena karte mogu imati vrednosti od 2 do 14, "
				+ "karte ucitavati kao cele brojeve - kec je broj 11, zandar 12, dama 13 i kralj 14");

		int[] niz = new int[broj];

		int brojac = 0;
		for (int i = 0; i < niz.length; i++) {
			niz[i] = sc.nextInt();

			while (niz[i] < 2 || niz[i] > 14) {
				System.out.println("Ne mozete uneti nepostojecu kartu, vrednosti mogu biti od 2 do 14, unesite opet");
				niz[i] = sc.nextInt();
			}
			if (i > 0) {
				if (niz[i] == niz[i - 1]) {
					brojac++;
				}

			}

			if (brojac > 4) {
				System.out.println(
						"Za svaku vrstu karte imamo po 4 znaka, ne mozete sakupiti 5.. probajte opet sa ucitavanjem niza");
				return null;
			}
		}

		return niz;
	}

}
