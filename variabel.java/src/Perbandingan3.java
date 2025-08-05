import java.util.Scanner;

public class Perbandingan3 {
    public static void main(String[] args) {
        int  Umur; 
        boolean weekday;

        Scanner input = new Scanner(System.in);

        System.out.println("input umur");
        Umur = input.nextInt();
        System.out.println("weekday");
        weekday = input.nextBoolean();

        if (Umur<=15) {
        if (weekday) {
            System.out.println(40000);}
            else { System.out.println(60000);}    
        }
        else{
            if (weekday) {
                System.out.println(50000);}
                else {System.out.println(70000);}
        }

    }
}
   