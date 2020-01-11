using System;
namespace visibility
{
    public class Address
    {

        public Address(int number, string line2, string city,
            string state, string zipcode)
        {
            Number = number;
            Street = line2;
            City = city;
            State = state;
            Zip = zipcode;
        }

        public int Number { get; set; }
        public string Street { get; set; }
        public string City { get; set; }
        public string State { get; set; }
        public string Zip { get; set; }

        public override string ToString()
        {
            return "Address: " + Environment.NewLine +
                +Number+" "+ Street + Environment.NewLine + City +
                ", "+State+", "+ Environment.NewLine + Zip;
        }
    }
}
