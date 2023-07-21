package ch10;

public class Cartest {
    public static void main(String[] args) {
        Car aiCar = new AiCar();
        aiCar.run();
        System.out.println("=============================");
        Car mCar = new ManualCar();
        mCar.run();
    }
}
