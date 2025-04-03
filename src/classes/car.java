package classes;
import classes.pets;


// Little car class inherits and extends
public class car extends pets {
    // use override to extended class
    @Override
    public void stop(String name) {
        super.stop(name);
    }

    public static void main(String[] args) {
        car cars = new car();
        cars.stop("HI");
    }
}
