package Array.important;

import java.util.Scanner;

public class  binarysearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of elements");
        int n = sc.nextInt();
        System.out.println("Enter element to be searched");
        int element = sc.nextInt();

        int arr[] = new int[n];
        int flag = 0;

        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter element at pos" + (i + 1));
            arr[i] = sc.nextInt();
        }

        int end = arr.length - 1;
        int beg = 0;

        while (beg<=end){
            int mid = (beg+end)/2;
            if (arr[mid] == element) {
                flag = 1;
                break;
            } else if (arr[mid] < element) {
                beg = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        if (flag == 1)
            System.out.println("SEARCH SUCCESSFUL");
        else
            System.out.println("SEARCH UNSUCCESSFUL");
    }
}