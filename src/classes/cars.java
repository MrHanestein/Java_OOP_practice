package classes;

import java.util.*;

public class cars {
    private String brand = "Bugatti";
    private String color = "Red";
    private double speed = 15.6;

    public void drive(){
        this.brand=brand;
        this.color=color;
        this.speed=speed;
        System.out.println(this.brand + " color is  " + this.color + " and speed is " + this.speed);
    }
    public int speed(int speed){
        return speed;
    }
}
