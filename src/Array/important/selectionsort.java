package Array.important;

import Array.CONSTANTS;

public class selectionsort {
    public static void main(String[] args) {
        int arr[] = {0, 8, 9, 1, 4, 6, 2,};

        int temp, min = 0;

        for (int i = 0; i < arr.length - 1; i++) {
            min = i;

            for (int j = i + 1; j < arr.length; j++) {
                if (arr[min] > arr[j]) {
                    min = j;
                }
            }
            temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
