package ch02;

public class Student implements Cloneable{
    private int studentNum;
    private String studentName;

    public Student(int studentNum, String studentName){
        this.studentName = studentName;
        this.studentNum = studentNum;
    }

    public String toString(){
        return studentName + "," + studentNum;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Student){
            Student std = (Student)obj;
            if(this.studentNum == std.studentNum)
                return true;
            else return false;
        }
        return false;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }
}
