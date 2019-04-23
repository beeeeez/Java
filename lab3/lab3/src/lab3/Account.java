package lab3;
import java.util.*;

public class Account {

	
	
	private int id;
	private double balance, annualInterestRate;
	private Date dateCreated;
	
	public Account() {
		buildAccount(0,0);
		
	}
	
	
	
	public Account (int id, int ib) {
		buildAccount(id,ib);
	}
	
	public void buildAccount(int cid, int cib){
		dateCreated = new Date();
		id=cid;
		balance=cib;		
	}	
	public double getMonthlyInterestRate(){
		return annualInterestRate;
	}
	public double getMonthlyInterest() {
		double monthlyInterestRate=annualInterestRate/12;
		double jimmy = balance*monthlyInterestRate;
		return jimmy/100;
	}
	public void withdraw(double amount) {
		balance-=amount;
	}
	public void deposit(double amount) {
		balance+=amount;
	}
	
	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public Date getDateCreated() {
		return dateCreated;
	}



	public void setDateCreated(Date dateCreated) {

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
	
}
