package Home_work.hw101122;

public class PersonMain {

    public static void main(String[] args) {


        Person boris = new Person();
        boris.setFullName("Boris");
        boris.setAge(30);
        boris.move();
        boris.talk();

        Person anna=new Person("Anna",27 );
        anna.move();
        anna.talk();


    }
}
