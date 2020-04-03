package Zvezdice;

import java.util.Scanner;

public class TrougaoDesno {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = 10;

		for (int i = 0; i < n; i++) {
			if (i > 0)
				System.out.println();

			for (int k = 0; k < n - (i + 1); k++) {
				System.out.print(" ");

			}

			for (int j = 0; j < i + 1; j++) {

				System.out.print("*");

			}

		}

	}

}