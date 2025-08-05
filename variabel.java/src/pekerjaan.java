import java.util.Scanner;

public class pekerjaan {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.println("Berapa umur kamu");

        int umur = input.nextInt();

        if (umur >= 18 ) {
            System.out.println("Anda sudah bekerja/belum ?");
            
            String bekerja = input.next();
            if (bekerja.equals("sudah")) {
                System.out.println("Berapa Tanggungan hidup anda dalam sebulan ?");}
            else if (bekerja.equals("belum")) {
                System.out.println("Penduduk miskin");}
            else {
                System.out.println("Input tidak valid silakan masukan'sudah' atau 'belum'.");
            }
            double Tanggungan  = input.nextDouble();
            System.out.println("Tanggungan hidup dalam anda sebulan adalah: Rp " + Tanggungan );

            if (Tanggungan  < 300.000) {
                System.out.println("Penduduk miskin");
            } else {
                System.out.println("Bukan penduduk miskin");
            }
        }   
        else {
            System.out.println("sudah sekolah/Belum");
            String sekolah = input.next();
            if (sekolah.equals("sudah")) {
            System.out.println("Bukan penuduk miskin");
            } else if (sekolah.equals("belum")) {
            System.out.println("Penduduk miskin");  
            }
        }
    }
}