import java.util.Scanner;

public class ConditionalStatement {

    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);

        System.out.println("Enter first number");
        int i = number.nextInt();

        System.out.println("Enter second number");
        int j = number.nextInt();

        if (i > j){
            System.out.println(i + " is the largest number");
        }
        else {
            System.out.println(j + "is the smallest number");
        }
    }
}
