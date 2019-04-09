package week3inclass;

import java.util.*;
import week3inclass.SalesPerson;
import week3inclass.Merlin;

public class main {
	public static void main(String[] args) {

		Merlin wiz1 = Merlin.summon();
		Merlin wiz2 = Merlin.summon();
		System.out.println("The wizard says: " + wiz1.consult());
		System.out.println("The first wiz is " + wiz1.toString());
		System.out.println("The second wiz is " + wiz2.toString());

		/*
		 * float salesCommission;
		 * 
		 * Scanner keyboard = new Scanner(System.in);
		 * 
		 * System.out.println("first name: "); String first = keyboard.nextLine();
		 * 
		 * System.out.println("last name: "); String last = keyboard.nextLine();
		 * 
		 * SalesPerson newGuy = new SalesPerson(first, last);
		 * 
		 * 
		 * System.out.println(newGuy.getFname() + " " + newGuy.getLname());
		 * 
		 * System.out.println("2nd first name: "); first = keyboard.nextLine();
		 * 
		 * System.out.println("2nd last name: "); last = keyboard.nextLine();
		 * SalesPerson newGuy2 = new SalesPerson(); newGuy2.setFname(first);
		 * newGuy2.setLname(last);
		 * 
		 * 
		 * System.out.println(newGuy2.getFname() + " "+ newGuy2.getLname() );
		 * 
		 * System.out.println("do they match ? : " + newGuy2.equals(newGuy));
		 * 
		 * salesCommission = SalesPerson.calculateCommission(0.5f, 100);
		 * System.out.println("The sales commission is " + salesCommission);
		 */
	}
}
