package domaci_II_nedelja;

import java.util.Scanner;

public class PravougaonikOdZvezdica {

	public static void main(String[] args) {
		// Napravi program koji ce na izlazu izbaciti sliku pravougaonika od zvezdica:
		// Primer: ulaz m=3, n=7;

		Scanner sc = new Scanner(System.in);

		System.out.println("Unesite dimenzije pravougaonika, m (sirina) i n (duzina) ");

		int m = sc.nextInt();
		int n = sc.nextInt();

		while (m <= 0 || n <= 0) {

			System.out.println(
					"Niste uneli odgvarajuce dimenzije, sirina i duzina ne mogu biti negativne vrednosti ili 0, molim vas unesite opet m i n");
			m = sc.nextInt();
			n = sc.nextInt();

		}

		for (int i = 0; i < m; i++) {
			System.out.println();

			for (int j = 0; j < n; j++) {
				System.out.print(" * ");
			}

		}

	}
}
