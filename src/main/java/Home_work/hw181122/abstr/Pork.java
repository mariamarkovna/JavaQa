package Home_work.hw181122.abstr;

public class Pork extends Ingredient implements Boilable, Fryable,Stewable{


    public Pork(int quantity) {
        super(quantity);
    }

    @Override
    public long calculateQuantityFor100Gramm() {
        System.out.println("Require 80g of pork for every 100gr" );
        return 80 ;
    }

    @Override
    public void boil() {
        System.out.println("Add pork to boiling water, boil until ready");
    }

    @Override
    public void fry() {
        System.out.println("Put pork on heated pan with small amount of oil, cook until ready");
    }

    @Override
    public void stew() {
        System.out.println("Put pork on heated pot with small amount of water, stew until ready");
    }
}
