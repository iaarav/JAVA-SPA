package Trash;

public class Que {
    public static void main(String[] args) {
        int p = 1, a = -1;

        for (int i=1; i<=10;i++){
            a += 2;

            System.out.print((a*p) + " ");
            p *= -1;
        }
    }
}
