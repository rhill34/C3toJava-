package visibility;

public class HourlyEmployee extends Employee {

    private double hours;
    private double wages;

    public HourlyEmployee(String fName, String lName, Address address, Position position, double hours, double wages) {
        super(fName, lName, address, position);
        this.hours=hours;
        this.wages=wages;

    }

    public double calculatePay() {
        double total = hours * wages;

        if(hours > 40)
            total += 0.5 * (hours - 40);

        return total;
    }

    public String toString() {
        String lname = super.lName;
        String fname = super.fName;
        return "Hourly"+super.toString();
    }

}
