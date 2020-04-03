package domaci_II_nedelja;

public class Brojevi_od_9_do_250_deljiviSa3 {

	public static void main(String[] args) {
		// Napisati program koji ce prebrojati koliko je brojeva od 9 do 250
		// (ukljucujuci i njih) deljivih brojem 3.

		int brojac = 0;

		for (int i = 9; i <= 250; i++) {

			if (i % 3 == 0) {
				brojac++;
			}

		}
		System.out.println("Ukupan broj brojeva koji je deljiv sa 3 (u ospegu od 9 do 250) je: " + brojac);

	}

}
