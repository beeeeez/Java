package lab2;
import java.util.Scanner;
public class lab2part1 {
	public static void main(String[] args) {
	Scanner keyboard = new Scanner(System.in);		
	System.out.println("age in years: ");
	String age = keyboard.nextLine();
	System.out.println("height in inches: ");
	String hgt = keyboard.nextLine();
	System.out.println("weight in lbs: ");
	String wgt = keyboard.nextLine();	
	System.out.println("male or female (m or f): ");
	String sex = keyboard.nextLine();
	System.out.println("activity level (a - d) ");
	String act = keyboard.nextLine();
	double glun=0;
	switch(sex) {
	case "f":
		sex="female";
		glun = 655 + (4.3 * Double.parseDouble(wgt)) + (4.7*Double.parseDouble(hgt)) - (4.7*Double.parseDouble(age));
		break;
	case "m":
		sex="male";
		glun = 66 + (6.3 * Double.parseDouble(wgt)) + (12.9*Double.parseDouble(hgt)) - (6.8*Double.parseDouble(age));
		break;
	default: 
		System.out.println("try gender again");
		System.exit(0);
	}	
	switch(act) {
	case "a":
		glun=glun*1.2;
		break;
	case "b":
		glun=glun*1.3;
		break;
	case "c":
		glun=glun*1.4;
		break;
	case "d":
		glun=glun*1.5;
		break;
	default:
		System.out.println("dun goof'd the activity level");
		System.exit(0);
	}
	glun = glun/230;
	String jimmy = String.format("%2.2f", glun);
	System.out.println("a "+ sex + " of those measurements should eat "+ jimmy +" candy bars per day to maintain the same weight.");
	
	}
	
	
}
