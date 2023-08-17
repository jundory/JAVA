package ch06;

import java.util.Arrays;
import java.util.stream.IntStream;

public class intArrayStreamTest {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};

        //일반 for문
//        for( int num : arr){
//            System.out.print(num);
//        }
        System.out.println();
        //forEach문
        IntStream is = Arrays.stream(arr);
        is.forEach((i)-> System.out.print(i));

        int sum = Arrays.stream(arr).sum();
        System.out.println();
        System.out.print(sum);


    }
}
