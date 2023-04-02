package lesson23;

public class User {
    private String name;

    private int yoshi;

    private Address address;     //aggregation
    public User(String name, int yoshi, Address address) {
        this.name = name;
        this.yoshi = yoshi;
        this.address = address;
    }
    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", yoshi=" + yoshi +
                ", address=" + address +
                '}';
    }
}
