package bab5;

import java.util.Scanner;

public class MainAritmatika {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Masukkan nilai 1: ");
        int nil1 = in.nextInt();

        System.out.print("Masukkan nilai 2: ");
        int nil2 = in.nextInt();

        // PEMANGGILAN STATIC METHOD
        Aritmatika.hitungPengurangan(nil1, nil2);

        System.out.print("Masukkan nilai 1: ");
        nil1 = in.nextInt();

        System.out.print("Masukkan nilai 2: ");
        nil2 = in.nextInt();

        //  PEMANGGILAN STATIC METHOD
        Aritmatika.hitungPerkalian(nil1, nil2);

        System.out.print("Masukkan nilai 1: ");
        int value1 = in.nextInt();

        System.out.print("Masukkan nilai 2: ");
        int value2 = in.nextInt();

        //  NON-STATIC (HARUS BUAT OBJEK DULU)
        Aritmatika a = new Aritmatika();
        a.hitungPenjumlahan(value1, value2);

        System.out.print("\nMasukkan nilai pembagian 1: ");
        String s1 = in.next();

        System.out.print("Masukkan nilai pembagian 2: ");
        String s2 = in.next();

        double hasil = a.hitungPembagian(s1, s2);
        System.out.println("Hasil pembagian adalah: " + hasil);
        
        in.close();
    }
}