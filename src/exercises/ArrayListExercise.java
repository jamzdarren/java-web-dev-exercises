package exercises;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayListExercise {
    public static void main(String[] args) {
        // Integers
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(3, 5, 1, 10, 44, 6, 29, 53, 666, 9));
        int sum = 0;
        for (Integer num: list) {
            if (num % 2 == 0) {
                sum+=num;
            }
        }
        System.out.println(sum);


        // Strings
        ArrayList<String> strList = new ArrayList<>(Arrays.asList("James", "Sara", "Tommy", "Bob"));
        Scanner input = new Scanner(System.in);
        System.out.println("Enter word length: ");
        int strLen = input.nextInt();
        for (String item: strList) {
            if (item.length() == strLen) {
                System.out.println(item);
            }
        }
    }
}
