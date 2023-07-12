package ch14TEST;

public class TakeTest {
    public static void main(String[] args) {
        Student studentJun = new Student("junsoo", 10000);
        Taxi taxi1 = new Taxi("대한운수");

        studentJun.takeTaxi(taxi1);

        studentJun.showInfo();
        taxi1.showInfo();
    }

    //실패했던 이유1. 초기화 메서드에 void를 넣음.
    //실패했던 이유2. student 클래스의 takeTaxi()에 매개변수로 참조자료형을 안 줌.
    //실패했던 이유2-1. student 클래스의 takeTaxi()를 누가 언제 쓰는지 파악x.
    //실패했던 이유3. taxi1 인스턴스를 만들고 매개변수로 이름을 주는 걸 생각치 못함.
    //실패했던 이유3-1. taxi1 인스턴스를 만들고 매개변수에 돈을 줘버림.(알고리즘 잘못 짬)
}
