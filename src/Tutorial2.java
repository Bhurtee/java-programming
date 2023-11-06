import java.util.Scanner;

public class Tutorial2 {

    public class CompareTwoNumbers {
        public static void main(String[] args) {

            Scanner input = new Scanner(System.in);

            System.out.println("Enter first number: ");
            int firstNumberVariable = input.nextInt();

            System.out.println("Enter second number: ");
            int secondNumberVariable = input.nextInt();

            if (firstNumberVariable > secondNumberVariable) {
                System.out.println("First number is the largest");
            }
            else{
                    System.out.println("Second number is largest");
            }

        }




    }
}
