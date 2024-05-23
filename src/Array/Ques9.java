package Array;

import java.util.Scanner;

public class Ques9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name[] = new String[3];
        String address[] = new String[3];

        for(int i = 0 ; i<=2 ; i++){
            System.out.println("Enter name "+(i+1));
            name[i] = sc.nextLine();
            System.out.println("Enter address "+(i+1));
            address[i] = sc.nextLine();
        }
        System.out.println(name[0]+" "+address[1]);
        System.out.println(name[1]+" "+address[2]);
        System.out.println(name[2]+" "+address[0]);
    }
}
