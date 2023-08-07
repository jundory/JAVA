package ch16.gamelevel;

public class BeginnerLevel extends PlayerLevel{
    @Override
    public void run() {
        System.out.println("천천히 달립니다");
    }

    @Override
    public void jump() {
        System.out.println("못 뜀");
    }

    @Override
    public void turn() {
        System.out.println("턴도 못함");
    }

    @Override
    public void showLevelMessage() {
        System.out.println("**********초급자 레벨임**********");
    }
}
