
import java.util.ArrayList;
import java.util.Scanner;

public class HotelMain {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Hotel hotel = new Hotel();

        System.out.println("Enter type of Room Available Ac or Non Ac :");
        hotel.type = sc.nextLine();
        System.out.println("Enter Price for the Room :");
        hotel.price = sc.nextLine();
        System.out.println("Enter No of Bed Available :");
        hotel.bedAvail = sc.next();
        System.out.println("Enter the city name :");
        hotel.city = sc.next();
        System.out.println(hotel.toString());

        ArrayList<String> list = new ArrayList<String>();
        list.add("Type of bed :" + hotel.type);
        list.add("Prcie of the Room :" + hotel.price);
        list.add("No of Bed Available :" + hotel.bedAvail);
        list.add("Enter Your city :" + hotel.city);
        System.out.println(list);

    }

}
