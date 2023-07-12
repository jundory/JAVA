package ch14TEST;

public class Taxi {
    String name;
    int addMoney;

    public Taxi (String name){
        this.name = name;
    }

    public void take(){
        this.addMoney += 3000;
    }

    public void showInfo(){
        System.out.println(name + "의 수입은 "+addMoney+"원 입니다.");
    }
}
