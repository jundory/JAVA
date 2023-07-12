package ch14TEST;

public class Student {
    String name;
    int money;

    public Student(String name, int money) {
        this.name = name;
        this.money = money;
    }

    public void takeTaxi(Taxi taxi){
        taxi.take();
        this.money -= 3000;
    }

    public void showInfo(){
        System.out.println(name + "학생의 남은 돈은 "+money+"원 입니다.");
    }
}
