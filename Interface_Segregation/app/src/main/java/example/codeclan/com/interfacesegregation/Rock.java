package example.codeclan.com.interfacesegregation;

/**
 * Created by hamishstewart on 06/11/2017.
 */

public class Rock implements Climable {
    @Override
    public void climb(Climable object) {

    }

    public String climbRock(){
        return "I'm on a rock, not much to do up here, nice spot for a sleep maybe.";
    }

}
