package week2inclas;



public class randomplate {

	public static void main(String[] args) {

		for(int i = 0; i<7; i++) {
			if (i < 3) {
			int tums = (int)(Math.random() * 26);
			char b = (char)(tums+'A');
			System.out.print(b);
			}
			else {
				int tums = (int)(Math.random() * 10);
				System.out.print(tums);
			}
		}
		
		
		
	}
	
}