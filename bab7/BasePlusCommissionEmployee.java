package bab7;

public class BasePlusCommissionEmployee extends CommissionEmployee {
    private double baseSalary;

    public BasePlusCommissionEmployee(String name, String noKTP, String tanggalLahir,
            double sales, double rate, double baseSalary) {
        super(name, noKTP, tanggalLahir, sales, rate);
        this.baseSalary = baseSalary;
    }

    @Override
    public double earnings() {
        return super.earnings() + baseSalary;
    }
}