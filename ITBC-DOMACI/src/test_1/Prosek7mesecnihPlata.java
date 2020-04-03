package test_1;

import java.util.Scanner;

public class Prosek7mesecnihPlata {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		double plata, prosek;

		prosek = 0;

		System.out.println("Unesite iznose mesecnih plata koje ste zaradili u prvih 7 meseci");

		for (int i = 0; i < 7; i++) {

			System.out.println("Plata za " + (i + 1) + ". mesec");
			plata = sc.nextDouble();

			while (plata < 0) {
				System.out.println("Iznos plate ne moze biti negativan, unesite opet");
				plata = sc.nextDouble();

				// pretpostavljam da plata moze biti i 0, nekada se desi da ne isplate :D

			}

			prosek += plata;

		}

		System.out.println("Prosecna plata za 7 meseci je " + prosek / 7);

	}

}
