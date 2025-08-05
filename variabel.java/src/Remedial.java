public class Remedial {

    public static void main(String[] args) {

                int nilai1 = 6;
                int nilai2 = 7;
                int nilai3 = 8;
                int nilai4 = 9;
                int nilai5 = 12;
        
                int nilaiMinimal = Math.min(Math.min(nilai1, nilai2), Math.min(Math.min(nilai3, nilai4), nilai5));
                int nilaiMaksimal = Math.max(Math.max(nilai1, nilai2), Math.max(Math.max(nilai3, nilai4), nilai5));
        
                double avg = average (6, 7, 8, 9, 12);
                System.out.println("Rata-rata :" + avg); 

                System.out.println("Minimal: " + nilaiMinimal);
                System.out.println("Maksimal: " + nilaiMaksimal);     
  }
  public static double average(int nilai1, int nilai2, int nilai3, int nilai4, int nilai5) {
    return (nilai1 + nilai2 + nilai3 + nilai4 +nilai5) / 2.0; // P
  }
}