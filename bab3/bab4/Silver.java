package bab4;

class Silver extends Pelanggan {

    public Silver(String noPelanggan, String nama, double saldo, String pin) {
        super(noPelanggan, nama, saldo, pin);
    }

    @Override
    public void beli(double jumlah) {
        double cashback = 0;

        if (jumlah > 1000000) {
            cashback = jumlah * 0.05;
        }

        double total = jumlah - cashback;

        if (saldo - total < 10000) {
            System.out.println("Transaksi gagal. Saldo tidak mencukupi.");
        } else {
            saldo -= total;
            System.out.println("Pembelian berhasil.");
            System.out.println("Cashback: " + formatRupiah(cashback));
            System.out.println("Saldo sekarang: " + formatRupiah(saldo));
        }
    }
}