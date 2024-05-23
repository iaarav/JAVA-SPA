package Array;

import java.util.Scanner;

public class Ques1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a[] = new int[10];
        for (int i = 0; i<10 ; i++){
            System.out.println("Enter Element at position " + (i+1));
            a[i] = sc.nextInt();
        }
    }
}
