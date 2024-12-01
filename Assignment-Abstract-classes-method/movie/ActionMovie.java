class ActionMovie extends Movie {
    private int duration; 
    
    public ActionMovie(String title, String genre, int duration) {
        super(title, genre);
        this.duration = duration;
    }
    
    @Override
    public void displayDetails() {
        System.out.println("Action Movie: " + getTitle() + " | Genre: " + getGenre());
    }
    
    @Override
    public int calculateDuration() {
        return duration;  
    }
}
