package ch18TEST;

public class Factory {
    private static Factory instance = new Factory();

    private Factory(){};

    public static Factory getInstance(){
        if(instance == null){
            instance = new Factory();
        }
        return instance;
    }
    public Car createCar(){
        Car car = new Car();
        return car;
    }
}
