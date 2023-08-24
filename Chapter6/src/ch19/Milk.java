package ch19;

public class Milk extends Decorator{
    public Milk(Coffee coffee) {
        super(coffee);

    }

    public void brewing(){
        super.brewing();
        System.out.println("Adding Milk");
    }
}
