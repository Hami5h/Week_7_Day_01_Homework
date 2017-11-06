package example.codeclan.com.interfacesegregation;

/**
 * Created by hamishstewart on 06/11/2017.
 */

public class Tree implements Climable {
    @Override
    public void climb(Climable object) {

    }

    public String climbTree(){
        return "I can climb this tree, you can't hide from me!";
    }
}
