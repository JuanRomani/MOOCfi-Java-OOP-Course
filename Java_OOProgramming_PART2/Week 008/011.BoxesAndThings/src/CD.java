public class CD implements ToBeStored{

    private String artist;
    private String title;
    private int year;
    private double weight;

    public CD(String artist, String title, int year){
        this.artist = artist;
        this.title = title;
        this.year = year;
        weight = 0.1;
    }

    public double weight(){
        return weight;
    }

    public String getArtist() {
        return artist;
    }

    public String getTitle() {
        return title;
    }

    public int getYear() {
        return year;
    }

    @Override
    public String toString() {
        return getArtist() + ": " + getTitle() + " (" + getYear() + ")";
    }
}
