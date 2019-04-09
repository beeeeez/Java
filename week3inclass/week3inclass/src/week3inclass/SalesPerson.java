package week3inclass;

public class SalesPerson {

	private String fname;
	private String lname;

	public SalesPerson(String fname, String lname) {
		this.setFname(fname);
		this.setLname(lname);
	}

	public SalesPerson() {

	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public boolean equals(SalesPerson bozo) {
		if (bozo.getFname().equals(this.getFname()) && bozo.getLname().equals(this.getLname())) {
			return true;
		}
		return false;
	}

	static public float calculateCommission(float commissionRate, int salesAmount) {
		return commissionRate * salesAmount;
	}

}
