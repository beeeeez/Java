package week2inclas;

public class thingy2 {

	public static void main(String[] args) {
		String s1 = new String("abc");
		String s2 = new String("abc");
		String s3 = "abc", s4 ="abc";
		
		if (s1==s2) {
			System.out.println("jammy");
		}
		if (s3==s4) {
			System.out.println("lammy");
		}
		
		if(s1.contentEquals(s2)) {
			System.out.println("flubby");
		}
	}
	
}
