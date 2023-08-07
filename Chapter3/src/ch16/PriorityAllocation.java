package ch16;

public class PriorityAllocation implements Scheduler{
    @Override
    public void getNextCall() {
        System.out.println("상담 전화를 순서대로 가져옵니다.");
    }

    @Override
    public void sendCallToAgent() {
        System.out.println("우선순위가 높은 고객을 우선으로 숙련도 높은 상담원 배분");
    }
}
