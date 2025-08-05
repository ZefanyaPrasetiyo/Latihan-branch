import java.util.Scanner;
public class Percabangan {

    public static void main(String[] args) {
        int nilai;
        Scanner input = new Scanner(System.in);

        System.out.println("input Nilai Anda (0 - 100): ");
        nilai = input.nextInt();

        if (nilai>=76){
            System.out.println("Selamat anda telahlulus");
        }
        else{
            System.out.println(" Maaf Anda Harus remed");
        }
    }
}