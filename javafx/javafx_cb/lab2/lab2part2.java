package lab2;

import java.util.*;
import java.util.List;
import java.util.Arrays;

public class lab2part2 {
	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		List<Integer> intList = new ArrayList<Integer>();
		System.out.println("enter a row of numbers : ");
		int mm=0;
		while(true) {
			mm=scan.nextInt();
			if(mm==0) {
				break;
			}
			intList.add(mm);
		}
		int hold=0, glub=0;
		for (int jimmy: intList) {
			if(hold<jimmy) {
				hold=jimmy;
				glub=1;
			}
			else if(hold==jimmy) {
				glub++;
			}
		}
		System.out.println("the largest number is : " + String.valueOf(hold));
		System.out.println("the number " + String.valueOf(hold) + " occurs "+String.valueOf(glub)+" times");

		
		
		
		/*	Scanner keyboard = new Scanner(System.in); i'm bad at coding
		String buildmeBaby = "";

		List<Integer> intList = new ArrayList<Integer>();

		System.out.println("enter a row of numbers : ");
		StringBuffer blub = new StringBuffer(keyboard.nextLine());
		for (int i = 0; i < blub.length(); i++) {
			char j = blub.charAt(i);
			if (j == ' ') {
				System.out.println(buildmeBaby);
				intList.add(Integer.parseInt(buildmeBaby));
				buildmeBaby = "";
			} else if (j == '0' && buildmeBaby == "") {
				System.out.println(intList.size());
				int hold = 0, flub = 0;

				for (int jimmy : intList) {
					System.out.println(jimmy);
					if (jimmy > hold) {
						hold = jimmy;
						flub = 1;
					} else if (hold == jimmy) {
						flub++;
					}
					System.out.println("the largest number is : " + String.valueOf(hold));
					System.out.println("the number " + String.valueOf(hold) + " occurs "+String.valueOf(flub)+" times");
					System.exit(0);
				}
			} else {
				buildmeBaby += j;
			}

		}*/

	}

}
