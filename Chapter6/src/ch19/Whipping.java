package ch19;

public class Whipping extends Decorator{
    public Whipping(Coffee coffee) {
        super(coffee);
    }

    public void brewing(){
        super.brewing();
        System.out.println("Adding Wipping Cream");
    }
}
