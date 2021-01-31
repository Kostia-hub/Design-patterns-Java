package Singlton;

public class Singlton{
    private static Singlton instance = null;

    private Singlton(){
    }

    public static Singlton GetInstance(){
        if(instance == null)
            instance = new Singlton();
        return instance;
    }
}