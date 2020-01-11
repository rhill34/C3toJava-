package client;

import visibility.*;

public class EmployeeTester {

    public static void main(String[] args) {
        Address address = new Address(1000, "1st St.", "Seattle", "WA","98121-5566");
        System.out.println(address);
        HourlyEmployee employee = new HourlyEmployee("Jerome","Smith",address,Position.CASHIER,25.0,15.00);
        System.out.println(employee);
    }

}
