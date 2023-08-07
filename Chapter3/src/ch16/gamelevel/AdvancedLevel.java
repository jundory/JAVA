package ch16.gamelevel;

public class AdvancedLevel extends PlayerLevel{
    @Override
    public void run() {
        System.out.println("빨리 달립니다");
    }

    @Override
    public void jump() {
        System.out.println("높이 뜀");
    }

    @Override
    public void turn() {
        System.out.println("빠른 턴");
    }

    @Override
    public void showLevelMessage() {
        System.out.println("**********중급자 레벨임**********");
    }
}
