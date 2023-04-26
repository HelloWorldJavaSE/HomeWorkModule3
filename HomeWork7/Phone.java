import java.util.Comparator;

public class Phone implements Comparator<Phone> {
    String nameManufacturer, nameModule;
    int cost;
    public Phone(){

    }
    public Phone(String nameManufacturer, String nameModule, int cost) {
        this.nameManufacturer = nameManufacturer;
        this.nameModule = nameModule;
        this.cost = cost;
    }

    @Override
    public int compare(Phone o1,Phone o2) {
        return o1.cost - o2.cost;
    }
}
