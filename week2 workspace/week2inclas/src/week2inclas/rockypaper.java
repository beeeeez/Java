
package week2inclas;



import java.util.Scanner;
public class rockypaper {

	public enum stuff {dead, rock, paper, scissors};
	
	public static void main(String[] args) {
	Scanner keyboard = new Scanner(System.in);
	boolean dooped = true;
	double fubb = Math.random()*3+1;
	int tums = (int)fubb;
	System.out.println(tums);
	


	System.out.println("enter rock paper or scissors : ");
	String fudge = keyboard.nextLine();
		
	switch (fudge) {
	case "rock":
		break;
	case "paper":
		break;
	case "scissors":
		break;
	default :
		System.out.println("dun goof'd");
		System.exit(0);
		
	}


	System.out.println("computer picked: "+stuff.values()[tums].toString());
	
	if(stuff.values()[tums].toString().compareTo(fudge)==0) {
		System.out.println("its a tie");
	}
	else{
		switch (stuff.values()[tums].toString()) {
		case "rock":
			if(fudge.compareTo("paper")==0) {
				System.out.println("you win");
			}
			else {
				System.out.println("you lose");
			}
			break;
		case "paper":
			if(fudge.compareTo("scissors")==0) {
				System.out.println("you win");
			}
			else {
				System.out.println("you lose");
			}
			break;		
		case "scissors":
		if(fudge.compareTo("rock")==0) {
			System.out.println("you win");
		}
		else {
			System.out.println("you lose");
		}
		break;
		default:
			System.out.println("wat");
			break;
		}
	}

		System.exit(0);
	
	
	
	
	}
}