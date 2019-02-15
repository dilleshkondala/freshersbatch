package com.cpgm.movies;

public class RunnerMovie {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MovieDetailsList movieDetails = new MovieDetailsList();
		
		MovieDetails movie1 = new MovieDetails("Temper","TARAK","Kajal","Mass");
		MovieDetails movie2 = new MovieDetails("KGF","Yash","Pooja","Mass");
		MovieDetails movie3 = new MovieDetails("NaaPeruSurya","Arjun","Renuka","Entertainment");
		
		movieDetails.addMovie(movie1);
		movieDetails.addMovie(movie2);
		movieDetails.addMovie(movie3);
		
		for (MovieDetails md : movieDetails.getAllMovies()) {
			System.out.println(md);
		}
	}

}
