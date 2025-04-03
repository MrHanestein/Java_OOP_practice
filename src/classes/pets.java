package classes;

public class pets {
    // Always declare classes up here that need to use the 'this' keyword
    private String pet1 = "catto";
    private String pet2 = "Katto";
    private int number;
    private int numbers;

    public void run(int number){
        this.number = 57;
        System.out.println(pet2 + " " + number);
    }
    public void stop(String name){
        String myPet = "New doggo";
        System.out.println(myPet + " " + name + " old pet is " + pet1 );
    }
    public void returnNothing(){
        String nothing = "Nothing Here";
        System.out.println("There is "+ nothing);
    }
    public void runfaster(int number, String name){
        number = 56;
        System.out.println(name + " " + this.number + " " + this.numbers);
    }
    public void runfastest(int numbers) {
        this.numbers = numbers;
        System.out.println(this.number + this.numbers);
    }
}
