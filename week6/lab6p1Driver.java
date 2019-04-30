
public class lab6p1Driver {

	public static void main(String[] args) {
		
		regPay r = new regPay(7.5);
		hazPay h = new hazPay(7.5);
		
		System.out.println(r.getPay(40));
		System.out.println(h.getPay(40));
		
		r.changeRate(17);
		h.changeRate(17);
		
		System.out.println(r.getPay(40));
		System.out.println(h.getPay(40));
	}
	
}
