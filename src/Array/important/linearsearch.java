package Array.important;

import java.util.Scanner;

public class linearsearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of elements");
        int n = sc.nextInt();
        System.out.println("Enter element to be searched");
        int element = sc.nextInt();

        int arr[] = new int[n];
        int flag = 0;

        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter element at pos"+ (i+1));
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < arr.length; i++) {
            if (element == arr[i]) {
                flag = 1;
                break;
            } else {
                continue;
            }
        }
        if (flag == 1)
            System.out.println("SEARCH SUCCESSFUL");
        else
            System.out.println("SEARCH UNSUCCESSFUL");
    }
}
