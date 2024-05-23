package Array;

import java.util.Scanner;

public class Ques8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int arr[] = new int[20];
        int sum = 0;

        System.out.println("Entering Elements...");
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter element at position:" +(i+1));
            arr[i] = sc.nextInt();
            sum += arr[i];
        }

        CONSTANTS.printArray(arr);
        System.out.println("Sum: "+sum);
    }
}
