package bab5;

import java.util.Scanner;

public class MainJaket {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Jaket j = new Jaket();

        int pilihan;

        do {
            System.out.println("\n===== CV. LABKOMDAS =====");
            System.out.println("1. Lihat Daftar Harga");
            System.out.println("2. Hitung Pembelian");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = input.nextInt();

            switch (pilihan) {

                case 1:
                    j.tampilHarga();
                    break;

                case 2:
                    System.out.print("\nJumlah Jaket A: ");
                    int a = input.nextInt();

                    System.out.print("Jumlah Jaket B: ");
                    int b = input.nextInt();

                    System.out.print("Jumlah Jaket C: ");
                    int c = input.nextInt();

                    int totalA = j.hitungHargaA(a);
                    int totalB = j.hitungHargaB(b);
                    int totalC = j.hitungHargaC(c);

                    int total = totalA + totalB + totalC;

                    System.out.println("\n===== RINCIAN =====");
                    System.out.println("Jaket A : Rp " + totalA);
                    System.out.println("Jaket B : Rp " + totalB);
                    System.out.println("Jaket C : Rp " + totalC);
                    System.out.println("----------------------");
                    System.out.println("TOTAL BAYAR : Rp " + total);
                    break;

                case 0:
                    System.out.println("Terima kasih telah menggunakan program.");
                    break;

                default:
                    System.out.println("Pilihan tidak valid!");
            }

        } while (pilihan != 0);

        input.close();
    }
}