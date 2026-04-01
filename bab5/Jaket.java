package bab5;

class Jaket {

    // HARGA NORMAL (FINAL)
    public final int HARGA_A = 100000;
    public final int HARGA_B = 125000;
    public final int HARGA_C = 175000;

    // METHOD HITUNG TOTAL + DISKON
    public int hitungHargaA(int jumlah) {
        int harga = (jumlah > 100) ? 95000 : HARGA_A;
        return jumlah * harga;
    }

    public int hitungHargaB(int jumlah) {
        int harga = (jumlah > 100) ? 120000 : HARGA_B;
        return jumlah * harga;
    }

    public int hitungHargaC(int jumlah) {
        int harga = (jumlah > 100) ? 160000 : HARGA_C;
        return jumlah * harga;
    }

    // METHOD UNTUK MENAMPILKAN INFO HARGA
    public void tampilHarga() {
        System.out.println("Harga Normal:");
        System.out.println("Jaket A : Rp " + HARGA_A);
        System.out.println("Jaket B : Rp " + HARGA_B);
        System.out.println("Jaket C : Rp " + HARGA_C);

        System.out.println("\nDiskon (>100 pcs):");
        System.out.println("Jaket A : Rp 95.000");
        System.out.println("Jaket B : Rp 120.000");
        System.out.println("Jaket C : Rp 160.000");
    }
}