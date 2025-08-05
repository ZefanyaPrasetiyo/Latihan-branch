import java.util.Scanner;

import javax.swing.plaf.metal.MetalComboBoxUI.MetalPropertyChangeListener;
public class Pengulangan {
    public static void main(String[] args) {
        for (int hitungan = 0; hitungan <= 10; hitungan++){
            System.out.println("JEPANYA GYATT PLUS PLUS");
        }
        // membuat array
        int angka[] = {5,1,2,9,7};

        // menggunakan perulangan for each untuk menampilkan angka
        for (int x : angka){
            System.out.println( x +" ");
        }
        // pengulangan while  
        System.out.println("\n2. Perulangan while:");
        int count = 0;
        while (count < 10) {
            System.out.println(" hitungan " + count);
            count++;

        // pengulangan do while
        int i = 0;

        do {
            System.out.println("perulangan ke-" + i);
            i++;
        } while ( i <= 5);}
        String[] siswa = {"Devi", "Chika", "Ida", "Bima", "Yoga", "Ely"};

        int[][] Angka = {
                {0, 0}, {0, 1}, {0, 2},
                {1, 0}, {1, 1}, {1, 2}
        };

       
        for (int a = 0; a < Angka.length; a++) {
            int x = Angka[a][0];
            int y = Angka[a][1];
            System.out.println("Siapa yang akan duduk di meja (" + x + "," + y + ") : " + siswa[a]);
        }
         
         System.out.println("-------------------------");
         for (int i = 0; i < 2; i++) {
             System.out.print("| ");
             for (int j = 0; j < 3; j++) { 
                 int index = i * 3 + j; 
                 System.out.print(siswa[index] + " | ");
             }
             System.out.println("\n-------------------------");
         }  
        
    String kota = "Malang";
        for (int i = 0; i < kota.length(); i++ ){
            System.out.println(kota.substring(i));
            System.out.println("");
        }

        Scanner scanner = new Scanner(System.in);
        double uang = 50000;  
        double uangMinimum = 50000; 
        
        while (true) {
            System.out.println("Uang anda saat ini: " + uang);
            System.out.println("1. setor uang");
            System.out.println("2. ambil uang");
            System.out.println("3. Keluar");
            System.out.print("Pilih: ");
            int memilih = scanner.nextInt();

            if (memilih == 1) {
                System.out.print("Masukan jumlah uang yang akan disetor: ");
                double jumlahSetor = scanner.nextDouble();
                uang += jumlahSetor;
                System.out.println("Anda telah menyetor: " + jumlahSetor);
            } 
            else if (memilih == 2) {
                System.out.print("Masukan jumlah uang yang akan diambil: ");
                double jumlahAmbil = scanner.nextDouble();
                
                if (uang - jumlahAmbil >= uangMinimum) {
                    uang -= jumlahAmbil;
                    System.out.println("Anda telah mengambil: " + jumlahAmbil);
                } else {
                    System.out.println("Saldo tidak mencukupi. Saldo minimal harus 50.000.");
                }
            } 
            else if (memilih == 3) {
                System.out.println("Terima kasih telah menggunakan layanan kami.");
                break;
            } 
            else {
                System.out.println("Pilihan tidak valid, silakan pilih lagi.");
            }
        }

        scanner.close();
    }
}

  



