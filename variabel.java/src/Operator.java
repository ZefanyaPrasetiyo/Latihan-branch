public class Operator {

    public static void main(String[] args) {
        
        //Perbandingan Variabel

        int a = 20;
        a+=4;
        System.out.println("Isi variabel a: " + a );

        int b = 40;
        b*=2;
        System.out.println(" Isi variabel b: " + b );

        int c = 10;
        c/=2;
        System.out.println("Isi variabel c: " + c ) ;

        int d = 15;
        --d;
        System.out.println("Isi variabel d: " + d ) ;
        
        int r = 12;
        r-=2;
        System.out.println("Isi variabel r: " + r ) ;

        // Operator Perbandingan

        int p = 15;
        int q = 20;
        boolean hasil;

        hasil = p == q ;
        System.out.println("Apakah p == q ? " + hasil );

        hasil = p != q;
        System.out.println(" Apakah p != q ? " + hasil );

        hasil = p > q;
        System.out.println("Apakah p > q ? " + hasil );

        hasil = p < q;
        System.out.println(" Apakah p < q ? " + hasil );

        hasil = p >= q;
        System.out.println("Apakah p >= q ? " + hasil );

        hasil = p <= q;
        System.out.println("Apakah p <= q ? " + hasil); 

        // Perbandingan Logika 

        int x = 60;
        int y = 40;
        boolean k = true;

        k = x > y && k;
        System.out.println("Hasil dari x > y && k : " + k);

        k = x < y || k;
        System.out.println("Hasil dari x < y || k : " + k);

        k = !k;
        System.out.println("Hasil dari !k : " + k);

        k = y > x && k;
        System.out.println("Hasil dari y > x && k : " + k); 

        k = y < x || k;
        System.out.println("Hasil dari y < x || k : " + k);

        /// Remed uh operator

        int g = 45;
        int n = 15;
 
        System.out.println(Math.min(g, n));
        System.out.println(Math.max(g, n));

        double avg = average(g, n);
        System.out.println("Rata-rata: " + avg);
    }

        public static double average(int g, int n) {
        return (g + n) / 2.0; // P
    }
}