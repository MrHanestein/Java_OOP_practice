import classes.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //Call the Class name, var name, new instance, constructor
    pets name = new pets();
    // Call the extended classes first.
    pets name2 = new car();
    cars carSpecs = new cars();
    // Use new instance name.
    name.run(2);
    // instance takes a string
    name.stop("Cat");
    //call parameterless class
        name.returnNothing();
        name.runfastest(10);
        name.runfaster(21, "david");
        name.stop("HII");
        name2.stop("HI");
        carSpecs.drive();
        System.out.println(carSpecs.speed(21));
    }
}