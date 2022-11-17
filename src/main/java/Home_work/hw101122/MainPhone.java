package Home_work.hw101122;

public class MainPhone {
    public static void main(String[] args) {
        Phone iphone = new Phone(112222333,"iphone", 120);
        Phone sumsung = new Phone(23333332,"sumsung", 200);
        Phone nokia = new Phone(125555553,"nokia", 220);

        iphone.printData();
        sumsung.printData();
        nokia.printData();



        iphone.receiveCall("Marina");
        sumsung.receiveCall("Valera");
        nokia.receiveCall("Julia");



    }
}
