package Home_work.hw101122;

public class Phone {

    private int number;
    private String model;
    private float weight;

    public Phone(int number, String model, float weight) {
        this.number = number;
        this.model = model;
        this.weight = weight;
    }

    public int getNumber() {
        return number;
    }

    public String getModel() {
        return model;
    }

    public float getWeight() {
        return weight;
    }

    public void receiveCall(String name){
       name=name;
        System.out.println("Call "+name);
    }

    public void printData(){
        System.out.println("number: "+ getNumber()+"; "+ " model: "+ getModel()+"; "+"weight:"+" "+ getWeight()+" gr;");
    }
}
