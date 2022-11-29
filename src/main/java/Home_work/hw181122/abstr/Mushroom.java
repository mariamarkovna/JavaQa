package Home_work.hw181122.abstr;

public class Mushroom extends Ingredient implements Boilable, Fryable,Stewable{


    public Mushroom(int quantity) {
        super(quantity);
    }

    @Override
    public long calculateQuantityFor100Gramm() {
        System.out.println("Require 30g of dry mushroom for every 100gr" );
        return 30;
    }

    @Override
    public void boil() {
        System.out.println("Add mushroom to boiling water, boil until ready");
    }

    @Override
    public void fry() {
        System.out.println("Put clear mushrooms on heated pan with small amount of oil, cook until ready");

    }

    @Override
    public void stew() {
        System.out.println("Put mushrooms on heated pot with small amount of water, stew until ready");

    }



}
