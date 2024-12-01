
public class Movie {
    private int id;
    private String title;
    private String genre;
    private String director;
    private String actor;     
    private int releaseYear;
    private double rating;
    private String language;
    private static int movieCount = 0;

    
    public Movie(int id, String title, String genre, String director, String actor, int releaseYear, double rating, boolean isStarred, String language) {
        this.id = id;
        this.title = title;
        this.genre = genre;
        this.director = director;
        this.actor = actor;
        this.releaseYear = releaseYear;
        this.rating = rating;
        this.language = language;
        movieCount++;
    }
	 public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getActor() {
        return actor;
    }

    public void setActor(String actor) {
        this.actor = actor;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public static int getMovieCount() {
        return movieCount;
    }

    public void displayMovieDetails() {
	System.out.println("----------------------------------");
    System.out.println("id          = " + id);
	System.out.println("title       = " + title);
	System.out.println("genre       = " + genre);
	System.out.println("director    = " + director);
	System.out.println("actor       = " + actor );
	System.out.println("releaseYear = " + releaseYear);
	System.out.println("rating      = " + rating);
	System.out.println("language    = " + language);
	System.out.println("----------------------------------");
	
    }

}
