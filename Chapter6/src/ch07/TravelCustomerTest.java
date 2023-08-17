package ch07;

import java.util.ArrayList;
import java.util.List;

public class TravelCustomerTest {
    public static void main(String[] args) {
        TravelCustomer customerLee = new TravelCustomer("이순신", 40, 100);
        TravelCustomer customerKim = new TravelCustomer("김유신", 20, 100);
        TravelCustomer customerHong = new TravelCustomer("홍길동", 13, 50);

        List<TravelCustomer> customerList = new ArrayList<>();
        customerList.add(customerLee);
        customerList.add(customerKim);
        customerList.add(customerHong);
        System.out.println("고객 명단");
        customerList.stream().map((i)->i.getName()).forEach((i)-> System.out.println(i));

        System.out.println("여행비용");
        System.out.println(customerList.stream().mapToInt((i)->i.getPrice()).sum());

        System.out.println("20세 이상 고객");
        customerList.stream().filter((i)->i.getAge() >=20).map((i)->i.getName()).sorted().forEach((i)-> System.out.println(i));
    }
}
