package ch16.gamelevel;

public class SuperLevel extends PlayerLevel{
    @Override
    public void run() {
        System.out.println("아주 빨리 달립니다");
    }

    @Override
    public void jump() {
        System.out.println("아주 높이 뜀");
    }

    @Override
    public void turn() {
        System.out.println("아주 빨리 턴함");
    }

    @Override
    public void showLevelMessage() {
        System.out.println("**********상급자 레벨임**********");
    }
}
