package bab6;

import java.time.LocalDate;
import java.time.Period;

public class Pekerja extends Manusia {
    private double gaji;
    private LocalDate tahunMasuk;
    private int jumlahAnak;

    // Konstruktor: gaji, year, month, day, jumlahAnak, nama, nik, jenisKelamin, menikah
    public Pekerja(double gaji, int year, int month, int day, int jumlahAnak,
                   String nama, String nik, boolean jenisKelamin, boolean menikah) {
        super(nama, nik, jenisKelamin, menikah);
        this.gaji = gaji;
        this.tahunMasuk = LocalDate.of(year, month, day);
        this.jumlahAnak = jumlahAnak;
    }

    // Getter & Setter
    public double getGajiPokok() { return gaji; }
    public void setGaji(double gaji) { this.gaji = gaji; }

    public LocalDate getTahunMasuk() { return tahunMasuk; }
    public void setTahunMasuk(LocalDate tahunMasuk) { this.tahunMasuk = tahunMasuk; }

    public int getJumlahAnak() { return jumlahAnak; }
    public void setJumlahAnak(int jumlahAnak) { this.jumlahAnak = jumlahAnak; }

    public int getLamaBekerja() {
        //return LocalDate.now().getYear() - tahunMasuk.getYear();
        return Period.between(tahunMasuk, LocalDate.now()).getYears();
    }

    public double getBonus() {
        int lama = getLamaBekerja();
        if (lama > 10)     return gaji * 0.15;
        else if (lama > 5) return gaji * 0.10;
        else               return gaji * 0.05;
    }

    @Override
    public double getTunjangan() {
        // Tunjangan dasar + $20 per anak
        return super.getTunjangan() + (jumlahAnak * 20.0);
    }

    public double getGaji() {
        return gaji + getBonus();
    }

    @Override
    public double getPendapatan() {
        return getGaji() + getTunjangan();
    }

    @Override
    public String toString() {
        // Format tahunMasuk: day month year (sesuai contoh: "2 3 2016")
        String tgl = tahunMasuk.getDayOfMonth() + " " +
                     tahunMasuk.getMonthValue() + " " +
                     tahunMasuk.getYear();

        return super.toString() +
               "\ntahunMasuk   : " + tgl +
               "\njumlahAnak   : " + jumlahAnak +
               "\ngaji         : $" + gaji;
    }
}