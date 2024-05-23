package Trash;

import java.util.Scanner;

public class UglyNumber {

    public boolean isPrime(int n) { // checks if the number is prime or not
        boolean flag = true;
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                flag = false;
                break;
            } else {
                continue;
            }
        }
        return (flag);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        UglyNumber obj = new UglyNumber();
        int x = 0;                                    // counter for array index
        int flag = 1;                                 // checks if is ugly or not
        int temp;

        int factors[] = new int[10];                    // stores prime factors

        System.out.println("Enter a number: ");
        int a = sc.nextInt();
        temp = a;

        for (int i = 2; i <= a; i++) {                    // check for factors of the number
            if (obj.isPrime(i)) {                           // checks if the factor is prime or not
                while (temp % i == 0) {                     // divides the number (temp) by the factor until divisible
                    factors[x] = i;                         // adds the prime factor to the array
                    x++;
                    temp = temp / i;                           // divides the number by the prime factor
                }
            } else {
                continue;
            }
        }

        for (int i = 0; i < factors.length; i++) {                 // traverses through the array for prime factors
            if (factors[i] == 2 || factors[i] == 5 || factors[i] == 3 || factors[i] == 0 ) {        // checks if the factors are just 2,3 and 5
                continue;
            }
            else {                                              // if there is another factor except 2,3,5, then updates the flag variable
                flag=0;
                break;
            }
        }

        if (flag == 0){                                            // checks and prints if it is an ugly number or not
            System.out.println("Not an ugly number");
        } else {
            System.out.println("UglY number");
        }
    }
}
