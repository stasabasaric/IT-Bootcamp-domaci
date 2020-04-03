package domaci_II_nedelja;

import java.util.Scanner;

public class UnosPozBrojeva_Suma {

	public static void main(String[] args) {
		/*
		 * Napisati program koji unosi i sabira brojeve dokle god nije unesen negativan
		 * broj, i ispisuje njihov zbir (zbir pozitivnih brojeva). primer: ako korisnik
		 * unese 1 2 5 3 -1, program treba da ispise 11
		 */

		Scanner sc = new Scanner(System.in);

		double br, zbir;

		zbir = 0;

		System.out.println("Unesite pozitivne brojeve za zbir, a ukoliko zelite da zavrsite unos"
				+ " i dobijete rezultat unesite negativan broj");

		do {

			br = sc.nextDouble();

			if (br > 0)
				zbir += br;

		} while (br >= 0);

		System.out.println("Zbir unesenih brojeva je: " + zbir);

	}

}
