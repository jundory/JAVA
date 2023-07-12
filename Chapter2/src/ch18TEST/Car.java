package ch18TEST;

public class Car {
    private static int serialNum = 10000;
    private int carNum;

    public Car(){
        this.serialNum++;
        this.carNum = this.serialNum;
    }

    public int getCarNum() {
        return carNum;
    }

    public void setCarNum(int carNum) {
        this.carNum = carNum;
    }
}
