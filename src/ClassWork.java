import java.util.Scanner;

public class ClassWork {

    public static void main(String[] args) {

        Scanner input = new Scanner (System.in);
        int age = input.nextInt();

        if (age >= 18)
        {
            System.out.println("You are an adult");
        }
        else{
            System.out.println("You are not an adult");

        }


    }
}
