package Array;

import java.util.Scanner;

public class Ques5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String arr[] = new String[10];

        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter element at position:" +(i+1));
            arr[i] = sc.nextLine();
        }
        System.out.println("Printing elements...");
        for (int i = arr.length-1; i>=0 ; i--){
            System.out.println(arr[i]);
        }
    }
}
