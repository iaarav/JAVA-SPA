package Trash;

    import java.util.Scanner;

    public class Ques27 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            String arr[] = new String[3];
            String temp; int r;

            int length = arr.length;
            for (int i = 0; i < length; i++){
                System.out.println("Enter Element at pos "+ (i+1));
                arr[i] = sc.nextLine();
            }

            for (int i=0; i< length -1; i++ ){
                for (int j=0; j< length -1 -i; j++){
                    r = arr[j].compareTo(arr[j+1]);

                    if (r>1){
                        temp = arr[j+1];
                        arr[j+1] = arr[j];
                        arr[j] = temp;
                    }
                }
            }
            for (int i=0; i<length;i++){
                System.out.println(arr[i]);
            }
        }
    }
