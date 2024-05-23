package Array;

import java.util.Scanner;

public class Ques36 {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        for (int i = 0; i < 9; i += 3) {
            System.out.println(arr[i] + " " + arr[i + 1] + " " + arr[i + 2]);
        }

        for (int i = 8; i >= 0; i -= 3) {
            System.out.println(arr[i] + " " + arr[i - 1] + " " + arr[i - 2]);
        }

        for (int i = 0; i <= 2; i ++) {
            System.out.println(arr[i] + " " + arr[i + 3] + " " + arr[i + 6]);
        }
    }
}
