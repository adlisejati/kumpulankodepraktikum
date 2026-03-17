package bab2;

public class RasionalDemo {
    public static void main(String[] args) {
        Rasional R1 = new Rasional(1, 2);
        Rasional R2 = new Rasional(1, 3);

        System.out.println("R1.isRasional: " + R1.isRasional());
        System.out.println("R2.isRasional: " + R1.isRasional());
        System.out.println();

        System.out.println("R1 > R2 : " + R1.moreThan(R2));
        System.out.println("R1 < R2 : " + R1.lessThan(R2));
        System.out.println("R1 <= R2 : " + R1.lessThanOrEqual(R2));
        System.out.println("R1 >= R2 : " + R1.moreThanOrEqual(R2));
        System.out.println();

        System.out.print("R1 : ");
        R1.cetak();
        System.out.print("R2 : ");
        R2.cetak();
        System.out.println();

        R1.Sederhana();
        R2.Sederhana();

        System.out.print("R1 : ");
        R1.cetak();
        System.out.print("R2 : ");
        R2.cetak();
        System.out.println();

        System.out.println("Setelah dilakukan Cast ke double menjadi : ");
        System.out.println("R1 : " + R1.Cast());
        System.out.println("R2 : " + R2.Cast());
        System.out.println();

        R1.negasi();
        System.out.print("Unary- dari R1 : ");
        R1.cetak();
        System.out.println();

        R1.unaryPlus(R2);
        System.out.print("Nilai dari 'R1 += R2' : ");
        R1.cetak();
        System.out.println();

        // Operasi tambahan
        Rasional R3 = new Rasional(1, 2);
        R3.kurang(R2);
        System.out.print("Nilai dari 'R3 - R2' : ");
        R3.cetak();
        System.out.println();

        Rasional R4 = new Rasional(1, 2);
        R4.kali(R2);
        System.out.print("Nilai dari 'R4 * R2' : ");
        R4.cetak();
        System.out.println();

        Rasional R5 = new Rasional(1, 2);
        R5.bagi(R2);
        System.out.print("Nilai dari 'R5 / R2' : ");
        R5.cetak();
        System.out.println();
    }
}