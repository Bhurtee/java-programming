import java.util.Scanner;

public class ConditionalStatement2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter grade: ");
        int gradeResult = input.nextInt();

        if (gradeResult >= 0 && gradeResult <= 29){
            System.out.println("Grade is F");
        }
        if (gradeResult >= 30 && gradeResult <= 39){
            System.out.println("Grade is E");
        }
        if (gradeResult >= 40 && gradeResult <= 49){
            System.out.println("Grade is D");
        }
        if (gradeResult >= 50 && gradeResult <= 59){
            System.out.println("Grade is C");
        }
        if (gradeResult >=60 && gradeResult <= 69){
            System.out.println("Grade is B");
        }
        if (gradeResult >= 70 && gradeResult <= 100){
            System.out.println("Grade is A");
        }
    }
}
