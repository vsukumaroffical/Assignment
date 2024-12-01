public class Main {
    public static void main(String[] args) {
	
        Movie actionMovie = new ActionMovie("Billa", "Action", 128);
        Movie comedyMovie = new ComedyMovie("Comali", "Comedy", 140);

        actionMovie.displayDetails();
        System.out.println("Duration: " + actionMovie.calculateDuration() + " minutes");

        comedyMovie.displayDetails();
        System.out.println("Duration: " + comedyMovie.calculateDuration() + " minutes");
    }
}
