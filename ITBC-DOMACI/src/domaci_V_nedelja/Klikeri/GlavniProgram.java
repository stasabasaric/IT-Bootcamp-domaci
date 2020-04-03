package domaci_V_nedelja.Klikeri;

public class GlavniProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Dete zika = new Dete("Zika", "Zikic", 10, 5);
		Dete mika = new Dete("Mika", "Mikic", 11, 3);
		Dete pera = new Dete("Pera", "Peric", 8, 2);
		Dete joca = new Dete("Joca", "Jocic", 6, 1);
		
		System.out.println(zika + ";   " + mika + "\n" + pera + ";   " + joca);
		
		zika.dodajKlikere(2);
		joca.oduzmiKlikere(5);
		pera.dodajKlikere(4);
		mika.oduzmiKlikere(1);
		
		System.out.println(zika + ";   " + mika + "\n" + pera + ";   " + joca);
		
		
	System.out.println("Prosecan broj godina: " + Dete.prosecanBrGodina());	
		
		
		
		

	}

}
