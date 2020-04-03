package domaci_VII_nedelja.banka.banka_test;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import domaci_VII_nedelja.banka.banka_kod.Account;
import domaci_VII_nedelja.banka.banka_kod.Bank;

public class BankTest {
 
  private Bank intesa;

	@BeforeClass
	public void Bank() {

		intesa = new Bank();
	}
	
	@AfterMethod
	public void Delete() {
		
		intesa.reset();
	}

	@Test
	public void TestAccounts() {

		Account[] accs = new Account[5];
		for (int i = 0; i < accs.length; i++) {
			accs[i] = intesa.openAccount("stasa" + i);

		}

		SoftAssert sa = new SoftAssert();
		for (int i = 0; i < accs.length; i++) {
			sa.assertEquals(intesa.getAccount(accs[i].getNumber()), accs[i]);

		}

		sa.assertAll();
	}

	@Test
	public void TestPayInMoney() {
		
		Account acc = intesa.openAccount("stasa");
		intesa.payInMoney(acc.getNumber(), 500d);
		
		SoftAssert sa = new SoftAssert();
		sa.assertEquals(acc.getAmount(), 500d);
		
		sa.assertAll();
	}
	
	@Test
	
	public void TestTransferMoney() { //nadjena greska, trasnfer ide od account from to account from umesto account to
		
		Account acc1 = intesa.openAccount("Stasa");
		Account acc2 = intesa.openAccount("Zika");
		
		acc1.setAmount(1000d);
		acc2.setAmount(1500d);
		
		intesa.transferMoney(acc2.getNumber(), acc1.getNumber(), 250d);
		SoftAssert sa = new SoftAssert();
		sa.assertEquals(acc1.getAmount(), 1250d);
		sa.assertEquals(acc2.getAmount(), 1250d);
		
		sa.assertAll();
	}
	
	@Test
	public void TestSumMoney() { //nadjena greska, i ide od 1 
		
		Account acc1 = intesa.openAccount("Stasa");
		Account acc2 = intesa.openAccount("Zika");
		Account acc3 = intesa.openAccount("Mika");
		
		acc1.setAmount(1000d);
		acc2.setAmount(3000d);
		acc3.setAmount(2000d);
		
		Double total = 6000d;
		
		Assert.assertEquals(intesa.getSumMoney(), total);
		
	}
}


