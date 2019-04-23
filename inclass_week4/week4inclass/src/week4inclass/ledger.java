package week4inclass;

public class ledger {

	double[] sales = new double[0];
	int salesMade=0,maxSales=1;
	String err="";
	
	public ledger(int newMax) {
		try {
		maxSales = newMax;	
		double[] jimmy = new double[newMax];
		sales = jimmy;
		}
		catch(Exception ex) {
			throw ex;
		}
	}
	
	public ledger() {
		maxSales = 5;
		double[] jimmy = new double[5];
		sales = jimmy;
	}
	
	public void addSale(double d) {
		try {
		sales[salesMade]=d;
		salesMade++;
		}
		catch(Exception ex) {
			throw ex;
		}
	}
	
	public int getNumberOfSales() {
		return salesMade;
	}
	
	public double getTotalSales() {
		try {
		double sum = 0;
		for(double i: sales) {
			sum+=i;			
		}
		return sum;
		}
		catch(Exception ex) {
			throw ex;
		}
	}
	
	public double getAverageSale() {
		try {
		double ave=0, i=0;
		for(double x : sales) {
			if(i>salesMade) {
				break;
			}
			ave+=x;
			i++;
		}
		return ave/i;
		}
		catch(Exception ex) {
			throw ex;
		}
	}
	public int getCountAbove(double target) {
		int x=0;
		for(double i : sales) {
			if(i>target) {
				x++;
			}
		}
		return x;
	}
	
	
	
}
