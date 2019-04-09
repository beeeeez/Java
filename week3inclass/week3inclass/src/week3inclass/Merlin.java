package week3inclass;

public class Merlin {
	
	private static Merlin theWizard;
	
	private Merlin() {		
	}
	
	public String consult(){		
		return "Pull the sword from the stone";
	}
	public static Merlin summon() { 
		if (theWizard==null) {
			theWizard = new Merlin();
		}
		return theWizard;
	}

}
