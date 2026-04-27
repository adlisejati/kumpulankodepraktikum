package bab6;

public class Testcase {
    public static void main(String[] args) {

        String sep = "=".repeat(45);

        // ============================================
        // 1. TEST CASE - MANUSIA
        // ============================================
        System.out.println(sep);
        System.out.println("         TEST CASE : MANUSIA");
        System.out.println(sep);

        // a. Laki-laki telah menikah → tunjangan $25
        Manusia a = new Manusia("Budi Santoso", "3578010101900001", true, true);
        System.out.println("\n[A] Laki-laki, Sudah Menikah");
        System.out.println(a);

        // b. Perempuan telah menikah → tunjangan $20
        Manusia b = new Manusia("Sari Dewi", "3578015505920002", false, true);
        System.out.println("\n[B] Perempuan, Sudah Menikah");
        System.out.println(b);

        // c. Belum menikah → tunjangan $15
        Manusia c = new Manusia("Andi Wijaya", "3578012020010003", true, false);
        System.out.println("\n[C] Belum Menikah");
        System.out.println(c);

        // ============================================
        // 2. TEST CASE - MAHASISWA FILKOM
        // ============================================
        System.out.println("\n" + sep);
        System.out.println("     TEST CASE : MAHASISWA FILKOM");
        System.out.println(sep);

        // NIM format FILKOM UB: digit 1-2 = angkatan, digit ke-7 = kode prodi
        // Contoh NIM "2151504XXXXXXX":
        // angkatan = 2021, digit-7 = '4' = Sistem Informasi

        // a. IPK < 3.0 → beasiswa $0
        MahasiswaFILKOM mf1 = new MahasiswaFILKOM(
                "2151502100001", 2.85,
                "Alif Sukirman", "3578012020030004", true, false);
        System.out.println("\n[A] IPK < 3.0");
        System.out.println(mf1);

        // b. IPK 3.0 – 3.5 → beasiswa $50
        MahasiswaFILKOM mf2 = new MahasiswaFILKOM(
                "2151504100002", 3.20,
                "Soeharto", "3578016060030005", false, false);
        System.out.println("\n[B] IPK 3.0 - 3.5");
        System.out.println(mf2);

        // c. IPK 3.5 – 4.0 → beasiswa $75
        MahasiswaFILKOM mf3 = new MahasiswaFILKOM(
                "2151507100003", 3.78,
                "Fajar Adi", "3578010101030006", true, false);
        System.out.println("\n[C] IPK 3.5 - 4.0");
        System.out.println(mf3);

        // ============================================
        // 3. TEST CASE - PEKERJA
        // ============================================
        System.out.println("\n" + sep);
        System.out.println("        TEST CASE : PEKERJA");
        System.out.println(sep);

        // a. Lama bekerja 2 tahun, anak 2
        // bonus 5%, tunjangan: menikah L=$25 + anak=$40 = $65
        Pekerja p1 = new Pekerja(3000.0, 2024, 1, 1, 2,
                "Hendra Kusuma", "3578011111800007", true, true);
        System.out.println("\n[A] Lama Bekerja 2 Tahun, Anak 2");
        System.out.println(p1);

        // b. Lama bekerja 9 tahun, tanpa anak
        // bonus 10%, tunjangan: menikah P=$20
        Pekerja p2 = new Pekerja(4000.0, 2017, 3, 15, 0,
                "Lina Marlina", "3578016060900008", false, true);
        System.out.println("\n[B] Lama Bekerja 9 Tahun");
        System.out.println(p2);

        // c. Lama bekerja 20 tahun, anak 10
        // bonus 15%, tunjangan: menikah L=$25 + anak=$200 = $225
        Pekerja p3 = new Pekerja(5000.0, 2006, 6, 10, 10,
                "Susanto Wahyu", "3578011515750009", true, true);
        System.out.println("\n[C] Lama Bekerja 20 Tahun, Anak 10");
        System.out.println(p3);

        // ============================================
        // 4. TEST CASE - MANAGER
        // ============================================
        System.out.println("\n" + sep);
        System.out.println("       TEST CASE : MANAGER");
        System.out.println(sep);

        // Lama bekerja 15 tahun, gaji $7500
        // bonus 15%, tunjangan: menikah L=$25 + anak + 10%*7500=$750
        Manager mgr = new Manager("Teknologi Informasi", 7500.0, 2011, 4, 1, 2,
                "Agus Setiawan", "3578012020780010", true, true);
        System.out.println("\n[A] Manager, Lama Bekerja ~15 Tahun, Gaji $7500");
        System.out.println(mgr);

        System.out.println("\n" + sep);
    }
}