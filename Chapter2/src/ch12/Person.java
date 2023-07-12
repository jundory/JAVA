package ch12;

public class Person {
    String name;
    int age;

    public Person(){
        this("no name", 1);
    }

    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }
    public void  showPerson(){
        System.out.println(name + "," + age);
    }

    public Person getPerson(){
        return this;
    }
    public static void main(String[] args) {
        Person person = new Person();
        person.showPerson();
        System.out.println(person);

        Person person2 = person.getPerson();
        System.out.println(person2); //this를 써서 person이 참조하는 인스턴스와 동일한 값이 나옴
    }
}
