package bab7;

public class SalariedEmployee extends Employee {
    private double monthlySalary;

    public SalariedEmployee(String name, String noKTP, String tanggalLahir, double salary) {
        super(name, noKTP, tanggalLahir);
        this.monthlySalary = salary;
    }

    @Override
    public double earnings() {
        return monthlySalary;
    }
}