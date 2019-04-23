import java.util.*;

public class lab5_stadium {
	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	LinkedList<String> stadiumName = new LinkedList<String>();
	LinkedList<Double> gameRevenue = new LinkedList<Double>();
	int sum=0;
	String tempName = "";
	double tempRev = 0;
	while(!tempName.equals("done")) {
		scan.nextLine();
	System.out.println("stadium name :");
	tempName=scan.nextLine();
	System.out.println("revenue: ");
	tempRev=scan.nextDouble();
	stadiumName.add(tempName);
	gameRevenue.add(tempRev);	
	}
	System.out.println("ented a stadium name to get its revenue :");
	tempName = scan.nextLine();

		for(String name: stadiumName) {
			if (name.equals(tempName)){
				sum += gameRevenue.indexOf(name);
			}
		}
		System.out.println("total for "+stadiumName+" is "+ sum);
	
	
	
	}
	
}
