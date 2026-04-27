package bab7;

public class Main {
    public static void main(String[] args) {

        Kue[] daftarKue = new Kue[20];

        for (int i = 0; i < 20; i++) {
            if (i % 2 == 0) {
                daftarKue[i] = new KuePesanan(
                        "KuePesanan" + i,
                        10000 + (i * 1000),
                        1 + (i * 0.5));
            } else {
                daftarKue[i] = new KueJadi(
                        "KueJadi" + i,
                        5000 + (i * 500),
                        2 + i);
            }
        }

        double totalSemua = 0;
        double totalPesanan = 0;
        double totalBerat = 0;
        double totalJadi = 0;
        double totalJumlah = 0;

        Kue kueTermahal = null;
        double maxHarga = 0;

        System.out.println("=== DATA KUE ===");

        for (Kue k : daftarKue) {
            double hargaAkhir = k.hitungHarga();
            totalSemua += hargaAkhir;

            System.out.println("\nNama        : " + k.nama);
            System.out.println("Jenis       : " + k.getClass().getSimpleName());
            System.out.println("Harga Awal  : " + k.harga);
            System.out.println("Harga Akhir : " + hargaAkhir);
            System.out.println("------------------------------");

            if (k instanceof KuePesanan) {
                totalPesanan += hargaAkhir;
                totalBerat += ((KuePesanan) k).getBerat();
            } else if (k instanceof KueJadi) {
                totalJadi += hargaAkhir;
                totalJumlah += ((KueJadi) k).getJumlah();
            }

            if (hargaAkhir > maxHarga) {
                maxHarga = hargaAkhir;
                kueTermahal = k;
            }
        }

        System.out.println("\n=== REKAPITULASI ===");
        System.out.println("Total semua kue        : " + totalSemua);

        System.out.println("\nTotal KuePesanan       : " + totalPesanan);
        System.out.println("Total berat            : " + totalBerat);

        System.out.println("\nTotal KueJadi          : " + totalJadi);
        System.out.println("Total jumlah           : " + totalJumlah);

        System.out.println("\nKue Termahal:");
        System.out.println("Nama        : " + kueTermahal.nama);
        System.out.println("Jenis       : " + kueTermahal.getClass().getSimpleName());
        System.out.println("Harga Akhir : " + maxHarga);
    }
}