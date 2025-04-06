package atm;

public class Person {
    private String name;
    private Address address;
    private String phone;
    private String email;
    protected Person(String name, String phone, String email,String street, String city, String state, String zip, String country) {
        this.name = name;
        this.address = new Address(street, city, state, zip, country);
        this.phone = phone;
        this.email = email;
    }

    public Address getAddress() {
        return this.address;
    }
}
