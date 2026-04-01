package bab4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("=== SISTEM SWALAYAN TINY ===");

        System.out.print("Masukkan No Pelanggan: ");
        String no = input.nextLine();

        System.out.print("Masukkan Nama: ");
        String nama = input.nextLine();

        System.out.print("Masukkan Saldo Awal: ");
        double saldo = input.nextDouble();
        input.nextLine();

        System.out.print("Buat PIN: ");
        String pin = input.nextLine();

        Pelanggan p;

        String kode = no.substring(0, 2);
        if (kode.equals("38")) {
            p = new Silver(no, nama, saldo, pin);
        } else if (kode.equals("56")) {
            p = new Gold(no, nama, saldo, pin);
        } else {
            p = new Platinum(no, nama, saldo, pin);
        }

        boolean login = false;

        while (!login && !p.isBlocked) {
            System.out.print("Masukkan PIN: ");
            String inputPin = input.nextLine();
            login = p.login(inputPin);
        }

        if (p.isBlocked) {
            System.out.println("Program selesai.");
            return;
        }

        int pilih;

        do {
            System.out.println("\n===== MENU =====");
            System.out.println("1. Top Up");
            System.out.println("2. Pembelian");
            System.out.println("3. Keluar");
            System.out.print("Pilih menu: ");
            pilih = input.nextInt();

            if (pilih == 1) {
                System.out.print("Masukkan jumlah top up: ");
                double t = input.nextDouble();
                p.topUp(t);

            } else if (pilih == 2) {
                System.out.print("Masukkan jumlah belanja: ");
                double b = input.nextDouble();
                p.beli(b);
            }

        } while (pilih != 3);

        System.out.println("Terima kasih.");
    }
}