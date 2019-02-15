package com.cpgm.movies;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class MovieDetailsList {
	
	ArrayList<MovieDetails> movieList = new ArrayList<>();
	
	public void addMovie(MovieDetails movies)
	{
		movieList.add(movies);
	} 
	
	public ArrayList<MovieDetails> getAllMovies()
	{
		return movieList;
		
	}
	
	public ArrayList <MovieDetails> sortMovies(String movieType)
	{
		if(movieType.contentEquals("movieName"))
		{
			Collections.sort(movieList, new Comparator<MovieDetails>()
			{

				@Override
				public int compare(MovieDetails m1, MovieDetails m2) {
					// TODO Auto-generated method stub
					 return m1.getMovieName().compareTo(m2.getMovieName());;
				}
				
			});
		}
		else if (movieType.contentEquals("movieName"))
		{
			if(movieType.contentEquals("movieName"))
			{
				Collections.sort(movieList, new Comparator<MovieDetails>()
				{

					public int compare(MovieDetails m1, MovieDetails m2) {
						// TODO Auto-generated method stub
						 return m1.getMovieName().compareTo(m2.getMovieName());;
					}
					
				});
		}
		
		return movieList;
		return movieList;
		
	}
	public void removeMovie()
	{
		    
		movieList.remove(movieList);   
	}
	
	public void removeAllMovies()
	{
		
	}
	
	public void find_Movie_By_MovieName()
	{
		
	}
	public void find_movie_By_Genre() 
	{
		
	}
	
}
