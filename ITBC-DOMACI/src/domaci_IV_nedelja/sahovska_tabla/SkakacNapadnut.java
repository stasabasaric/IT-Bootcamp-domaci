package domaci_IV_nedelja.sahovska_tabla;

import java.util.Scanner;

public class SkakacNapadnut {

	public static void main(String[] args) {
		// Na sahovskoj tabli je red obelezen brojevima 1 2 3 4 5 6 7 8
		// i kolona takodje brojevima 1 2 3 4 5 6 7 8.
		// Na tabli stoje beli pion i crni skakac. Beli pion pocinje sa dna table a crni
		// skakac sa vrha.
		// Korisnik prvo unosi poziciju piona kao dva cela broja,
		// a zatim poziciju skakaca, gde prvi broj predstavlja red, a drugi kolonu.
		// Program treba da ispise da li se figure nalaze u poziciji da je skakac
		// napadnut.

		// Unos za poziciju se posmatra kao unos koordinata.
		// Koordinate idu od 1 do 8, prva koordinata oznacava red, druga kolonu
		// Tako da kada korisnik unosi dva cela broja, u stvari unosi koordinate
		// pozicije

		 Scanner sc =new Scanner(System.in);
	        System.out.println("Unesi dva broja za poziciju belog piona");
	        int x1=sc.nextInt();
	        int y1=sc.nextInt();
	        System.out.println("Unesi dva broja za poziciju crnog skakaca");
	        int x2=sc.nextInt();
	        int y2=sc.nextInt();

	        if (x1==x2 && y1==y2)  System.out.println("Pion i skakac ne mogu da budu na istom polju");

	        else if (polja(x1,y1)==false || polja(x2,y2)==false) {
	            System.out.println("Greska pri unosu");
	        }
	        else {
	            if (provera(x1,x2,y1,y2)==true)System.out.println("Jeste napadnut");
	            else System.out.println("Nije napadnut");
	        }

	    }

	    public static boolean polja(int x, int y) {
	        if (x<1 || x>8 || y<1 || y>8)
	            return false;
	        else return true;
	    }

	    public static boolean provera(int x1, int x2, int y1, int y2) {
	        if (x1==x2+1 && (y1==y2+1 || y1==y2-1))
	            return true;
	        else return false;
	    }

}
