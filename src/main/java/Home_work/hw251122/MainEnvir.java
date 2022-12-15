package Home_work.hw251122;

public class MainEnvir {
    public static void main(String[] args) {
        //В Main создать три экземпляра environement, qa, prod, dev.
        //По очереди вызвать метод деплой несколько раз.
        //Попытку деплоя PROD обернуть в try-catch и в случае неудачи печатать сообщение "Domeone tried to deploy Prod"


        Environment qa = new Environment(0,0,"https://qa.qa", Environment.QA,"1");

        try{
           qa.deploy("2");
        }catch (NotOwnerException e){
            throw new RuntimeException(e);
        }

        Environment dev = new Environment(0,0,"https://dev.dev", Environment.DEV,//"DEV",
                "1");

        try{
            dev.deploy("3");
        }catch (NotOwnerException e){
            throw new RuntimeException(e);
        }

        Environment prod = new Environment(0,0,"https://prod.prod", Environment.PROD,
                "1");

        try{
            dev.deploy("4");
        }catch (NotOwnerException e){
            System.out.println("Attempt to deploy PROD. Alarm, security");
            throw new RuntimeException(e);
        }


    }
}
