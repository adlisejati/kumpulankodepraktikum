package bab4;

class Gold extends Pelanggan {

    public Gold(String noPelanggan, String nama, double saldo, String pin) {
        super(noPelanggan, nama, saldo, pin);
    }

    @Override
    public void beli(double jumlah) {
        double cashback;

        if (jumlah > 1000000) {
            cashback = jumlah * 0.07;
        } else {
            cashback = jumlah * 0.02;
        }

        if (saldo - jumlah < 10000) {
            System.out.println("Transaksi gagal. Saldo tidak mencukupi.");
        } else {
            saldo -= jumlah;
            saldo += cashback;

            System.out.println("Pembelian berhasil.");
            System.out.println("Cashback: " + formatRupiah(cashback));
            System.out.println("Saldo sekarang: " + formatRupiah(saldo));
        }
    }
}