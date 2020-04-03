package domaci_II_nedelja;

import java.util.Scanner;

public class FibonacijevNiz {

	public static void main(String[] args) {
		// Napisati program koji ce ispisati n brojeva Fibonacijevog niza.
		// Prva dva clana niza su 0, 1, a svaki sledeci clan je jednak zbiru dva prethodnika iz niza. 
		
		Scanner sc = new Scanner (System.in);
		
		int preth1 = 0;
		int preth2 = 1; 
		int clan = 0;
		
		System.out.println("Unesite n Fibonacijevog niza");
		
		int n = sc.nextInt();
		
		while (n<=0) {
			
			System.out.println("n ne moze biti negativan broj ili 0, unesite opet");
			n=sc.nextInt();
		}
		
		System.out.print("0, 1, ");
		
		for (int i = 2; i<n; i++) {
			
			clan = preth1 + preth2;
			preth1= preth2;
			preth2 = clan;
			
			System.out.print(clan);
			
			if (i+1 < n) 
				System.out.print(", ");
			
	

		}
	}

}
