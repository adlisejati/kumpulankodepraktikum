package bab7;

public class PieceWorkerEmployee extends Employee {
    private int jumlahBarang;
    private double upahPerBarang;

    public PieceWorkerEmployee(String name, String noKTP, String tanggalLahir, int jumlahBarang, double upahPerBarang) {
        super(name, noKTP, tanggalLahir);
        this.jumlahBarang = jumlahBarang;
        this.upahPerBarang = upahPerBarang;
    }

    public int getJumlahBarang() {
        return jumlahBarang;
    }

    public double getUpahPerBarang() {
        return upahPerBarang;
    }

    @Override
    public double earnings() {
        return jumlahBarang * upahPerBarang;
    }
}