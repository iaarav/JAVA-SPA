package Trash;

import java.util.Scanner;

public class BookFair {
    String Bname;
    double price;

    BookFair() {
        Bname = "";
        price = 0.0;
    }

    void input() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter name of the book");
        Bname = sc.nextLine();
        System.out.println("Enter price of the book");
        price = sc.nextDouble();

    }

    void calculate() {
        double discount;

        if (price <= 1000.0) {
            discount = 0.02 * price;
        } else if (price <= 3000) {
            discount = 0.1 * price;
        } else {
            discount = 0.15 * price;
        }

        price = price - discount;
    }

    void display(){
        System.out.println("Name of the book is "+Bname);
        System.out.println("Price of the book is Rs. "+price);
    }

    public static void main(String[] args) {
        BookFair obj = new BookFair();

        obj.input();
        obj.calculate();
        obj.display();
    }
}
