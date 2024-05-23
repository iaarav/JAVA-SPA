package Trash;

import java.util.Scanner;

public class UglyNumberSolution2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;

        System.out.println("Enter a number");
        n = sc.nextInt();

        while ((n % 2 == 0 || n % 3 == 0 || n % 5 == 0) && n > 1) {

            if (n % 3 == 0) {
                n = n / 3;
            }
            if (n % 2 == 0) {
                n = n / 2;
            }
            if (n % 5 == 0) {
                n = n / 5;
            }
        }

        if (n == 1) {
            System.out.println("Ugly Number");
        } else {
            System.out.println("Not an ugly number");
        }
    }
}
