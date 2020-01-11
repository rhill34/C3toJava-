package visibility;

public class Employee {
    protected String fName;
    protected String lName; //package
    private Address address;
    private Position position;
    public Employee(String fName, String lName, Address address, Position position) {
        super();
        this.fName = fName;
        this.lName = lName;
        this.address = address;
        this.position = position;
    }

    public String getFullName() {
        return fName + " " + lName;
    }

    public Position getPosition() {
        return position;
    }
    @Override
    public String toString() {
        return "Employee "+ this.getFullName() + "\n"+ address + "\nPosition=" + position;

    }


}
