package test_1;

import java.util.Scanner;

public class PogadjanjeReciModif {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String rec, unos, unosMalim;

		rec = "kafa";
		unosMalim = "";

		int i = 1;

		System.out.println("POGADJANJE RECI\nImate 5 pokusaja da pogodite zadatu rec\n");

		do {

			if (i > 5) {
				System.out.println("Nazalost nemate vise pokusaja, vise srece drugi put :)");
				break;
			}

			System.out.println(i + ". pokusaj");

			unos = sc.next();
			unosMalim = unos.toLowerCase();

			if (unosMalim.equals(rec)) {
				System.out.println("Bravo! Pogodili ste zadatu rec iz " + i + ". pokusaja");
				break;
			} else {
				if (i < 5) {
					System.out.println("Niste pogodili zadatu rec, pokusajte opet");
				}
			}

			i++;

		} while (!unosMalim.equals(rec));

	}

}