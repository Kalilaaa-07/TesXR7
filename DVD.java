package Persewaan;

public class DVD extends Product {
    protected int leght;
    protected String rating;
    protected String Studio;

    public int getLeght() {
        return this.leght;
    }

    public void setLeght(int leght) {
        this.leght = leght;
    }

    public String getRating() {
        return this.rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public String getStudio() {
        return this.Studio;
    }

    public void setStudio(String Studio) {
        this.Studio = Studio;
    }

    public DVD () {
        number = 11;
        name = "aku cinta kamu";
        quantity = 0;
        price = 0.0;
        leght = 2;
        rating = "all age";
        Studio = "bandung";
 

    }
    public void print () {
        System.out.println("Number: " + number);
        System.out.println("Name: "+ name);
        System.out.println("Quantity: " + quantity);
        System.out.println("Prince: "+ price);
        System.out.println("Leght: "+ leght);
        System.out.println("Rating: "+ rating);
        System.out.println("Studio: "+ Studio);
    }
    }
