package ch17;

import java.io.*;

class Person implements Serializable{

    String name;
    String job;

    public Person(){}

    public Person(String name, String job){
        this.name = name;
        this.job = job;
    }

    public String toString(){
        return name + "," + job;
    }
}
public class SerializationTest {

    public static void main(String[] args) {

        Person personLee = new Person("순신", "이사");
        Person personKim = new Person("유신", "상무");

        try (FileOutputStream fos = new FileOutputStream("serial.txt");
             ObjectOutputStream oos = new ObjectOutputStream(fos)) {

            oos.writeObject(personLee);
            oos.writeObject(personKim);
        } catch (IOException e) {

            System.out.println(e);
        }

        try (FileInputStream fos = new FileInputStream("serial.txt");
             ObjectInputStream ois = new ObjectInputStream(fos)) {

            Person pLee = (Person) ois.readObject();
            Person pKim = (Person) ois.readObject();

            System.out.println(pLee);
            System.out.println(pKim);
        } catch (IOException e) {

            System.out.println(e);
        } catch (ClassNotFoundException e) {
            System.out.println(e);
        }
    }
}

