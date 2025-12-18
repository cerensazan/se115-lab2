import java.util.Scanner;

public class Incrementdecrement {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = 6;
        System.out.println(x++); // post-increment
        System.out.println(++x); // pre-increment

        int a = 6;
        int y = a++ + ++a + a--;
        System.out.println("a = " + a + ", a = " + y);

    }
}
