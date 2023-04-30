import java.util.Optional;

public class Student {
    private String name;
    public Optional<Address> address;

    public Optional<Address> getAddress() {
        return address;
    }

    public Student(String name, Optional<Address> address) {
        this.name = name;
        this.address = address;
    }

    public Student(String name) {
        this(name, null);
        this.address = Optional.empty(); // тут оч долго думал поч не работал Optional и выкидует ошибку.
    }

    public String getName() {
        return name;
    }
}