using System;

using visibility;
using client;

namespace company
{
    public class CompanyTester
    {
        // instantiate console object that allows for user input
        //private static Console input = new Console();
        private delegate int promptInput(string a);

        private static int UserPrompt(string x)
        {
            Console.WriteLine(x);
            int a = int.Parse(Console.ReadLine());
            return a;
        }
        // declare constants for menu options
        private const int List = 1, Stats = 2, End = 3;

        // declare reference for Company
        private static Company company; //null

        
        public static void Main(String[] args)
        { 

            promptInput input = new promptInput(UserPrompt);

            // call setupCompany() method
            setupCompany();
            int choice = 0;

            while (choice != End)
            {
                // call displayMenu() method
                displayMenu();
                // read in user's choice
                choice = input("Enter a choice(1 - 3)");
                // if choice is LIST, call printEmployees()
                if (choice == List)
                    printEmployees();
                // if choice is STATS, call printStatistics()
                else if (choice == Stats)
                    printStatistics();


            } // end of while loop
            Console.WriteLine("Exiting, adios");
        }
        public static void setupCompany()
        {
            // Create a LocalDate that is initialized to the start of this
            // organization
            // LocalDate.now()
            DateTime established = new DateTime(2015, 07, 23);

            // instantiate a Company(String name, LocalDate origination)
            company = new Company("AppsTwoEat", established);
            Console.WriteLine(company);

            // instantiate 2 HourlyEmployees and add to the Company
            Address address = new Address(1000, "1st St.", "Seattle", "WA", "98121-5566");
            company.addEmployee(new HourlyEmployee(25.0, 15.00,"Jerome", "Smith", address, Position.JANITOR ));

            address = new Address(2000, "A St.", "Auburn", "WA", "98002-1234");
            company.addEmployee(new HourlyEmployee(20.0, 20.00, "Janice", "Wu", address, Position.BOOKKEEPER));

            // instantiate 2 SalaryEmployees and add to the Company
            address = new Address(100, "8th St.", "Seattle", "WA", "98121-5566");
            company.addEmployee(new SalaryEmployee("Andy", "Orr", address, Position.MANAGER, 65600));

            address = new Address(5000, "A St.", "Auburn", "WA", "98002-1234");
            company.addEmployee(new SalaryEmployee("Ada", "Lovelace", address, Position.TECH, 98000.50));
        }

        /**
     * Displays a menu of options for the user to choose from
     */
        public static void displayMenu()
        {
            Console.WriteLine();
            Console.WriteLine("Welcome to my company! ");
            Console.WriteLine("1. Print employee details.");
            Console.WriteLine("2. Print employee statistics");
            Console.WriteLine("3. Exit");
            Console.WriteLine();

        }

        /**
     * Prints out how many hourly and salary employees are in the company
     */
        public static void printStatistics()
        {
            Console.WriteLine();
            Console.WriteLine("Number of employees: " + company.getTotalEmployee());
            Console.WriteLine("Number of Hourly Employees: " + company.GetNumHourlyEmployee());
            Console.WriteLine("Number of Salary Employees: " + company.GetNumHourlyEmployee());
            Console.WriteLine();
        }

        /**
     * Prints out the employee details for all employees in the company
     */
        public static void printEmployees()
        {
           
            foreach (Employee e in company.GetEmployees())
            {
                Console.WriteLine("{0}" +Environment.NewLine,e);
            }
        }
    }
}
