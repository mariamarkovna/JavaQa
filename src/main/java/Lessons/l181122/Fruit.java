package Lessons.l181122;

import java.util.Arrays;

public class Fruit {
    public double sugar;
    public String[] vitamins;

    private String secretDescription="Secret";// privet ne nasleduetsa

    //-------Konstructor--------

    public Fruit() {}

    public Fruit(double sugar, String[] vitamins) {
        this.sugar = sugar;
        this.vitamins = vitamins;

    }
    public String getStringRepresentation() {
        return "Sugar " +sugar +" " +"vitamins: "+ Arrays.toString(vitamins);
    }

//------------GETter-----------------

    private String getSecretDescription() {
        return secretDescription;
    }
}
