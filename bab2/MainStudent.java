package bab2;

import java.util.Scanner;

public class MainStudent {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah siswa: ");
        int jumlah = sc.nextInt();
        sc.nextLine();

        Student[] siswa = new Student[jumlah];

        for (int i = 0; i < jumlah; i++){

            System.out.println("\nData siswa ke-" + (i+1));
            
            System.out.print("Nama : ");
            String nama = sc.nextLine();

            System.out.print("Alamat : ");
            String alamat = sc.nextLine();

            System.out.print("Umur : ");
            int umur = sc.nextInt();

            System.out.print("Nilai Matematika : ");
            double math = sc.nextDouble();

            System.out.print("Nilai English : ");
            double english = sc.nextDouble();

            System.out.print("Nilai Science : ");
            double science = sc.nextDouble();
            sc.nextLine();

            siswa[i] = new Student(nama, alamat, umur, math, english, science);
        }
    
        System.out.println("\n===== DATA SISWA =====");
        for (int i = 0; i < jumlah; i++){
            System.out.println("\nSiswa ke- " + (i+1));
            siswa[i].displayMessage();
        }

        System.out.println("\n===== INFORMASI OBJEK =====");
        Student.jumlahObjek();

        sc.close();
    }
}