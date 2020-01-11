using System;
namespace visibility
{
    public class HourlyEmployee : Employee
    {
        public HourlyEmployee(double hours, double wages, string fName,
            string lName, Address address, Position position) :
            base(fName, lName, address, position)
        {
            Hours = hours;
            Wage = wages;
        }

        //Properties
        public double Hours { get; set; }
        public double Wage { get; set; }

        public double CalculatePay()
        {
            double total = Hours * Wage;

            if(Hours > 40)
            {
                total += 0.5 + (Hours - 40);
                return total;
            }

            return total;
        }

        public override string ToString()
        {
            return base.ToString() + "Hours :" + Hours + Environment.NewLine +
                "Paid : " + Wage + Environment.NewLine +
                "Expected Pay is " + CalculatePay();
        }
    }
}
