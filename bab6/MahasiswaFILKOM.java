package bab6;
public class MahasiswaFILKOM extends Manusia {
    private String nim;
    private double ipk;

    // Konstruktor: nim, ipk, nama, nik, jenisKelamin, menikah
    public MahasiswaFILKOM(String nim, double ipk, String nama, String nik,
                           boolean jenisKelamin, boolean menikah) {
        super(nama, nik, jenisKelamin, menikah);
        this.nim = nim;
        this.ipk = ipk;
    }

    // Getter & Setter
    public String getNim() { return nim; }
    public void setNim(String nim) { this.nim = nim; }

    public double getIpk() { return ipk; }
    public void setIpk(double ipk) { this.ipk = ipk; }

    public String getStatus() {
        // Format NIM FILKOM UB: digit 1-2 = angkatan, digit ke-7 = kode prodi
        String angkatan = "20" + nim.substring(0, 2);
        char kodeProdi = nim.charAt(6); // index 6 = digit ke-7

        String prodi;
        switch (kodeProdi) {
            case '2': prodi = "Teknik Informatika";           break;
            case '3': prodi = "Teknik Komputer";              break;
            case '4': prodi = "Sistem Informasi";             break;
            case '6': prodi = "Pendidikan Teknologi Informasi"; break;
            case '7': prodi = "Teknologi Informasi";          break;
            default:  prodi = "Prodi Tidak Dikenal";          break;
        }

        return prodi + ", " + angkatan;
    }

    public double getBeasiswa() {
        if (ipk >= 3.5 && ipk <= 4.0) return 75.0;
        if (ipk >= 3.0 && ipk < 3.5)  return 50.0;
        return 0.0;
    }

    @Override
    public double getPendapatan() {
        return getTunjangan() + getBeasiswa();
    }

    @Override
    public String toString() {
        return super.toString() +
               "\nnim          : " + nim +
               "\nipk          : " + ipk +
               "\nstatus       : " + getStatus();
    }
}