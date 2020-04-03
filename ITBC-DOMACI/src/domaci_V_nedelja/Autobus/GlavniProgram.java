package domaci_V_nedelja.Autobus;

public class GlavniProgram {

	public static void main(String[] args) {

		Autobus lasta = new Autobus("Lasta", 300);
		Vozac zika = new Vozac ("Zika", "Zikic");
		
		Putnik stasa = new Putnik ("Stasa", "Basaric", 100);
		Putnik pera = new Putnik ("Pera", "Peric", 300);
		Putnik rada = new Putnik ("Rada", "Radic", -100);
		
		//lasta.dodajVozaca(zika);
		
		if (lasta.dodajVozaca(zika)) 
			System.out.println("Uspesno je dodat vozac " + zika);
		else
			System.out.println("Ne mozete dodati novog vozaca pre nego sto uklonite starog");
		
		//if(lasta.ukloniVozaca()) 
			//System.out.println("Vozac je uspesno uklonjen");
		
		
		if (lasta.dodajPutnika(stasa) && lasta.dodajPutnika(pera) && lasta.dodajPutnika(rada))
			System.out.println("Putnici su uspesno dodati");
		
		System.out.println(lasta);
		
		System.out.println("Cena karte je " +lasta.getCenaKarte());
		
		if(lasta.naplati())
			System.out.println("Karte su naplacene");
		else
			System.out.println("Ne moze se izvrsiti naplata karata jer nema vozaca u autobusu");
		

		Autobus fudeks = new Autobus ("fudeks", 400);
		
		//fudeks.dodajVozaca(zika);
		
		stasa.dodajNovac(300);
		rada.dodajNovac(400);
		
		
		System.out.println(stasa.getNovac() + " " + rada.getNovac());
		
		fudeks.dodajPutnika(rada);
		fudeks.dodajPutnika(stasa);
		
		System.out.println(fudeks);
		
		
		if(fudeks.naplati())
			System.out.println("Karte su naplacene");
		else
			System.out.println("Ne moze se izvrsiti naplata karata jer nema vozaca u autobusu");
		
		
		

	}

}
