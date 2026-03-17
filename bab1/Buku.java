class Buku {

    private String judul;
    private Penulis penulis;
    private Kategori kategori;
    private String sinopsis;

    // Constructor semua atribut
    public Buku(String judul, Penulis penulis, Kategori kategori, String sinopsis) {
        this.judul = judul;
        this.penulis = penulis;
        this.kategori = kategori;
        this.sinopsis = sinopsis;
    }

    public void tampilkanInfo() {
        System.out.println("Judul Buku : " + judul);
        System.out.println("Penulis    : " + penulis.getNamaPenulis());
        System.out.println("Kategori   : " + kategori.getNamaKategori());
        System.out.println("Sinopsis   : " + sinopsis);
        System.out.println("Jumlah Kata Sinopsis : " + hitungJumlahKata());
        System.out.println("--------------------------------");
    }

    // Method hitung jumlah kata
    public int hitungJumlahKata() {
        String[] kata = sinopsis.split(" ");
        return kata.length;
    }

    // Method cek kesamaan
    public double cekKesamaan(Buku bukuLain) {

        int sama = 0;
        int total = 4;

        if (this.judul.equalsIgnoreCase(bukuLain.judul)) {
            sama++;
        }

        if (this.penulis.getNamaPenulis().equalsIgnoreCase(bukuLain.penulis.getNamaPenulis())) {
            sama++;
        }

        if (this.kategori.getNamaKategori().equalsIgnoreCase(bukuLain.kategori.getNamaKategori())) {
            sama++;
        }

        if (this.sinopsis.equalsIgnoreCase(bukuLain.sinopsis)) {
            sama++;
        }

        return (sama * 100.0) / total;
    }

    
    public Buku copy() {
        return new Buku(
                this.judul,
                new Penulis(this.penulis.getNamaPenulis()),
                new Kategori(this.kategori.getNamaKategori()),
                this.sinopsis
        );
    }
}