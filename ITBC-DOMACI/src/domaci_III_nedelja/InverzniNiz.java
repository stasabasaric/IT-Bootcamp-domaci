package domaci_III_nedelja;

import java.util.Scanner;

public class InverzniNiz {

	public static void main(String[] args) {
		// Zadatak:Napisati program koji ucitava duzinu niza, niz i ispisuje niz
		// inverznim redosledom.
		// Primer niza: 32 54 123 18
		// Ispis: 18 123 54 32

		Scanner sc = new Scanner(System.in);

		System.out.println("Unesite n niza");

		int n = sc.nextInt();

		if (n <= 0) {
			System.out.println("Ne mozete uneti negativnu vrednost ili 0 za n, pokusajte opet");
			return;
		}

		int niz[] = new int[n];

		for (int i = 0; i < niz.length; i++) {

			System.out.println("Unesite " + (i + 1) + ". element");

			niz[i] = sc.nextInt();

		}

		System.out.println("Elementi niza su ");
		for (int i = 0; i < niz.length; i++) {

			if (i + 2 > niz.length)
				System.out.println(niz[i]);
			else
				System.out.print(niz[i] + ", ");
		}

		System.out.println("Inverzni niz je ");
		for (int i = niz.length - 1; i >= 0; i--) {
			
			if (i == 0)
			System.out.println(niz[i]);
			else
				System.out.print(niz[i] + ", ");

		}

	}

}
