package Array;

import java.util.Scanner;

public class Ques40 {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int a[] = new int[20];
        int b[] = new int[20];

        int x = 0; //pointer variable

        // FIRST METHOD
//        for (int i = 0 ; i <l ; i++){
//            b[i] = a[l-i-1];
//            System.out.println(b[i] + "->" + i);
//        }

        for (int i = 0; i<20 ; i++){
            System.out.println("Enter number at position "+ (i+1));
            a[i] = sc.nextInt();
        }

        for (int i = 19 ; i>=0 ; i--){
            b[x] = a [i];
            x++;
        }
        for (int i = 0 ; i < 20 ; i ++ ){
            System.out.println(b[i]);
        }
    }
}
