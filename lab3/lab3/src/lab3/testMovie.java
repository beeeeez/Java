package lab3;
import lab3.Movie;

enum Rating
{
	G, PG, PG13, R, X
}


public class testMovie {
	public static void main(String[] args) {
		Movie movie1 = new Movie("Flappy Jacks", Rating.PG13.toString());
		Movie movie2 = new Movie("Gnarly Nuns", Rating.R.toString());
		
		movie1.addRating(3);
		movie1.addRating(5);
		movie1.addRating(2);
		movie1.addRating(5);
		movie1.addRating(5);
		movie1.addRating(5);
		movie1.addRating(4);
		movie1.addRating(3);
		movie1.addRating(5);
		movie1.addRating(3);
		movie1.addRating(2);
		movie1.addRating(5);
		movie1.addRating(1);
		
		movie2.addRating(1);
		movie2.addRating(1);
		movie2.addRating(1);
		movie2.addRating(2);
		movie2.addRating(2);
		movie2.addRating(2);
		movie2.addRating(1);
		movie2.addRating(3);
		movie2.addRating(2);
		
		String jimmy = String.format("%2.2f", movie1.getAverage());
		String jammy = String.format("%2.2f", movie2.getAverage());
		System.out.println(movie1.getMovieName() + " " + movie1.getMpaa() + " " + jimmy);
		System.out.println(movie2.getMovieName() + " " + movie2.getMpaa() + " " + jammy);
		
	}
}
