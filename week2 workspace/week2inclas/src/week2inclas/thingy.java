package week2inclas;

public class thingy {

	public enum stuff {Fingers, Toes, Nose}
	
	
	public static void main(String[] args) {
		for (stuff meh : stuff.values()) {
			System.out.println(meh);
		}
		String jimmy = stuff.Toes.toString();
		String check;
		switch (jimmy) {
		case "Fingers":
				check="Fingers are fklsjf";
				break;
		case "Toes":
				check="Toes do ksjdfksjd";
				break;
		case "Nose":
				check="Nose knows you know nose?";
				break;
		default:
			check="dun goof'd";
			break;
		}
		System.out.println(check);
		
		
		
		
		
	}
	
	
}
