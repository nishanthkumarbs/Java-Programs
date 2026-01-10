class movie 
{
	String movieName;
	String hero;
	String heroine;
	public void displayMovieInfo()
	{
		System.out.println("MovieName="+this.movieName+" Hero="+this.hero+" Heroine="+this.heroine);
	}
	public movie(String movieName,String hero,String heroine)
	{
		this.movieName = movieName;
		this.hero=hero;
		this.heroine=heroine;
	}
	public static void main(String[] args) 
	{
		movie m1 = new movie("katera","Dboss","Aradana");
		movie m2 = new movie("kgf","yash","thamanna");
		movie m3 = new movie("upendra","uppi","raveena");
		m1.displayMovieInfo();
		m2.displayMovieInfo();
		m3.displayMovieInfo();
		
	}
}
