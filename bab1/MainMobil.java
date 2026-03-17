import java.util.Scanner;

public class MainMobil {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Mobil m1 = new Mobil();
        System.out.println("=== INPUT DATA MOBIL 1 ===");

        System.out.print("Masukkan Manufaktur      : ");
        m1.setManufaktur(sc.nextLine());

        System.out.print("Masukkan Nomor Plat      : ");
        m1.setNoPlat(sc.nextLine());

        System.out.print("Masukkan Warna           : ");
        m1.setWarna(sc.nextLine());

        System.out.print("Masukkan Kecepatan (km/jam): ");
        m1.setKecepatan(sc.nextInt());

        System.out.print("Masukkan Waktu Tempuh (jam): ");
        m1.setWaktu(sc.nextDouble());
        sc.nextLine();

        System.out.println("\n--- DATA MOBIL 1 ---");
        m1.displayMessage();

        System.out.println("Jarak tempuh Mobil 1 adalah " + m1.hitungJarak() + " meter");

        System.out.println("\n====================================\n");

        Mobil m2 = new Mobil();
        System.out.println("=== INPUT DATA MOBIL 2 ===");

        System.out.print("Masukkan Manufaktur      : ");
        m2.setManufaktur(sc.nextLine());

        System.out.print("Masukkan Nomor Plat      : ");
        m2.setNoPlat(sc.nextLine());

        System.out.print("Masukkan Warna           : ");
        m2.setWarna(sc.nextLine());

        System.out.print("Masukkan Kecepatan (km/jam): ");
        m2.setKecepatan(sc.nextInt());

        System.out.print("Masukkan Waktu Tempuh (jam): ");
        m2.setWaktu(sc.nextDouble());
        sc.nextLine();

        System.out.println("\n--- DATA MOBIL 2 ---");
        m2.displayMessage();

        System.out.println("Jarak tempuh Mobil 2 adalah " + m2.hitungJarak() + " meter");

        System.out.println("\n====================================\n");

        System.out.print("Ubah warna Mobil 1 menjadi: ");
        m1.setWarna(sc.nextLine());

        System.out.println("\n--- DATA MOBIL 1 SETELAH PERUBAHAN ---");
        m1.displayMessage();
        System.out.println("Jarak tempuh Mobil 1 sekarang adalah " + m1.hitungJarak() + " meter");
        sc.close();
    }
}