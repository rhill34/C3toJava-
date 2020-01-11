package visibility;

public class Address {
    private int number;
    private String street;
    private String city;
    private String state;
    private String zipcode;


    public Address(int number, String line2, String city, String state, String zipcode) {
        this.number = number;
        this.street = line2;
        this.city = city;
        this.state = state;
        this.zipcode = zipcode;
    }


    @Override
    public String toString() {
        return "Address:  \n" + number + " " + street + "\n" + city + ", " + state + "\n       "+zipcode;

    }

}