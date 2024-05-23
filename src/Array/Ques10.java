package Array;

import java.util.Scanner;

public class Ques10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[3];

        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter element at position " + (i + 1));
            arr[i] = sc.nextInt();
        }

        System.out.println("Printing Prime Numbers...");
        for (int i = 0; i < arr.length; i++) {
            int counter = 0;
            for (int j = 2; j < arr[i]; j++) {
                if (arr[i] % j == 0) {
                    counter = 1;
                    break;
                } else {
                    continue;
                }
            }
            if (counter == 0) {
                System.out.println(arr[i]);
            }
        }
    }
}