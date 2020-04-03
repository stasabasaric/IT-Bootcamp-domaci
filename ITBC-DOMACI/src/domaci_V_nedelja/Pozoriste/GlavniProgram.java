package domaci_V_nedelja.Pozoriste;

public class GlavniProgram {

	public static void main(String[] args) {

		Pozoriste zvezdara = new Pozoriste("Zvezdara Teatar");
		Predstava osama = new Predstava("Osama-Kasaba u Njujorku", zvezdara);

		osama.dodajReditelja(new Reditelj("Darko Bajic", zvezdara, "Baja"));
		osama.dodajGlumca(new Glumac("Andrija Kuzmanovic", zvezdara, "Pripovedac"));
		osama.dodajGlumca(new Glumac("Jovan Jovanovic", zvezdara, "Murat"));
		osama.dodajGlumca(new Glumac("Iva Ilincic", zvezdara, "Milica(Francuskinja umetnica)"));
		osama.dodajGlumca(new Glumac("Branko Jankovic", zvezdara, "Munir(Meksikanac policajac"));
		osama.dodajGlumca(new Glumac("Isidora Simijonovic", zvezdara, "Esma(Venecuelanka manekenka"));
		osama.dodajGlumca(new Glumac("Amar Corovic", zvezdara, "Bajo(Jevrejin japi)"));

		System.out.println(osama);

		// osama.izbaciZaposlenog(1);

		System.out.println("Broj zaposlenih na predstavi Osama-Kasaba u Njujorku je: " + osama.brZaposlenih());

		Predstava vecera = new Predstava("Vecera budala", zvezdara);
		vecera.dodajGlumca(new Glumac("Lane Gutovic", zvezdara, "Pinjon Fransoa"));

		System.out.println(vecera);

		Pozoriste jdp = new Pozoriste("Jugoslovensko-dramsko pozoriste");
		System.out.println(jdp);

	}

}
