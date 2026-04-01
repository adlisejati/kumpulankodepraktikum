package bab5;

class Kalkulator {

    // STATIC METHOD
    public static int tambah(int a, int b) {
        return a + b;
    }

    public static int kurang(int a, int b) {
        return a - b;
    }

    // NON-STATIC METHOD
    public int kali(int a, int b) {
        return a * b;
    }

    public double bagi(int a, int b) {
        if (b == 0) {
            System.out.println("Error: Tidak bisa dibagi dengan nol!");
            return 0;
        }
        return (double) a / b;
    }

    // MENYEDERHANAKAN PECAHAN
    public void sederhana(int pembilang, int penyebut) {
        int gcd = cariFPB(pembilang, penyebut);

        pembilang /= gcd;
        penyebut /= gcd;

        System.out.println("Hasil sederhana: " + pembilang + "/" + penyebut);
    }

    // METHOD BANTU FPB
    private int cariFPB(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}