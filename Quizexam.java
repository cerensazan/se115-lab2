import java.util.Scanner;

public class Quizexam {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 1. quiz score: ");
        float a = sc.nextFloat();
        System.out.println("Enter 2. quiz score: ");
        float b = sc.nextFloat();
        System.out.println("Enter 3. quiz score: ");
        float c = sc.nextFloat();

        float x = (a+b+c)/3/10*4 ;

        System.out.println("Enter final exam score: ");
        float e = sc.nextFloat();

        float y = e/10*6 ;
        float total = y+x;
        System.out.println("Total Score: " + total);

    }
}
