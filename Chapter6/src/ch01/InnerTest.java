package src.ch01;


class OutClass{

    private int num = 10;
    private static int sNum = 20;
    private InClass inClass; //inClass를 선언해놓음

    public OutClass(){ //outClass가 생성될 때 inClass를 생성함
        inClass = new InClass();
    }

    class InClass{
        int iNum = 100;

        static int sInNum = 500;
        void inTest(){
            System.out.println("OutClass num =" +num+ ": 외부 클래스의 인스턴스 변수");
            System.out.println("OutClass sNum =" +sNum+ ": 외부 클래스의 스태틱 변수");
            System.out.println("OutClass iNum =" +iNum+ ": 내부 클래스의 인스턴스 변수");
        }
    }

    public void usingClass(){
        inClass.inTest(); //안에서 inClass 메소드를 사용한 경우
    }
    static class InStaticClass{
        int iNum = 100;
        static int sInNum = 200;

            void inTest(){
                System.out.println("OutClass num =" +iNum+ ": 내부 클래스의 인스턴스 변수");
                System.out.println("OutClass sNum =" +sNum+ ": 외부 클래스의 스태틱 변수");
                System.out.println("OutClass sInNum =" +sInNum+ ": 내부 클래스의 스태틱 변수");
            }
            static void sTest(){
                System.out.println("OutClass sNum =" +sNum+ ": 외부 클래스의 스태틱 변수");
                System.out.println("OutClass sInNum =" +sInNum+ ": 내부 클래스의 스태틱 변수");
        }
    }
}
public class InnerTest {
    public static void main(String[] args) {

//        OutClass outClass = new OutClass();
//        outClass.usingClass();
//
//        System.out.println();
//
//        OutClass.InClass inner = outClass.new InClass();
//        inner.inTest();

        OutClass.InStaticClass sInClass = new OutClass.InStaticClass(); //두줄 위의 outClass.new InClass(); 와 달리 스태틱이라 new로 바로 생성 가능.
        sInClass.inTest();

        System.out.println();

        OutClass.InStaticClass.sTest(); // 스태틱 메서드기 때문에 new로 인스턴스를 생성하지 않아도 바로 호출 가능.
    }
}
