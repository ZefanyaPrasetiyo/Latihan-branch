import java.util.ArrayList;

public class ehe  {


    public static void main(String[] args) throws Exception  {
    ArrayList SiswaTB = new ArrayList<>();
    
    //mengisi arraylist
        SiswaTB.add("SMK TARUNA BHAKTI");
        SiswaTB.add("Pinter");
        SiswaTB.add("Kritis");
        SiswaTB.add("Rapih");
        SiswaTB.add("Sopan");
        SiswaTB.add(123456);
        SiswaTB.add("True");

        //menghapus arraylist
        SiswaTB.remove(2);

        //mengambil nilai arraylist
        System.out.println(SiswaTB.get(4));

        System.out.println("===============================================");

        //Check array kosong
        System.out.println(SiswaTB.isEmpty());

        System.out.println("===============================================");

        //cari index
        System.out.println(SiswaTB.indexOf("Sopan"));

        System.out.println("===============================================");

        //Cari nilai
        System.out.println(SiswaTB.contains("pinter"));

        System.out.println("===============================================");

        //update nilai
        SiswaTB.set(1, SiswaTB);

        System.out.println("===============================================");

        System.out.println(SiswaTB);

        System.out.println("===============================================");

        System.out.println("kantong doraemon berisi " + SiswaTB.size() + " item ");

        System.out.println("===============================================");

    }
}
