package regex;

import java.util.Objects;

class Employee{
    private String name;
 //   private String surname;
    private String country;
    private String city;
    private String street;
    private int houseNumber;
    private String flat;
    private String email;
    private String postCode;
    private String phoneNumber;

    public Employee(String name, String country, String city, String street, int houseNumber,
                    String flat, String email, String postCode, String phoneNumber) {
        this.name = name;
        this.country = country;
        this.city = city;
        this.street = street;
        this.houseNumber = houseNumber;
        this.flat = flat;
        this.email = email;
        this.postCode = postCode;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public int getHouseNumber() {
        return houseNumber;
    }

    public void setHouseNumber(int houseNumber) {
        this.houseNumber = houseNumber;
    }

    public String getFlat() {
        return flat;
    }

    public void setFlat(String flat) {
        this.flat = flat;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPostCode() {
        return postCode;
    }

    public void setPostCode(String postCode) {
        this.postCode = postCode;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return Objects.equals(name, employee.name) &&
                Objects.equals(country, employee.country) &&
                Objects.equals(city, employee.city) &&
                Objects.equals(street, employee.street) &&
                Objects.equals(houseNumber, employee.houseNumber) &&
                Objects.equals(flat, employee.flat) &&
                Objects.equals(email, employee.email) &&
                Objects.equals(postCode, employee.postCode) &&
                Objects.equals(phoneNumber, employee.phoneNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, country, city, street, houseNumber, flat, email, postCode, phoneNumber);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", country='" + country + '\'' +
                ", city='" + city + '\'' +
                ", street='" + street + '\'' +
                ", houseNumber='" + houseNumber + '\'' +
                ", flat='" + flat + '\'' +
                ", email='" + email + '\'' +
                ", postCode='" + postCode + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }

    public String print() {
        return name +
                ", " + country  +
                ", " + city +
                ", " + street + " street, " +
                 houseNumber +
                ", Flat " + flat +
                ", email: " + email +
                ", PostCode: " + postCode +
                ", Phone number: " + phoneNumber+";";
    }
}
