package lab2;
import java.util.Scanner;
public class lab2part1 {
	public static void main(String[] args) {
	Scanner keyboard = new Scanner(System.in);		
	System.out.println("weight in lbs: ");
	String wgt = keyboard.nextLine();
	System.out.println("height in inches: ");
	String hgt = keyboard.nextLine();
	System.out.println("age in years: ");
	String age = keyboard.nextLine();
	System.out.println("male or female (m or f): ");
	String sex = keyboard.nextLine();
	System.out.println("activity level (1 - 4) ");
	String act = keyboard.nextLine();
	double glun=0;
	switch(sex) {
	case "m":
		sex="male";
		glun = 655 + ((4.3 * Double.parseDouble(wgt)) + (4.7*Double.parseDouble(hgt))) - (4.7*Double.parseDouble(age));
		
		break;
	case "f":
		sex="female";
		glun = 66 + ((6.3 * Double.parseDouble(wgt)) + (12.9*Double.parseDouble(hgt))) - (6.8*Double.parseDouble(age));
		break;
	default: 
		System.out.println("try gender again");
	}
	

	switch(Integer.parseInt(act)) {
	case 1:
		glun=glun*1.2;
		break;
	case 2:
		glun=glun*1.3;
		break;
	case 3:
		glun=glun*1.4;
		break;
	case 4:
		glun=glun*1.5;
		break;
	default:
		System.out.println("dun goof'd the activity level");
		System.exit(0);
	}
	System.out.println("a "+ sex + " of those measurements should eat "+ glun +" candy bars per day to maintain the same weight.");
	
	}
	
	
}
