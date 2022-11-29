
public class Hotel {

    String type;
    String price;
    String bedAvail;
    String city;

    @Override
    public String toString() {
        return "Hotel{" +
                "type='" + type + '\'' +
                ", price='" + price + '\'' +
                ", bedAvail='" + bedAvail + '\'' +
                ", city='" + city + '\'' +
                '}';
    }
}
