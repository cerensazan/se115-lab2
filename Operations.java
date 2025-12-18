import java.util.Scanner;

public class Operations {

    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);

        System.out.println("Enter an amount in kuruş: ");
        int kurus = sc.nextInt();
        int lira = kurus / 100 ;
        int kalan = kurus % 100 ;
        System.out.println( lira + " lira " + kalan + " kuruş " );

        int sharekurus = kurus / 3 ;
        int remainder = kurus  % 3 ;
        System.out.println("When the money is divided into three, each one gets " + (sharekurus/100) +" lira " + (sharekurus%100)+ " kuruş " +",remainder " + remainder + " kurus" );

        float kurusf= (float) kurus / 3 ;
        int remainderi = kurus % 3;
        System.out.printf("To each friend with float division: %.2f kuruş and remainder %02d kuruş " , kurusf, remainderi ) ;
    }

}
