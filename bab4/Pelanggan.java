package bab4;

import java.text.NumberFormat;
import java.util.Locale;

class Pelanggan {
    protected String noPelanggan;
    protected String nama;
    protected double saldo;
    private String pin;
    private int percobaan = 0;
    protected boolean isBlocked = false;

    public Pelanggan(String noPelanggan, String nama, double saldo, String pin) {
        this.noPelanggan = noPelanggan;
        this.nama = nama;
        this.saldo = saldo;
        this.pin = pin;
    }

    protected String formatRupiah(double uang) {
        NumberFormat nf = NumberFormat.getCurrencyInstance(new Locale("id", "ID"));
        return nf.format(uang);
    }

    public boolean login(String inputPin) {
        if (isBlocked) {
            System.out.println("Akun diblokir.");
            return false;
        }

        if (pin.equals(inputPin)) {
            percobaan = 0;
            return true;
        } else {
            percobaan++;
            System.out.println("PIN salah.");

            if (percobaan >= 3) {
                isBlocked = true;
                System.out.println("Akun diblokir karena 3 kali kesalahan.");
            }
            return false;
        }
    }

    public void topUp(double jumlah) {
        saldo += jumlah;
        System.out.println("Top up berhasil.");
        System.out.println("Saldo sekarang: " + formatRupiah(saldo));
    }

    public void beli(double jumlah) {
        System.out.println("Metode belum diimplementasikan.");
    }
}