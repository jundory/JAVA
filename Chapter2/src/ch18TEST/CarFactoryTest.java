package ch18TEST;

public class CarFactoryTest {
    public static void main(String[] args) {
        Factory factory = Factory.getInstance();
        Car mySonata = factory.createCar();
        Car yourSonata = factory.createCar();

        System.out.println(mySonata.getCarNum());
        System.out.println(yourSonata.getCarNum());
    }

}
