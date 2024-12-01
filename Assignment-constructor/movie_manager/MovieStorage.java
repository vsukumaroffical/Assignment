
import java.util.*;

public class MovieStorage{

	private static MovieStorage instance ;
	private static Map<Integer,Movie> movies = new HashMap<>();
	
	private MovieStorage(){
		
	}
	public static MovieStorage getInstance(){
		if(instance == null){
			instance = new MovieStorage();
		}
		return instance;
	}
	public void insertMovie(Movie newMovie){
		movies.put(newMovie.getId(),newMovie);
	}
	
	public List<Movie> getMovieList() {
		return new ArrayList<>(movies.values());
	}
	

}