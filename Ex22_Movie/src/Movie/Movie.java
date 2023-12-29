package Movie;

public class Movie implements Comparable<Movie> {

	private String name;
	private double rating;
	private int year;
	
	public Movie() {
		
	}
	
	public Movie(String name, double rating, int year) {
		super();
		this.name = name;
		this.rating = rating;
		this.year = year;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getRating() {
		return rating;
	}

	public void setRating(double rating) {
		this.rating = rating;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	@Override
	public int compareTo(Movie otherMovie) {
		// TODO Auto-generated method stub
		return Integer.compare(this.year, otherMovie.year);
	}

}
