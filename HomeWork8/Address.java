public class Address {
    private String cyti;
    private String region;

    public String getCyti() {
        return cyti;
    }

    public Address(String cyti, String region) {
        this.cyti = cyti;
        this.region = region;
    }

    public String getRegion() {
        return region;
    }
}
