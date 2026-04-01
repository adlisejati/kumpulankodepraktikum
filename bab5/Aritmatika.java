package bab5;

public class Aritmatika {

    //  NON-STATIC METHOD (harus pakai objek)
    public void hitungPenjumlahan(int a, int b) {
        int nilai = a + b;
        System.out.println("Nilai penjumlahan adalah: " + nilai);

        // tambahan sesuai soal
        hitungPerkalian(a, b);
    }

    //  STATIC METHOD (bisa langsung pakai nama class)
    public static void hitungPerkalian(int a, int b) {
        int nilai = a * b;
        System.out.println("Nilai perkalian adalah: " + nilai);

        //hitungPenjumlahan(a, b);
    }

    //  STATIC METHOD (bisa langsung pakai nama class)
    public static void hitungPengurangan(int a, int b) {
        int nilai = a - b;
        System.out.println("Nilai pengurangan adalah: " + nilai);
    }

    public double hitungPembagian(String nil, String nil2){
        double a = Double.parseDouble(nil);
        double b = Double.parseDouble(nil2);
        return a / b;
    }
}