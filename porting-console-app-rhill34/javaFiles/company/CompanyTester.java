package company;

import java.time.LocalDate;
import java.util.Arrays;

import client.SalaryEmployee;
import visibility.Address;
import visibility.HourlyEmployee;
import visibility.Position;

/**
 * A Tester Class that creates a Company and provides a menu system for the user
 * to print employee information and print employee statistics for the company
 *
 * @author suland
 *
 */
public class CompanyTester {

    // instantiate console object that allows for user input
    private static Console input = new Console();

    // declare constants for menu options
    private static final int LIST=1, STATS=2, END=3;

    // declare reference for Company
    private static Company company; //null

    public static void main(String[] args) {
        // call setupCompany() method
        setupCompany();
        int choice = 0;

        while (choice != END) {
            // call displayMenu() method
            displayMenu();
            // read in user's choice
            choice = input.readInt("Enter a choice(1-3)");
            // if choice is LIST, call printEmployees()
            if(choice==LIST)
                printEmployees();
                // if choice is STATS, call printStatistics()
            else if (choice == STATS)
                printStatistics();


        } // end of while loop
        System.out.println("Exiting, adios");

    }

    public static void setupCompany() {
        // Create a LocalDate that is initialized to the start of this
        // organization
        // LocalDate.now()
        LocalDate established = LocalDate.of(2015,07,23);

        // instantiate a Company(String name, LocalDate origination)
        company = new Company("AppsTwoEat",established);
        System.out.println(company);

        // instantiate 2 HourlyEmployees and add to the Company
        Address address = new Address(1000, "1st St.", "Seattle", "WA", "98121-5566");
        company.addEmployee(new HourlyEmployee("Jerome", "Smith", address, Position.JANITOR, 25.0, 15.00));

        address = new Address(2000, "A St.", "Auburn", "WA", "98002-1234");
        company.addEmployee(new HourlyEmployee("Janice", "Wu", address, Position.BOOKKEEPER, 20.0, 20.00));

        // instantiate 2 SalaryEmployees and add to the Company
        address = new Address(100, "8th St.", "Seattle", "WA", "98121-5566");
        company.addEmployee(new SalaryEmployee("Andy", "Orr", address, Position.MANAGER, 65600));

        address = new Address(5000, "A St.", "Auburn", "WA", "98002-1234");
        company.addEmployee(new SalaryEmployee("Ada", "Lovelace", address, Position.TECH, 98000.50));
    }

    /**
     * Displays a menu of options for the user to choose from
     */
    public static void displayMenu() {
        System.out.println();
        System.out.println("Welcome to my company! ");
        System.out.println("1. Print employee details.");
        System.out.println("2. Print employee statistics");
        System.out.println("3. Exit");
        System.out.println();

    }

    /**
     * Prints out how many hourly and salary employees are in the company
     */
    public static void printStatistics() {
        System.out.println();
        System.out.println("Number of employees: "+ company.getTotalEmployee());
        System.out.println("Number of Hourly Employees: "+ company.getNumHourlyEmployee());
        System.out.println("Number of Salary Employees: "+company.getNumSalaryEmployee());
        System.out.println();
    }

    /**
     * Prints out the employee details for all employees in the company
     */
    public static void printEmployees() {
        System.out.println(Arrays.toString(company.getEmployees()));

    }

}
