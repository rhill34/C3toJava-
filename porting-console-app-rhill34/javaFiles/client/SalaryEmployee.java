package client;

import visibility.Address;
import visibility.Employee;
import visibility.Position;

public class SalaryEmployee extends Employee {

    private double salary;

    public SalaryEmployee(String fName, String lName, Address address, Position position,double salary) {
        super(fName, lName, address, position);
        // TODO Auto-generated constructor stub
        this.salary = salary;
    }

    public String toString() {
        //String lname = super.lName; // package access
        String fname = super.fName; // protected access
        return "Salaried "+super.toString();
    }

}
