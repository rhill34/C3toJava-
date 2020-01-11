package company;

import java.time.LocalDate;
import java.util.Arrays;

import visibility.*;
import client.SalaryEmployee;

/**
 * This class will create MAX_EMPLOYEES Employee Objects and
 * store them in an array of Employees.
 * @author Susan Uland
 *
 */
public class Company {
    // Declare a constant for the MAX_EMPLOYEES and initialize to 4
    private static final int MAX_EMPLOYEES=4;

    // Declare an Employee Array to hold MAX_EMPLOYEES Employees
    private Employee[] employees; //null
    // Declare a String to hold the company's name
    private String name; // null
    // Declare a LocalDate to hold the date the company was establish
    private LocalDate origination;  // null
    /**
     * Constructs the Employee Array to hold MAX_EMPLOYEES,
     */
    public Company(String name, LocalDate origination) {
        employees=new Employee[MAX_EMPLOYEES];
        this.name = name;
        this.origination = origination;

    }
    /**
     *
     * @return the number of hourly employees in the company
     */
    public int getNumHourlyEmployee() {
        int count=0;
        // for each use if not changing contents of array
        for(Employee e : employees) {
            if(e instanceof HourlyEmployee) {
                count++;
            }
        }
        return count;
    }

    /**
     *
     * @return the number of salary employees in the company
     */
    public int getNumSalaryEmployee() {
        int count=0;
        // for each use if not changing contents of array
        for(Employee e : employees) {
            if(e instanceof SalaryEmployee) {
                count++;
            }
        }
        return count;
    }

    /**
     *
     * @return the total number of employees in the company
     */
    public int getTotalEmployee() {
        int count=0;
        for(int i=0; i<employees.length; i++) {
            if(employees[i] != null   ) {
                count++;
            } //end if
        } // end for
        return count;
    }

    /**
     *
     * @param e Employee object to add to the Company's array of employees
     * @return true if employee successfully added to the array, false otherwise
     */
    public boolean addEmployee(Employee e) {

        for(int i=0; i<employees.length; i++) {
            if(employees[i] == null   ) {
                employees[i]=e;
                return true;
            } //end if
        } // end for
        return false;

    }
    /**
     *
     * @return the object reference for the array of employees in the company
     */

    public Employee[] getEmployees() {
        return this.employees;

    }

    @Override
    public String toString() {
        return "Company [name=" + name + ", origination=" + origination +
                "Employees "+ Arrays.toString(employees) +"]";
    }



}
