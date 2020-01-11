using System;

using visibility;
using client;

namespace company
{
    public class Company
    {
        private const int MaxEmployees = 4;
        private Employee[] employees;
       

        public Company(string name, DateTime origination)
        {
            employees = new Employee[MaxEmployees];
            Name = name;
            Origination = origination;
        }

        public string Name { get; set; }
        public DateTime Origination { get; set; }

        /**
     *
     * @return the number of hourly employees in the company
     */
        public int GetNumHourlyEmployee()
        {
            int count = 0;
            // for each use if not changing contents of array
            foreach (Employee e in employees)
            {
                if (e is HourlyEmployee)
                {
                    count++;
                }
            }
            return count;
        }

        public int GetNumSalaryEmployee()
        {
            int count = 0;
            // for each use if not changing contents of array
            foreach (Employee e in employees)
            {
                if (e is SalaryEmployee)
                {
                    count++;
                }
            }
            return count;
        }

        public int getTotalEmployee()
        {
            int count = 0;
            for (int i = 0; i < employees.Length; i++)
            {
                if (employees[i] != null)
                {
                    count++;
                } //end if
            } // end for
            return count;
        }

        public bool addEmployee(Employee e)
        {

            for (int i = 0; i < employees.Length; i++)
            {
                if (employees[i] == null)
                {
                    employees[i] = e;
                    return true;
                } //end if
            } // end for
            return false;

        }

        public Employee[] GetEmployees()
        {
            return this.employees;

        }

        public override string ToString()
        {
            string emp = string.Join(", ", (object[])employees);
            return "Company[name = " + Name + ", origination = " + Origination +
                "Employees " + emp + "]";
        }
    }

}
