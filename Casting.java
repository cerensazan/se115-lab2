import java.util.Scanner;

public class Casting {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.println("Enter a float number: "  );
        float f = sc.nextFloat();

        int i = (int) f;
        System.out.println("Float number: " +f );
        System.out.println("Casting to int: " +i );

        System.out.print("Enter an int number: " );
        int a = sc.nextInt();

        float g = (float) a;

        System.out.println("int: " + a );
        System.out.println("float: " +g);
    }
}
