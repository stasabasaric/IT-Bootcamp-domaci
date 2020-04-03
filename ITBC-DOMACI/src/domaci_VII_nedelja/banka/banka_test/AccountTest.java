package domaci_VII_nedelja.banka.banka_test;

import static org.testng.Assert.assertEquals;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import domaci_VII_nedelja.banka.banka_kod.Account;

public class AccountTest {

	/*
	 * Potrebno je napraviti test za ispravnost klase Account. Ako se na osnovu
	 * testova pronadjee neka greska u kodu potrebno je da se popravi originalan
	 * kod.
	 * 
	 * Proveriti da li konstruktor public Account(String name, String number) dobro
	 * postavlja argumente, kao i da li get metode vracaju odgovarajuce vrednosti.
	 * Kada se napravi racun, stanje treba da bude jednako 0. Proveriti da li set
	 * metode dobro postavljaju odgovarajuce vrednosti, kao i da li get metode
	 * vracaju odgovarajuce vrednosti. Proveriti da li je ispravan format ispisa
	 * jednog Account-a. Ocekivani format ispisa: broj<tab>ime<tab>stanje. Stanje
	 * treba da bude zaokruzeno na dve decimale. Napraviti 100 000 naloga pomocu
	 * konstruktora public Account(String name) i proveriti da li se svi brojevi
	 * razlikuju.
	 */
	


	@Test
	public void TestConstructor() { //nadjena greska kod getamount, pocetno stanje je 1..

		String name = "stasa";
		String number = "242114";

		Account acc = new Account(name, number);

		SoftAssert sa = new SoftAssert();

		sa.assertEquals(acc.getName(), name);
		sa.assertEquals(acc.getNumber(), number);
		sa.assertEquals(acc.getAmount(), 0d);

		sa.assertAll();

	}

	@Test

	public void TestSetMethods() {
		
		Account acc = new Account("stasa", "1415511");
		acc.setAmount(500d);
		
		Assert.assertEquals(acc.getAmount(), (Double) 500d);

	}
	
	@Test
	
	public void TestPrint() { // nadjena greska nije bilo sa tabovima
		
		Account acc = new Account("stasa","24213");
		String exp = acc.getNumber() + "\t" + acc.getName() + "\t" + "0.00";
		Assert.assertEquals(acc.toString(), exp);
	}

	@Test
	public void TestID() {
		
		Account [] accs = new Account[100]; // pokusala sam sa 100000, mnogo dugo traje.. :D
		
		for (int i = 0; i<accs.length; i++) {
			accs[i] = new Account("stasa");
		}
		
		SoftAssert sa = new SoftAssert();
		
		for (int i = 0; i<accs.length; i++) {
			
			for (int j = i+1; j<accs.length; j++) {
				
				sa.assertNotEquals(accs[i].getNumber(), accs[j].getNumber());
			}
		}
		
		sa.assertAll();
	}
}
