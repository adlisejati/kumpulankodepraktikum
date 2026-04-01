package bab5;

import java.util.Scanner;

public class AppRun {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Kalkulator k = new Kalkulator();

        int pilihan;

        do {
            System.out.println("\n===== MENU KALKULATOR =====");
            System.out.println("1. Penjumlahan (Static)");
            System.out.println("2. Pengurangan (Static)");
            System.out.println("3. Perkalian (Non-Static)");
            System.out.println("4. Pembagian (Non-Static)");
            System.out.println("5. Sederhanakan Pecahan");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = input.nextInt();

            if (pilihan >= 1 && pilihan <= 4) {
                System.out.print("Masukkan angka pertama: ");
                int a = input.nextInt();
                System.out.print("Masukkan angka kedua: ");
                int b = input.nextInt();

                switch (pilihan) {
                    case 1:
                        System.out.println("Hasil: " + Kalkulator.tambah(a, b));
                        break;
                    case 2:
                        System.out.println("Hasil: " + Kalkulator.kurang(a, b));
                        break;
                    case 3:
                        System.out.println("Hasil: " + k.kali(a, b));
                        break;
                    case 4:
                        System.out.println("Hasil: " + k.bagi(a, b));
                        break;
                }

            } else if (pilihan == 5) {
                System.out.print("Masukkan pembilang: ");
                int pembilang = input.nextInt();
                System.out.print("Masukkan penyebut: ");
                int penyebut = input.nextInt();

                k.sederhana(pembilang, penyebut);

            } else if (pilihan == 0) {
                System.out.println("Terima kasih, program selesai.");
            } else {
                System.out.println("Pilihan tidak valid!");
            }

        } while (pilihan != 0);

        input.close();
    }
}