package domaci_V_nedelja.Autobus;

public class Covek {
	
	/*Covek poseduje ime i prezime koji se dodeljuju prilikom kreiranja 
	 * objekta. Svi podaci mogu da se dohvate, ali ne i postave.
*/

	private String ime;
	private String prezime;
	
	public Covek(String ime, String prezime) {
		
		this.ime = ime;
		this.prezime = prezime;
		
	}
	
	public String getIme() {
		return ime;
	}
	public String getPrezime() {
		return prezime;
	}
	
	public String toString() {
		return ime + " " + prezime;
	}
	
	
	
}
