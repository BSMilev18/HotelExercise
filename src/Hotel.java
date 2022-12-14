import java.util.Iterator;

public class Hotel {
    String name;
    int id;
    boolean familyStatus;
    int stays;
    double bedPrice;
    String town;

    public Hotel(String name, int id, boolean familyStatus, int stays, double bedPrice, String town) {
        this.name = name;
        this.id = id;
        this.familyStatus = familyStatus;
        this.stays = stays;
        this.bedPrice = bedPrice;
        this.town = town;
    }
    public Hotel() {}

    @Override
    public String toString() {
        return "Hotel{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", familyPosition=" + familyStatus +
                ", stays=" + stays +
                ", bedPrice=" + bedPrice +
                ", town='" + town + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public boolean isFamilyStatus() {
        return familyStatus;
    }

    public int getStays() {
        return stays;
    }

    public double getBedPrice() {
        return bedPrice;
    }

    public String getTown() {
        return town;
    }
}
