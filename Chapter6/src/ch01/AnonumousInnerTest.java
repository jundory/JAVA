package ch01;


class Outer2{

    int outNum = 100;
    static int sNum = 200;
    Runnable getRunnable( int i){

        int num = 10;     //메서드 호출 이후에도 사용해야 할 경우가 있으므로 지역 내부 클래스에서 사요ㅗㅇ하는 메서드의 지역변수나 매개 변수는 final로 선언
        return new Runnable(){

            int localNum = 1000;
            @Override
            public void run() {

                System.out.println("i = " + i);
                System.out.println("num = " + num);
                System.out.println("localNum = " + localNum);

                System.out.println("outNum = " + outNum + " : 외부 클래스 인스턴스 변수");
                System.out.println("Outter.sNum = " + Outer2.sNum + " : 외부 클래스 정적 변수");

            }
        };
    }
    Runnable runnable = new Runnable() {
        @Override
        public void run() {
            System.out.println("Runnable class");
        }
    };
}
public class AnonumousInnerTest {
    public static void main(String[] args) {
        Outer2 out = new Outer2();
        Runnable runner = out.getRunnable(100);

        runner.run();

        out.runnable.run();
    }
}
