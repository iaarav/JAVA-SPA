package Trash;

import java.util.Scanner;

public class Ques {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String:");
        String s = sc.nextLine();

        String q = "", r = "";
        int c;

        s = s.toLowerCase();

        for (int i = 97; i <= 123; i++) {        // calculating alphabetical order
            c = 0;
            for (int j = 0; j < s.length(); j++) {
                if (((char) (i)) == s.charAt(j)) {
                    c++;
                }
            }
            if (c > 0) {
                q += (char) (i);   // stores the (char) (i) if it is found in the string atleast once
            }
        }

        int l = q.length();
        int lastChar = q.charAt(l - 1);
        int firstChar = q.charAt(0);

        for (int i = firstChar; i <= lastChar; i++) { // prints alphabets between the first character of the sorted
            r += ((char) (i));                        // string and  the last character
        }

        System.out.println("Alphabetical order: " + q);
        System.out.println("New word: " + r);
    }
}
