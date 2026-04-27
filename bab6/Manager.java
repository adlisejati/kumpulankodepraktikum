package bab6;

public class Manager extends Pekerja {
    private String departemen;

    // Konstruktor: departemen, gaji, year, month, day, jumlahAnak, nama, nik,
    // jenisKelamin, menikah
    public Manager(String departemen, double gaji, int year, int month, int day,
            int jumlahAnak, String nama, String nik,
            boolean jenisKelamin, boolean menikah) {
        super(gaji, year, month, day, jumlahAnak, nama, nik, jenisKelamin, menikah);
        this.departemen = departemen;
    }

    // Getter & Setter
    public String getDepartemen() {
        return departemen;
    }

    public void setDepartemen(String departemen) {
        this.departemen = departemen;
    }

    @Override
    public double getTunjangan() {
        // Tunjangan induk (Pekerja) + 10% dari gaji pokok
        return super.getTunjangan() + (getGajiPokok() * 0.10);
    }

    @Override
    public String toString() {
        return super.toString() +
                "\ndepartemen   : " + departemen;
    }
}