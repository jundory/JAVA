package ch19;

public class CoffeeTest {
    public static void main(String[] args) {

        Coffee etiopiaCoffee = new EtiopiaAmericano();
        etiopiaCoffee.brewing();

        System.out.println();
        Coffee etiopiaLatte = new Milk(etiopiaCoffee);
        etiopiaLatte.brewing();
        System.out.println();

        Coffee mochaEtiopia = new Mocha(new Milk(new EtiopiaAmericano()));
        mochaEtiopia.brewing();

        System.out.println();
        Coffee kenyaCoffee = new Whipping(new Mocha(new Milk(new KenyaAnericao())));
        kenyaCoffee.brewing();
    }
}
