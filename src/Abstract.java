import java.util.Scanner;

public class Abstract {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        System.out.println("First number");
        int firstNumber = input.nextInt ();

        System.out.println("Second number");
        int secondNumber = input.nextInt ();

        int product = firstNumber * secondNumber;
        System.out.println("The product of the two numbers " + product);
    }
}
