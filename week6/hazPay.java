
public class hazPay extends payCalc {
	public hazPay(double rate) {
		this.changeRate(rate);
	}
	public double getPay(double hours) {
		return hours*payRate*1.5;
	}
}
