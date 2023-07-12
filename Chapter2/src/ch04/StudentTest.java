package ch04;

public class StudentTest {
    public static void main(String[] args) {
        Student junsoo = new Student();

        junsoo.studentID = 12345;
        junsoo.setStudentName("Lee");
        junsoo.address = "인천 남구";

        junsoo.showStudentInfo();

        Student jiyoun = new Student();

        jiyoun.studentID = 12;
        jiyoun.setStudentName("Choi");
        jiyoun.address = "서울 강서구";

        jiyoun.showStudentInfo();

        System.out.println(junsoo);
        System.out.println(jiyoun);
    }
}
