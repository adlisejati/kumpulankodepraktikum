package bab7;

public class CommissionEmployee extends Employee {
    private double grossSales;
    private double commissionRate;

    public CommissionEmployee(String name, String noKTP, String tanggalLahir,
            double sales, double rate) {
        super(name, noKTP, tanggalLahir);
        this.grossSales = sales;
        this.commissionRate = rate;
    }

    public double getGrossSales() {
        return grossSales;
    }

    public double getCommissionRate() {
        return commissionRate;
    }

    @Override
    public double earnings() {
        return grossSales * commissionRate;
    }
}