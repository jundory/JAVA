package ch09;

public class SubjectTest {
    public static void main(String[] args) {
        Student studentLee = new Student(1234,"Lee");
        studentLee.setKoreaSubject("국어", 100);
        studentLee.setMathSubject("수학", 99);

        Student studentKim = new Student(5678,"Kim");
        studentKim.setKoreaSubject("국어",60);
        studentKim.setMathSubject("수학",65);

        studentLee.showScoreInfo();
        studentKim.showScoreInfo();
    }
}
