public class Kunde {
    private String name;

    public Kunde() {
        // Default constructor
    }

    public Kunde(String pName) {
        this.name = pName;
    }

    public void setName(String pName) {
        name = pName;
    }

    public String getName() {
        return name;
    }
}
