/* Create hierarchy from Movie class with Child classes of different genre movies like RomComMovie,
  ThrillerMovie, etc. Demonstrate polymorphism using them. */

class Movie {
    private String title;

    public Movie(String title) {
        this.title = title;
    }

    public void play() {
        System.out.println("Playing movie: " + title);
    }

    public String getDescription() {
        return "General movie description for " + title;
    }
}


class RomComMovie extends Movie {
    public RomComMovie(String title) {
        super(title);
    }

    @Override
    public void play() {
        System.out.println("Playing romantic comedy: " + getDescription());
    }

    @Override
    public String getDescription() {
        return "A light-hearted romantic comedy film.";
    }
}

class ThrillerMovie extends Movie {
    public ThrillerMovie(String title) {
        super(title);
    }

    @Override
    public void play() {
        System.out.println("Playing thriller: " + getDescription());
    }

    @Override
    public String getDescription() {
        return "A suspenseful thriller film that keeps you on the edge.";
    }
}


class ActionMovie extends Movie {
    public ActionMovie(String title) {
        super(title);
    }

    @Override
    public void play() {
        System.out.println("Playing action movie: " + getDescription());
    }

    @Override
    public String getDescription() {
        return "An action-packed movie with thrilling sequences.";
    }
}

public class Main_03 {
    public static void main(String[] args) {
        Movie romCom = new RomComMovie("Roja");
        Movie thriller = new ThrillerMovie("Ratchasan");
        Movie action = new ActionMovie("Mankatha");

      
        playMovie(romCom);
        playMovie(thriller);
        playMovie(action);
    }

    public static void playMovie(Movie movie) {
        movie.play();
    }
}
