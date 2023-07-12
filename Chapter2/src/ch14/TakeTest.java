package ch14;

public class TakeTest {
    public static void main(String[] args) {
        Student studentLee = new Student("junsoo", 5000);
        Student studentChoi = new Student("jiyoun", 10000);
        Bus bus100 = new Bus(100);
        Bus bus500 = new Bus(500);
        studentLee.takeBus( bus100);

        Subway greenSubway = new Subway(2);
        studentChoi.takeSubway(greenSubway);

        studentLee.showInfo();
        studentChoi.showInfo();

        bus100.showInfo();
        greenSubway.showInfo();

        bus500.showInfo();
    }
}
