import java.util.Scanner;

public class lab1_2 {
	public static void main(String[] args) {
	Scanner keyboard = new Scanner(System.in);
	System.out.println("enter some word text:");	
	StringBuffer jammy=new StringBuffer(keyboard.nextLine());
	int flan = jammy.indexOf(" ");
	jammy.append(" "+jammy.substring(0, flan));
	jammy.delete(0, flan+1);
	jammy.replace(0, 1, jammy.substring(0,1).toUpperCase());
	;
	System.out.println("here is stuff : " + jammy);
	}
	
	
}
