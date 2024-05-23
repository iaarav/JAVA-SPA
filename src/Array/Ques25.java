package Array;

import java.util.Scanner;

public class Ques25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[10];

        System.out.println("Entering elements...");
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter element at position:" +(i+1));
            arr[i] = sc.nextInt();
        }
    }
}
