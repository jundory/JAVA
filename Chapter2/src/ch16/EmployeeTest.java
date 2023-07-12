package ch16;

public class EmployeeTest {
    public static void main(String[] args) {
        Employee employeeJun = new Employee();
        employeeJun.setEmployeeName("이순신");

        System.out.println(employeeJun.getSerialNum());
        Employee employeeKim = new Employee();
        employeeKim.setEmployeeName("김유신");

        System.out.println(employeeJun.getEmployeeName()+ "님의 사번은" + employeeJun.getEmployeeId());
        System.out.println(employeeKim.getEmployeeName()+ "님의 사번은" + employeeKim.getEmployeeId());
    }
}
