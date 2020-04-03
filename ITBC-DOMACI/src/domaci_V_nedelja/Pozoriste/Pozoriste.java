package domaci_V_nedelja.Pozoriste;

public class Pozoriste {

	/*
	 * Pozoriste ima jednoznacan automatski generisan celobrojan identifikator i
	 * naziv koji mogu da se dohvate. Moze da se sastavi tekstualni opis u obliku
	 * naziv[id].
	 * 
	 */

	private String naziv;
	private int id;
	private static int globalId;

	public Pozoriste(String naziv) {
		super();
		this.naziv = naziv;
		id = globalId;
		globalId++;
	}

	public String getNaziv() {
		return naziv;
	}

	public int getId() {
		return id;
	}

	public String toString() {
		return naziv + "[" + id + "]";

	}

}
