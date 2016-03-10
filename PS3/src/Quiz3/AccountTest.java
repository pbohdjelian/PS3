package Quiz3;

import static org.junit.Assert.*;

import org.junit.Test;

import exceptions.InsufficientFundsException;

public class AccountTest extends Account {

	@Test
	public void test() throws InsufficientFundsException {
		Account Account1 = new Account(1122, 20000);

		assertEquals(Account1.getId(), 1122, 1122);
		assertEquals(Account1.getBalance(), 20000, 2000);
		assertEquals(Account1.getAnnualInterestRate(), 0.045, 0.045);

		Account1.deposit(3000);

		System.out.println("The balance is $" + Account1.getBalance());
		System.out.println("The monthly interest rate is " + Account1.getMonthlyInterestRate());
		System.out.println("The account's creation date is " + Account1.getDateCreated());

		try {
			Account1.withdraw(2500);
		} catch (InsufficientFundsException ife) {
			System.out.println("Sorry,you are $" + ife.getAmount() + "short");
		}
		try {
			Account1.withdraw(50000);
		} catch (InsufficientFundsException ife) {
			System.out.println("Sorry,you are $" + ife.getAmount() + " short");
		}
	}
}