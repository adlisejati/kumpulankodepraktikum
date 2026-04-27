package bab7;

public class HourlyEmployee extends Employee {
    private double wage;
    private int hours;

    public HourlyEmployee(String name, String noKTP, String tanggalLahir, double wage, int hours) {
        super(name, noKTP, tanggalLahir);
        this.wage = wage;
        this.hours = hours;
    }

    public double getWage() {
        return wage;
    }

    public int getHours() {
        return hours;
    }

    @Override
    public double earnings() {
        return wage * hours;
    }
}