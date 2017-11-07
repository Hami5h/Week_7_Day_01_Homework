package example.codeclan.com.interfacesegregation;

/**
 * Created by user on 27/06/2017.
 */

public class Honey implements Edible{


    public static Honey harvestHoney(){
        return new Honey();
    }

}
