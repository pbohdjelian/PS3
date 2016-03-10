package Quiz3;

import java.util.Date;

import exceptions.InsufficientFundsException;
public class Account {

	private int id;
	private double balance;
	private double annualInterestRate;
	private Date dateCreated;

	public Account(){
		id=0;
		balance=0;
		annualInterestRate=0;
		dateCreated=new Date();
	}
	public Account(int ID, double b){
		id=ID;
		balance=b;		
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public double getAnnualInterestRate() {
		return annualInterestRate;
	}
	public void setAnnualInterestRate(double annualInterestRate) {
		this.annualInterestRate = annualInterestRate;
	}
	public double getMonthlyInterestRate() {
		return annualInterestRate / 12;
	}

	public Date getDateCreated() {
		return dateCreated;
	}

	
	public void withdraw(double amt) throws InsufficientFundsException{
		if (amt <= balance) {
			balance -= amt;
		} else {
			double deficit = amt - balance;
			throw new InsufficientFundsException(deficit);
		}

	}

	public void deposit(double amt) {
		 balance += amt;
	}
	
}
