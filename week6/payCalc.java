
public abstract class payCalc {
	public double payRate;
	
	public double getPay(double hours) {
		return hours*payRate;
	}
	
	public void changeRate(double rate) {
		payRate =rate;
	}
}
