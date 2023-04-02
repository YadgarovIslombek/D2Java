package lesson23;

public class Address {
    private String country;
    private String discrict;

    private String city;

    private String street;

    private int homeNumber;

    public Address(String country, String discrict, String city, String street, int homeNumber) {
        this.country = country;
        this.discrict = discrict;
        this.city = city;
        this.street = street;
        this.homeNumber = homeNumber;
    }

    @Override
    public String toString() {
        return "Address{" +
                "country='" + country + '\'' +
                ", discrict='" + discrict + '\'' +
                ", city='" + city + '\'' +
                ", street='" + street + '\'' +
                ", homeNumber=" + homeNumber +
                '}';
    }
}
