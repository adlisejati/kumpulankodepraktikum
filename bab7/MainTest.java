package bab7;

import java.text.NumberFormat;
import java.util.Locale;

public class MainTest {
    public static void main(String[] args) {

        NumberFormat rupiah = NumberFormat.getCurrencyInstance(new Locale("id", "ID"));
        int bulanSekarang = 4;

        Employee[] employees = new Employee[5];

        employees[0] = new SalariedEmployee("Daniel", "135", "1990-04-10", 8000000);
        employees[1] = new HourlyEmployee("Karina", "234", "1995-03-05", 50000, 160);
        employees[2] = new CommissionEmployee("Keanu", "145", "1992-04-21", 10000000, 0.06);
        employees[3] = new BasePlusCommissionEmployee("Bondan", "234", "1993-02-11", 5000000, 0.04, 3000000);
        employees[4] = new PieceWorkerEmployee("Rina", "567", "1998-04-15", 200, 10000);

        System.out.println("===========================================");
        System.out.println("        SISTEM PENGGAJIAN KARYAWAN");
        System.out.println("===========================================\n");

        for (Employee emp : employees) {

            System.out.println("-------------------------------------------");
            System.out.printf("%-18s : %s\n", "Tipe Karyawan", emp.getClass().getSimpleName());
            System.out.printf("%-18s : %s\n", "Nama", emp.getName());
            System.out.printf("%-18s : %s\n", "No KTP", emp.getNoKTP());
            System.out.printf("%-18s : %s\n", "Tanggal Lahir", emp.getTanggalLahir());

            double gaji = emp.earnings();

            if (emp instanceof SalariedEmployee) {
                System.out.printf("%-18s : %s\n", "Gaji Bulanan", rupiah.format(gaji));
            } else if (emp instanceof HourlyEmployee) {
                HourlyEmployee h = (HourlyEmployee) emp;
                System.out.printf("%-18s : %s\n", "Upah per Jam", rupiah.format(h.getWage()));
                System.out.printf("%-18s : %d jam\n", "Total Jam", h.getHours());
            } else if (emp instanceof CommissionEmployee) {
                CommissionEmployee c = (CommissionEmployee) emp;
                System.out.printf("%-18s : %s\n", "Total Penjualan", rupiah.format(c.getGrossSales()));
                System.out.printf("%-18s : %.2f\n", "Rate Komisi", c.getCommissionRate());
            }

            else if (emp instanceof PieceWorkerEmployee) {
                PieceWorkerEmployee p = (PieceWorkerEmployee) emp;
                System.out.printf("%-18s : %d\n", "Jumlah Barang", p.getJumlahBarang());
                System.out.printf("%-18s : %s\n", "Upah per Barang", rupiah.format(p.getUpahPerBarang()));
            }

            if (emp.getBulanLahir() == bulanSekarang) {
                System.out.printf("%-18s : %s\n", "Bonus Ulang Tahun", rupiah.format(100000));
                gaji += 100000;
            }

            System.out.printf("%-18s : %s\n", "TOTAL GAJI", rupiah.format(gaji));
            System.out.println("-------------------------------------------\n");
        }

        System.out.println("=========== DATA TIPE OBJECT ===========");
        for (int i = 0; i < employees.length; i++) {
            System.out.printf("Index %d -> %s\n", i, employees[i].getClass().getName());
        }
    }
}