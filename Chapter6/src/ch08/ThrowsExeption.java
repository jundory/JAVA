package ch08;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ThrowsExeption {

    public Class loadClass(String fileName, String className) throws ClassNotFoundException, FileNotFoundException {
        FileInputStream fis = new FileInputStream(fileName);
        Class c = Class.forName(className);
        return c;
    }

    public static void main(String[] args) {
        ThrowsExeption test = new ThrowsExeption();
        try {
            test.loadClass("Chapter6/a.txt", "java.lang.String");
        } catch (ClassNotFoundException e) {
            System.out.println(e);
        } catch (FileNotFoundException e) {
            System.out.println(e);
        }
        System.out.println("end");
    }
}
