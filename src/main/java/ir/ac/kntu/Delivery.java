package ir.ac.kntu;

public class Delivery {

    private double rate;
    private Transport transport;
    private SalaryType salaryType;
    private int salary;
    private DaysOfWeek presence;

    public Delivery(double rate, Transport transport, SalaryType salaryType, int salary, DaysOfWeek presence) {
        this.rate = rate;
        this.transport = transport;
        this.salaryType = salaryType;
        this.salary = salary;
        this.presence = presence;
    }

    public Delivery() {
    }
}
