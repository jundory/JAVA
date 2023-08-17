package ch08;

import java.util.Arrays;

public class ArrayIndexException {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
//        Arrays.stream(arr).forEach((i)-> System.out.println(i));
        try{
            for(int i = 0; i<=5; i++){
                System.out.println(arr[i]);
            }
        }catch(ArrayIndexOutOfBoundsException e){
                System.out.println(e.getMessage());
                System.out.println(e.toString());
            }
        }
    }
