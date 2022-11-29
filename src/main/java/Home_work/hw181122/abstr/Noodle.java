package Home_work.hw181122.abstr;

public class Noodle extends Ingredient implements Boilable, Fryable{
    public Noodle(int quantity) {
        super(quantity);
    }

    // В реализации асбтрактного метода выводить на печать имя ингредиента
    @Override
    public long calculateQuantityFor100Gramm() {
        System.out.println("Require 45g of dry noodles for every 100gr" );
        return 45;
    }

    @Override
    public void boil() {
        System.out.println("Add noodles to boiling water, boil until al dente");
    }

    @Override
    public void fry() {
        System.out.println("Put dry noodles on heated pan with small amount of water, cook until ready");
    }



}
