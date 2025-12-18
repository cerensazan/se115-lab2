import java.util.Scanner;

public class Fahrenheit {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.println ("Enter Celsius: ");
        int celsius = sc.nextInt();

        float f = celsius * 9/5 + 32;

        System.out.println("Fahrenheit: " + f );
    }

}
