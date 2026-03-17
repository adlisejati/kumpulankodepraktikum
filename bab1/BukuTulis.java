public class BukuTulis {

    private int jumlahLembar;
    private int kataPerHari;
    private double lembarPerHari;

    public BukuTulis(int jumlahLembar, int kataPerHari, double lembarPerHari) {
        this.jumlahLembar = jumlahLembar;
        this.kataPerHari = kataPerHari;
        this.lembarPerHari = lembarPerHari;
    }

    public double hitungLamaHari() {
        return jumlahLembar / lembarPerHari;
    }

    public void displayInfo() {
        System.out.println("Jumlah lembar buku      : " + jumlahLembar);
        System.out.println("Jumlah kata per hari    : " + kataPerHari);
        System.out.println("Lembar ditulis per hari : " + lembarPerHari);
        System.out.println("Waktu yang dibutuhkan   : " + hitungLamaHari() + " hari");
    }
}