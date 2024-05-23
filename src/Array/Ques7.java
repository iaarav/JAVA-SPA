package Array;

import java.util.Scanner;

public class Ques7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int arr[] = new int[20];
        int square[] = new int[20];

        System.out.println("Entering Elements...");
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter element at position:" +(i+1));
            arr[i] = sc.nextInt();
            square[i] = arr[i]*arr[i];
        }

        System.out.println("Number \t Square");
        for (int i=0; i<arr.length;i++){
            System.out.println(" "+arr[i]+" \t  "+square[i]);
        }
    }
}
