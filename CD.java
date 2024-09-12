package Persewaan;

public class CD extends Product {
    public static void main(String[] args) {
        
    }
    
    private String artist;
    private int TotalSong;
    private String label;

    public String getArtist() {
        return this.artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public int getTotalSong() {
        return this.TotalSong;
    }

    public void setTotalSong(int TotalSong) {
        this.TotalSong = TotalSong;
    }

    public String getLabel() {
        return this.label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public CD () {
        number = 10;
        name = "Selamat Siang";
        quantity = 0;
        price = 0.0;
        artist = "Salman";
        TotalSong = 8;
        label = "Sony music";

    }
    public void print(){
        System.out.println("Number: " + number);
        System.out.println("Name: "+ name);
        System.out.println("Quantity: " + quantity);
        System.out.println("Prince: "+ price);
        System.out.println("Artist: "+ artist);
        System.out.println("Total Song: "+ TotalSong);
        System.out.println("Label: "+ label);
    }
    }
