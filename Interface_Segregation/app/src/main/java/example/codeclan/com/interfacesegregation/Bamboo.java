package example.codeclan.com.interfacesegregation;

/**
 * Created by user on 27/06/2017.
 */

public class Bamboo implements Edible{


    public static Bamboo harvestBamboo(){
        return new Bamboo();
    }

}
