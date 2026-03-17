public class MainBuku {

    public static void main(String[] args) {

        System.out.println("=== DAFTAR BUKU PERPUSTAKAAN ===\n");

        Kategori teknologi = new Kategori("Teknologi");
        Kategori filsafat = new Kategori("Filsafat");
        Kategori sejarah = new Kategori("Sejarah");
        Kategori agama = new Kategori("Agama");
        Kategori psikologi = new Kategori("Psikologi");
        Kategori politik = new Kategori("Politik");
        Kategori fiksi = new Kategori("Fiksi");

        System.out.println("Kategori : Teknologi\n");

        new Buku("Clean Code", new Penulis("Robert C. Martin"), teknologi,
                "Buku ini menjelaskan prinsip penting menulis kode bersih rapi mudah dipahami programmer.")
                .tampilkanInfo();

        new Buku("The Pragmatic Programmer", new Penulis("Andrew Hunt"), teknologi,
                "Buku ini membahas pendekatan praktis dalam pengembangan perangkat lunak profesional.").tampilkanInfo();

        new Buku("Introduction to Algorithms", new Penulis("Thomas H. Cormen"), teknologi,
                "Buku ini menjelaskan berbagai algoritma penting dalam ilmu komputer secara sistematis.")
                .tampilkanInfo();

        new Buku("Code Complete", new Penulis("Steve McConnell"), teknologi,
                "Buku ini memberikan panduan lengkap membangun perangkat lunak berkualitas tinggi.").tampilkanInfo();

        new Buku("Design Patterns", new Penulis("Erich Gamma"), teknologi,
                "Buku ini membahas pola desain perangkat lunak untuk menyelesaikan masalah pemrograman.")
                .tampilkanInfo();

        System.out.println("\nKategori : Filsafat\n");

        new Buku("The Republic", new Penulis("Plato"), filsafat,
                "Buku ini membahas konsep keadilan negara ideal serta pemikiran filsafat politik klasik.")
                .tampilkanInfo();

        new Buku("Meditations", new Penulis("Marcus Aurelius"), filsafat,
                "Buku ini berisi refleksi pribadi tentang kehidupan kebijaksanaan dan pengendalian diri.")
                .tampilkanInfo();

        new Buku("Beyond Good and Evil", new Penulis("Friedrich Nietzsche"), filsafat,
                "Buku ini membahas kritik moral tradisional dan pemikiran filosofis modern.").tampilkanInfo();

        new Buku("Critique of Pure Reason", new Penulis("Immanuel Kant"), filsafat,
                "Buku ini menjelaskan hubungan antara pengalaman pengetahuan dan rasio manusia.").tampilkanInfo();

        new Buku("Being and Nothingness", new Penulis("Jean-Paul Sartre"), filsafat,
                "Buku ini membahas eksistensialisme kebebasan manusia serta makna keberadaan.").tampilkanInfo();

        System.out.println("\nKategori : Sejarah\n");

        new Buku("Guns Germs and Steel", new Penulis("Jared Diamond"), sejarah,
                "Buku ini menjelaskan faktor geografis dan lingkungan dalam perkembangan peradaban manusia.")
                .tampilkanInfo();

        new Buku("The Silk Roads", new Penulis("Peter Frankopan"), sejarah,
                "Buku ini membahas jalur perdagangan kuno yang mempengaruhi perkembangan dunia.").tampilkanInfo();

        new Buku("SPQR", new Penulis("Mary Beard"), sejarah,
                "Buku ini menjelaskan sejarah kekaisaran romawi dari awal hingga masa kejayaan.").tampilkanInfo();

        new Buku("The History of the Ancient World", new Penulis("Susan Wise Bauer"), sejarah,
                "Buku ini menjelaskan perkembangan peradaban kuno dari berbagai wilayah dunia.").tampilkanInfo();

        new Buku("A Peoples History of the United States", new Penulis("Howard Zinn"), sejarah,
                "Buku ini menjelaskan sejarah amerika dari sudut pandang masyarakat biasa.").tampilkanInfo();

        System.out.println("\nKategori : Agama\n");

        new Buku("The Bible", new Penulis("Various Authors"), agama,
                "Kitab suci yang berisi ajaran keagamaan sejarah dan nilai moral umat kristiani.").tampilkanInfo();

        new Buku("The Quran", new Penulis("Allah SWT Wahyu kepada Nabi Muhammad"), agama,
                "Kitab suci umat islam yang berisi petunjuk hidup hukum dan ajaran moral.").tampilkanInfo();

        new Buku("The Bhagavad Gita", new Penulis("Vyasa"), agama,
                "Kitab suci hindu yang membahas dharma kewajiban moral dan spiritual manusia.").tampilkanInfo();

        new Buku("The Dhammapada", new Penulis("Siddhartha Gautama"), agama,
                "Kumpulan ajaran buddha yang membahas kebijaksanaan dan jalan menuju pencerahan.").tampilkanInfo();

        new Buku("Tao Te Ching", new Penulis("Lao Tzu"), agama,
                "Buku klasik filsafat tao yang membahas harmoni alam dan kehidupan manusia.").tampilkanInfo();

        System.out.println("\nKategori : Psikologi\n");

        new Buku("Thinking Fast and Slow", new Penulis("Daniel Kahneman"), psikologi,
                "Buku ini menjelaskan cara kerja pikiran manusia dalam mengambil keputusan.").tampilkanInfo();

        new Buku("Man Search for Meaning", new Penulis("Viktor Frankl"), psikologi,
                "Buku ini membahas pencarian makna hidup manusia dalam kondisi sulit.").tampilkanInfo();

        new Buku("The Power of Habit", new Penulis("Charles Duhigg"), psikologi,
                "Buku ini menjelaskan bagaimana kebiasaan terbentuk dan mempengaruhi kehidupan manusia.")
                .tampilkanInfo();

        new Buku("Emotional Intelligence", new Penulis("Daniel Goleman"), psikologi,
                "Buku ini menjelaskan pentingnya kecerdasan emosional dalam kehidupan sosial.").tampilkanInfo();

        new Buku("Drive", new Penulis("Daniel Pink"), psikologi,
                "Buku ini membahas motivasi manusia dalam bekerja belajar dan berkembang.").tampilkanInfo();

        System.out.println("\nKategori : Politik\n");

        new Buku("Madilog", new Penulis("Tan Malaka"), politik,
                "Buku ini membahas pemikiran materialisme dialektika dan logika dalam masyarakat.").tampilkanInfo();

        new Buku("Indonesia Menggugat", new Penulis("Soekarno"), politik,
                "Pidato pembelaan soekarno yang membahas perjuangan kemerdekaan indonesia.").tampilkanInfo();

        new Buku("Di Bawah Bendera Revolusi", new Penulis("Soekarno"), politik,
                "Kumpulan pidato pemikiran dan perjuangan politik presiden soekarno.").tampilkanInfo();

        new Buku("Catatan Seorang Demonstran", new Penulis("Soe Hok Gie"), politik,
                "Catatan kritis mahasiswa mengenai politik pemerintahan dan kondisi sosial.").tampilkanInfo();

        new Buku("Islam dan Politik", new Penulis("Nurcholish Madjid"), politik,
                "Buku ini membahas hubungan antara agama islam dan kehidupan politik.").tampilkanInfo();

        System.out.println("\nKategori : Fiksi\n");

        new Buku("Laskar Pelangi", new Penulis("Andrea Hirata"), fiksi,
                "Novel yang menceritakan perjuangan anak anak belitung mengejar pendidikan.").tampilkanInfo();

        new Buku("Bumi Manusia", new Penulis("Pramoedya Ananta Toer"), fiksi,
                "Novel sejarah yang menggambarkan kehidupan masyarakat masa kolonial belanda.").tampilkanInfo();

        new Buku("Negeri 5 Menara", new Penulis("Ahmad Fuadi"), fiksi,
                "Novel tentang persahabatan mimpi dan perjuangan para santri di pesantren.").tampilkanInfo();

        new Buku("Ayat Ayat Cinta", new Penulis("Habiburrahman El Shirazy"), fiksi,
                "Novel romantis religius tentang cinta kehidupan dan nilai keislaman.").tampilkanInfo();

        new Buku("Supernova", new Penulis("Dee Lestari"), fiksi,
                "Novel fiksi ilmiah yang menggabungkan sains filsafat dan spiritualitas.").tampilkanInfo();

    }
}