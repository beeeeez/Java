package week4inclass;
import week4inclass.ledger;
import java.util.*;
import java.lang.Exception.*;

public class ledgerDriver {
	public static void main(String[] args) {
		ledger jimbo = new ledger();
		System.out.println("Testing Ledger : ");
		try {
		System.out.println("Adding Sales -  3.52, 2.43, 9, 3.5, 5.0 ");
		jimbo.addSale(3.52);
		jimbo.addSale(2.43);
		jimbo.addSale(9);
		jimbo.addSale(3.5);
		jimbo.addSale(5.0);
		System.out.println("Total Number of Sales : "+jimbo.getNumberOfSales());
		System.out.println("Total Amount of Sales: "+jimbo.getTotalSales());
		System.out.println("Average Amount of Sales: "+jimbo.getAverageSale());
		System.out.println("Total Number of Sales > 3.5 : "+jimbo.getCountAbove(3.5));
		System.out.println("Total Number of Sales > 3 : "+jimbo.getCountAbove(3));
		
		
		}
		catch(ArrayIndexOutOfBoundsException ex) {
			System.out.println("Whoops, I'm bad at coding");
		}
		catch(NumberFormatException ex) {
			System.out.println("Gotta do it with numbers");
		}
		catch(Exception ex) {
			System.out.println(ex);
		}
		finally {
			System.out.println("cya");
		}
		
	}
	
}
