package Home_work.hw251122;

public class Environment  {

//-----------------------------
    private long lastDeployTime;//время развертывания obnovl
    private long upDuration;//продолжительность
    private String currentUri;//текущий Uri adress gde legit  istochnik production
    private final String  type;
    private String currentVersion;
//-----------------------------------------------------------------------
    //Каждая строка является константой в данном  классе.
//    Константой - это значит, что значение принадлежит классу, общедоступно и его нельзя поменять
    public static final String QA= "QA";
    public static final String PROD= "PROD";
    public static final String DEV= "DEV";
//----------------------------------------------------------------------------
    public Environment(long lastDeployTime, long upDuration, String currentUri, String type, String currentVersion) {
        this.lastDeployTime = lastDeployTime;
        this.upDuration = upDuration;
        this.currentUri = currentUri;
        this.type = type;
        this.currentVersion = currentVersion;
    }
    //-----------------------------------
    public long getLastDeployTime() {
        return lastDeployTime;
    }

    public long getUpDuration() {
        return upDuration;
    }

    public String getCurrentUri() {
        return currentUri;
    }

    public String getType() {
        return type;
    }

    public String getCurrentVersion() {
        return currentVersion;
    }

    //  -------------------------------

    public void deploy (String version) throws NotOwnerException {

        if (type.equals("PROD")){
            throw new NotOwnerException();
        }

        currentVersion = version;
        lastDeployTime = System.currentTimeMillis();
        // lastDeployTime = lastDeployTime + upDuration;
        upDuration = 0;
        System.out.println("Новая версия успешно задеплоена + version");
    }
    //-----------------------------------------------------
    //Класс должен содержать статический метод listEnvs(),
    // который возвращает массив строк "QA", "PROD", "DEV".
    // Каждая строка является константой в данном  классе.
//    Константой - это значит, что значение принадлежит классу, общедоступно и его нельзя поменять
    public static String[] listEnvs (){
        return new String []{QA, PROD, DEV};
    }//massiv stroc
    //------------------------------------------------------

}
