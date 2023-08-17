package ch06;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class ArrayListSteamTest {

    public static void main(String[] args) {
    List<String> sList = new ArrayList<>();
    sList.add("Tomas");
    sList.add("Edward");
    sList.add("Jack");

    Stream<String> stream = sList.stream();
    stream.forEach(i->System.out.println(i));

    sList.stream().sorted().forEach(i -> System.out.print(i + "\t"));
    sList.stream().map(i-> i.length()).forEach(i-> System.out.println(i));
    }
 }
