import java.util.Scanner;

public class switchcase {
    public static void main(String[] args) {
        char nilai;
        Scanner input = new Scanner(System.in);

        System.out.println("Input Nilai Anda (A-E): ");
        nilai = input.next().charAt(0);

        switch (nilai) {
            case 'A':
                System.out.println("Pertahankan!");
                break;
            case 'B':
                System.out.println("Harus Lebih baik lagi");
                break;
            case 'c':
                System.out.println("Perbanyak belajar");
            break;
            case 'D':
                System.out.println("jangan keseringan main");
            break;
            case 'E':
                System.out.println("kebanyakan bolos");
            break;
            default:
                System.out.println("maaf, format nilai tidak sesuai");
        }
    }
}
