package week4inclass;

import java.lang.Throwable.*;
import java.util.*;

public class exception {
	public static void main(String[] args) {
		int[] numArr = new int[5];
		int x=10;
		for(int i = 0; i < 5 ; i++) {
			numArr[i]=x;
			x+=10;
		}
		Scanner scan = new Scanner(System.in);
		int random = (int) (Math.random() * 10000);
		

		try {
			System.out.println("Enter an index:");
			String jimmy = scan.nextLine();
			int lug = Integer.parseInt(jimmy);
			System.out.println("The element is : "+numArr[lug]);
			
		}
		catch(ArrayIndexOutOfBoundsException ex) {
			System.out.println("Out of Bounds");}
		catch(NumberFormatException ex) {
			System.out.println("Not an Integer");
		}
	}
	

}
