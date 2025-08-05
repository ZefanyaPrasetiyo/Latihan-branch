import java.util.Scanner;

public class Samsung {

    public static void main(String[] args) {
       
        System.out.println("Apakah anda ingin membeli hp ?");
        int yatidak;
        Scanner input = new Scanner(System.in);
        System.out.println("ketik 1 untuk beli");
        System.out.println("ketik angka lain jika tidak jadi membeli");
        yatidak = input.nextInt();
        if (yatidak == 1) {
        char pilih;
        Scanner input2 = new Scanner(System.in);
        System.err.println("pilih 1-6");
        System.out.println("Samsung Galaxy A54 harga 6.500.000");
        System.out.println("Samsung Galaxy A24 harga 3.500.000");
        System.out.println("Oppo A55 harga 1.800.000");
        System.out.println("Oppo A57 harga 2.300.000");
        System.out.println("Xiaomi Redmi Note 12 harga 2.200.000");
        System.out.println("Xiaomi Redmi Note 12 pro harga 4.400.000");

        pilih = input2.next().charAt(0);
       

        switch (pilih) {
            case '1':
               System.out.println("beli Samsung Galaxy A54 dengan harga 6.500.000"); 
               System.out.println("terima kasih telah berkunjung");
                break;
            case '2':   
               System.out.println("beli Samsung Galaxy A24 dengan harga 3.500.000");
               System.out.println("Terima kasih telah berkunjung");
               break;
            case '3':
                System.out.println(" beli Oppo A55 dengan harga 1.800.000"); 
                System.out.println("Terima kasih telah berkunjung");
                break;
            case '4':
                System.out.println("beli Oppo A57 dengan harga 2.300.000");  
                System.out.println("Terima kasih telah berkunjung");
                break;
            case '5':
                System.out.println("beli Xiaomi Redmi Note 12 dengan harga 2.200.000");
                System.out.println("Terima kasih telah berkunjung");
                break;
            case '6':
                System.out.println("beli Xiaomi Redmi Note 12 pro dengan harga 4.400.000");
                System.out.println("Terima kasih telah berkunjung");
            default:
                System.out.println("Pilihan tidak valid harap masukan angka 1-6 ");
                break;
         }
        }
        else {
            System.out.println("Terima kasih telah berkunjung");
        }
    }
}