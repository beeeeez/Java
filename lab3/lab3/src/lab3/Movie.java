package lab3;

public class Movie {

	private String movieName, mpaa;
	private double terrible=0, bad=0, ok=0, good=0, great=0;
	
	public Movie(String movie, String rating) {
		setMovieName(movie);
		setMpaa(rating);
	}
	public String getMovieName() {
		return movieName;
	}
	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}
	public String getMpaa() {
		return mpaa;
	}
	public void setMpaa(String mpaa) {
		this.mpaa = mpaa;
	}
	
	
	public void addRating(int i) {
		switch(i) {
		case 1:
			this.terrible++;
			break;
		case 2:
			this.bad++;
			break;
		case 3:
			this.ok++;
			break;
		case 4:
			this.good++;
			break;
		case 5:
			this.great++;
			break;
		default:
			break;
		}
		
	}
	
	public double getAverage() {
		double total=0, num=0, bub=great, flub=good, mub=ok, jub=bad, pug=terrible;
		while(bub>0) {
			total+=5;
			num++;
			bub--;
		}
		while(flub>0) {
			total+=4;
			num++;
			flub--;
		}
		while(mub>0) {
			total+=3;
			num++;
			mub--;
		}
		while(jub>0) {
			total+=2;
			num++;
			jub--;
			
		}
		while(pug>0) {
			total+=1;
			num++;
			pug--;
		}
		return total/num;	
		
	}
	
	
}
