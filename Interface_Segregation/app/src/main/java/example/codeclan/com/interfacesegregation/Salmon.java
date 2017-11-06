package example.codeclan.com.interfacesegregation;

/**
 * Created by user on 27/06/2017.
 */

public class Salmon implements Edible{

    @Override
    public void eat(Edible food) {

    }

    public static Salmon riverFish(){
        return new Salmon();
    }

}
