package domaci_II_nedelja;

public class Vezbanje_InkrementiIDekrementi {

	public static void main(String[] args) {
		/*
		 * Napisati 8 primera za post inkrementu (i++), pre inkrementu (++i), post
		 * dekrementu (i--) i pre dekrementu (--i) i u programu u komentarima opisati
		 * kako koji primer funkcionise. Napisati po 2 primera o svakom, koristeci
		 * promenljive a, b, c koje su i deklarisane i definisane
		 */

		int a = 30;
		int b = 22;
		int c = 12;

		// Primeri za post inkremente, post inkrement prvo cita broj pa povecava za 1

		a = b++ + c++; // b++ (cita 22, a b postaje 23) c++ (cita 12, a c postaje 13) a=34
		a = b++ + b++; // b++ (cita 23, a b postaje 24) b++ (cita 24, a b postaje 25) a=47

		System.out.println("a je " + a);

		// Primeri za pre inkremente, pre inkrement prvo povecava za 1, pa cita broj

		b = ++a - ++b; // ++a (povecava za 1 i cita povecanu vrednost, a postaje 48) ++b (povecava za 1
						// i cita povecanu vrednost, b postaje 26)
		// b = 48-26 = 22

		System.out.println("b je " + b);

		a = ++c + ++c; // ++c (povecava za 1 i cita povecanu vrednost, c postaje 14) ++ c (povecava za
						// 1 i cita povecanu vrednost, c postaje 15)
		// a = 14+15 = 29

		System.out.println("a je " + a);

		// Primeri za post dekremente, post dekrement prvo cita vrednost pa umanjuje za
		// 1

		a = a-- - c--; // a-- (prvo cita a = 29, pa umanjuje za 1, a postaje 28) c-- (prvo cita c = 15,
						// pa umanjuje za 1 c=14)
		// a = 29 - 15 = 14

		System.out.println("a je " + a);

		b = a-- + a--; // a-- (prvo cita a = 14, pa umanjuje za 1, a postaje 13) a-- (prvo cita a = 13,
						// pa umanjuje za 1, a postaje 12)
		// b = 14 + 13 = 27
		System.out.println("b je " + b);

		// Primeri za pre dekremente

		c = --b - --c; // --b (prvo umanjuje b za 1, pa cita vrednost b = 26) --c (prvo umanjuje c za
						// 1, pa cita c = 13)
		// c = 26 - 13 = 13

		System.out.println("c je " + c);

		b = --c + --c; // --c ( prvo umanjuje za 1, pa cita vrednost c = 12) -- c (prvo umanjuje za 1,
						// pa cita vrednost c = 11)
		// b = 12 + 11 = 23

		System.out.println("b je " + b);

		System.out.println("\na = " + a + " b = " + b + " c = " + c);

		int x = ++a + --b - c++ - c-- + b++ + --a + b--;
		// 13 + 22 - 11 - 12 + 22 + 12 + 23 = 69
		// 13 22 12 11 23 12 22
		// a = 12 b = 22 c = 11

		System.out.println("\nx je " + x);
		System.out.println("\na = " + a + " b = " + b + " c = " + c);

	}

}
