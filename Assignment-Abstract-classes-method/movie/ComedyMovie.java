class ComedyMovie extends Movie {
    private int duration;
    
    public ComedyMovie(String title, String genre, int duration) {
        super(title, genre);
        this.duration = duration;
    }
    
    @Override
    public void displayDetails() {
        System.out.println("Comedy Movie: " + getTitle() + " | Genre: " + getGenre());
    }
    
    @Override
    public int calculateDuration() {
        return duration;
    }
}
