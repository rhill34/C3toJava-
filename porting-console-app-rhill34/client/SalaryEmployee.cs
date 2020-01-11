using System;
using visibility;

namespace client
{
    public class SalaryEmployee : Employee
    {
        public SalaryEmployee(String fName, String lName, Address address, Position position, double salary) : base(fName, lName, address, position)
        {
            Salary = salary;

        }

        public double Salary { get; set; }

        public override string ToString()
        {
            return "Salaried: " + base.ToString();
        }
    }
}
