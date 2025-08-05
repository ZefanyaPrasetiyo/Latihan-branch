import java.util.Scanner;

public class Percabangan2 {
    public static void main(String[] args) {
        int nilai;
        Scanner input = new Scanner(System.in);

        System.out.println("input Nilai Anda (0 - 100): ");
        nilai = input.nextInt();

        if(nilai == 0 && nilai < 60){
        System.out.println("D");}
        else if (nilai >=61 && nilai <= 76) {
        System.out.println("c");}
        else if (nilai >=77 && nilai<=88) {
        System.out.println("B");}
        else if (nilai >=89 && nilai<=100) {
         System.out.println("A");   
        }

        
    }
}
