import java.util.Scanner;

public class SE115LAB2 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the name:");
        String name= sc.nextLine();

        System.out.println("Enter the age:");
        int age = sc.nextInt();
         age++;
                 System.out.printf("Hello %s you will be %02d years old ", name, age );

    }

}
