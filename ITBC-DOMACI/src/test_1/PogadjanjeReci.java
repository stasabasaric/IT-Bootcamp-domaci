package test_1;

import java.util.Scanner;

public class PogadjanjeReci {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String rec, unos, unosMalim;

		rec = "kafa";
		unosMalim = "";

		System.out.println("Unosite reci sve dok ne pogodite zadatu rec");

		do {

			unos = sc.next();
			unosMalim = unos.toLowerCase();

			if (unosMalim.equals(rec))
				System.out.println("Bravo! Pogodili ste zadatu rec");
			else
				System.out.println("Niste pogodili zadatu rec, pokusajte opet");

		} while (!unosMalim.equals(rec));

	}

}
