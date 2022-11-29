package Home_work.hw101122;

public class Person {
    private String fullName;
    private int age;


    //--------Konstuktor----------

    public void move(){
        System.out.println(fullName+" move");
    }

    public void talk(){
        System.out.println(fullName+" talk");
    }

    public Person() {
    }

    public Person(String fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }


    //--------SETter---------------

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
