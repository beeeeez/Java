package lab2;

import java.util.*;

public class lab3part3 { // spaghetti is for dinner 
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		while (true) {
			int whole = 0, flub=0;
			double dec = 0;
			System.out.println("enter a numerator : ");
			int num = scan.nextInt();

			if (num == 0) {
				System.out.println("done");
				break;
			}

			System.out.println("enter a denominatoasdkngh,n : ");
			int den = scan.nextInt();

			if (num / den < 1) {
				System.out.println(num + " / " + den + " is proper");
			} else if (((double)num / (double)den) > 1) {
				whole = num / den;
				
				dec = ((double)num/(double)den) - whole;
				System.out.println(dec);
				if (dec == 0) {
					System.out.println(num + " / " + den + " is improper and is reduced to " + whole);
				} else {
					flub = num;
					for (int i = 0; i < whole; i++) {
						flub = flub - den;
					}
					System.out.println(num + " / " + den + " is improper and its mixed fraction is  " + whole + " + "
							+ flub + " / " + den);

				}
			}

		}

	}
}
