package week4inclass;
import java.util.*;

public class inclass_arrays {


	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] numArr = new int[5];
		int ff=0, x=0;
		for(int i = 0; i < 5; i++) {
			System.out.println("enter a number : ");
			ff = scan.nextInt();
			if(checkArr(ff,numArr) == true) {
				numArr[x]=ff;
				x++;
			}
			
			
		}
		/*
		while(x<=4) {
		ff=scan.nextInt();

		if (checkArr(ff, numArr) == true) {
			numArr[y]=ff;
			y++;
		}
		x++;
		}
		*/
		System.out.println("you had " + x + " distinct numbers");

		 for(int i: numArr) {
			 if(i!=0) {
			 System.out.println(i);
			 }
		 }
		
		
			
			
		
	}
	
	public static boolean checkArr(int num, int[] jammy) {
	 boolean jimmy = true;
	 for(int i: jammy) {
		 if(num==i) {
			 jimmy = false;
		 }
	 }
	return jimmy;	
	}
	
}
