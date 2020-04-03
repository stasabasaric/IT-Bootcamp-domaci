package domaci_II_nedelja;

import java.util.Scanner;

public class SumaPar_ProizvodNepar {

	public static void main(String[] args) {
		/*
		 * Zadatak: Napisati program koji racuna sumu parnih brojeva i proizvod neparnih
		 * brojeva od 0 do n - za resavanje ovog zadatka koristiti samo jednu petlju (ne
		 * jednu vrstu petlje, vec samo jednu petlju). podrazumeva se da se n ucitava
		 * preko standardnog ulaza
		 */

		Scanner sc = new Scanner(System.in);

		System.out.println("Unesite n");

		int n = sc.nextInt();

		if (n < 0) {
			System.out.println("n ne moze biti u minusu, ali cemo svakako koristiti apsolutnu vrednost n");
			n = n * (-1);
			// n=Math.abs(n);
		}

		int sumPar = 0;
		int proizNep = 1;

		for (int i = 0; i <= n; i++) {

			System.out.print(i + " ");

			if (i % 2 == 0)
				sumPar += i;

			else
				proizNep *= i;
		}

		System.out.println("\n\nSuma parnih brojeva je " + sumPar + "\nProizvod neparnih brojeva je " + proizNep);

	}

}
