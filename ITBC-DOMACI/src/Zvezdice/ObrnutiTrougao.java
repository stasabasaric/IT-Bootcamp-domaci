package Zvezdice;

import java.util.Scanner;

public class ObrnutiTrougao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int n = 8;

		for (int i = 0; i < n; i++) {
			System.out.println();
			
			for (int r = 0;r<i+1; r++) {
			
					System.out.print(" ");
				
			}
			
				for (int j = 0; j < n-i; j++) {
		
					System.out.print(" *");

				}
			
			
			

			}

	}

}
