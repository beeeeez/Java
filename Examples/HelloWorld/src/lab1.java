import java.util.Scanner;

public class lab1 {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		Double x1, x2, y1, y2,ugh,bum,ans;

				
		System.out.println("x1 and y1: ");
		x1 = keyboard.nextDouble();
		y1 = keyboard.nextDouble();
		System.out.println("x2 and y2: ");
		x2 = keyboard.nextDouble();
		y2 = keyboard.nextDouble();
		ugh=Math.pow(x2-x1, 2);
		bum=Math.pow(y2-y1, 2);
		System.out.println("the distance: "+Math.sqrt(ugh+bum));
		
		
		
	}
	
}
