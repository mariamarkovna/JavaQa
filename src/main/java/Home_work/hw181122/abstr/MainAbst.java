package Home_work.hw181122.abstr;

public class MainAbst {
    public static void main(String[] args) {
        Noodle ingNudel = new Noodle(100);
        long sum = ingNudel.calculateQuantityFor100Gramm();
        ingNudel.boil();
        ingNudel.fry();

        System.out.println(" ");

        Mushroom ingMushroom= new Mushroom(100);
        long sum1 = ingMushroom.calculateQuantityFor100Gramm();
        ingMushroom.boil();
        ingMushroom.fry();
        ingMushroom.stew();

        System.out.println(" ");


        Pork ingPork= new Pork(100);
        long sum2 = ingPork.calculateQuantityFor100Gramm();
        ingPork.boil();
        ingPork.fry();
        ingPork.stew();

    }

}
