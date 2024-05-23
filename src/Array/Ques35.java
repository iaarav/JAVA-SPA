package Array;

import java.util.Scanner;

public class Ques35 {
    public static void main(String[] args) {
        // Arrays to store words for tens and ones places
        String[] tensWords = {"", "", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"};
        String[] onesWords = {"", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"};


        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a two-digit number: ");
        int number = sc.nextInt();

        // Checking if the number is a two-digit number
        if (number < 10 || number > 99) {
            System.out.println("Please enter a valid two-digit number.");
        } else if (number <= 19) {
            System.out.println(onesWords[number]);
        } else {
            // Extracting the tens and ones places
            int tens = number / 10;
            int ones = number % 10;

            // Printing the number in words
            System.out.println("In words: " + tensWords[tens] + " " + onesWords[ones]);
        }

    }
}
