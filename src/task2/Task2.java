package task2;

import java.util.ArrayList;
import java.util.List;

public class Task2 {
    public static void main(String[] args) {
        String[] fruits = {"orange", "plum", "tomato", "onion", "grape", "onion"};
        output(deleteOnion(fruits));
    }

    private static void output(String[] array){
        for (int i = 0; i < array.length; i++) {
            System.out.println(i + 1 + ") " + array[i]);
        }
    }
    private static String[] deleteOnion(String[] array){
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if(array[i].equals("onion")){
                count++;
            }
        }

        String[] fixed = new String[array.length - count];
        for (int i = 0, localCount = 0; i < array.length; i++) {
            if(!array[i].equals("onion")){
                fixed[localCount] = array[i];
                localCount++;
            }
        }
        return fixed;
    }
}
