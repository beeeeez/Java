
public class actorDriver {
	public static void main(String[] args) {
	Actor1 act1 = new Actor1();
	Actor2 act2 = new Actor2();
	
	act1.act();
	act2.act();
	
	
	}
	
	private static void tryout(Actor act) {act.act();}
}
