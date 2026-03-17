public class Mobil {

    private String noPlat;
    private String warna;
    private String manufaktur;
    private double kecepatan;
    private double waktu;

    public void setNoPlat(String s) {
        noPlat = s;
    }

    public void setWarna(String s) {
        warna = s;
    }

    public void setManufaktur(String s) {
        manufaktur = s;
    }

    public void setKecepatan(double n) {
        kecepatan = rubahKecepatan(n);
    }

    public void setWaktu(double w) {
        waktu = rubahSekon(w);
    }

    private double rubahSekon(double jam) {
        return jam * 3600;
    }

    private double rubahKecepatan(double kmPerJam) {
        return kmPerJam / 3.6;
    }

    public double hitungJarak() {
        return kecepatan * waktu;
    }

    public void displayMessage() {
        System.out.println("Mobil anda adalah bermerek " + manufaktur);
        System.out.println("mempunyai nomor plat " + noPlat);
        System.out.println("serta memiliki warna " + warna);
        System.out.println("dan memiliki kecepatan " + kecepatan + " m/s");
        System.out.println("dengan waktu tempuh " + waktu + " sekon");
        // System.out.println("Jarak tempuh mobil adalah " + hitungJarak() + " meter");
        double jarakKm = hitungJarak() / 1000;
        System.out.println("Jarak tempuh mobil adalah " + jarakKm + " Km");
    }
}