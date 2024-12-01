package com.movie_manager.main;

import com.movie_manager.dto.Movie;
import com.movie_manager.storage.MovieStorage;
import java.util.*;

public class Main {

	public void loadDefaultMovie(){
	    Movie movie1 = new Movie(1, "Mankatha", "Action", "Venkat Prabhu", "Ajith Kumar", 2011, 8.0, true, "Tamil");
        Movie movie2 = new Movie(2, "Vedalam", "Action", "Siva", "Ajith Kumar", 2015, 7.5, true, "Tamil");
        Movie movie3 = new Movie(3, "Viswasam", "Drama", "Siva", "Ajith Kumar", 2019, 7.8, true, "Tamil");
        Movie movie4 = new Movie(4, "Yennai Arindhaal", "Thriller", "Gautham Menon", "Ajith Kumar", 2015, 7.9, true, "Tamil");
        Movie movie5 = new Movie(5, "Valimai", "Action", "H. Vinoth", "Ajith Kumar", 2022, 8.1, true, "Tamil");

       MovieStorage.getInstance().insertMovie(movie1);
	   MovieStorage.getInstance().insertMovie(movie2);
	   MovieStorage.getInstance().insertMovie(movie3);
	   MovieStorage.getInstance().insertMovie(movie4);
	   MovieStorage.getInstance().insertMovie(movie5);
	}
	public static void main(String args[]){
		new Main().loadDefaultMovie();
		List<Movie> employees = MovieStorage.getInstance().getMovieList(); 
		for(Movie movie : employees) {
				movie.displayMovieDetails();
		}
	}

}