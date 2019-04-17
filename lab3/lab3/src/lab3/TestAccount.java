package lab3;
import lab3.Account;
public class TestAccount {
	public static void main(String[] args) {
		Account jimmy = new Account(1122, 20000);
		jimmy.setAnnualInterestRate(.45);
		jimmy.withdraw(2500);
		jimmy.deposit(3000);
		System.out.println("balance - "+jimmy.getBalance());
		System.out.println("monthly interest - "+jimmy.getMonthlyInterest());
		System.out.println("date - "+jimmy.getDateCreated().toString());
		
		
	}
}
