import java.util.Scanner;

public class Classwork2 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Eneter year");
         int N = input.nextInt();

        if (N % 4 == 0) {
            System.out.println("This is a leap year");
        }
        else {
                System.out.println("This is not a leap year");
        }
    }
}
