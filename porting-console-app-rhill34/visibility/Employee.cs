using System;
namespace visibility
{
    public class Employee
    {
        public Employee(string fName, string lName, Address address, Position position)
        {
            FName = fName;
            LName = lName;
            Address = address;
            Position = position;
        }

        protected string FName { get; set; }
        protected string LName { get; set; }

        //Creates the Employee Full Name
        public string FullName
        {
            get
            {
                string x = FName + ' ' + LName;
                return x;
            }
        }

        public Address Address { get; set; }
        public Position Position { get; set; }

        public override string ToString()
        {
            return "Employee: " + Environment.NewLine +
                "Position: " + Position + Environment.NewLine +
                "Full Name: " + FullName + Environment.NewLine +
                 Address;
        }
    }
}
