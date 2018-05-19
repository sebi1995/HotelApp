import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Room room = new Room(1, 14);

        room.add(new Rezervation("tom", 15));
        room.add(new Rezervation("bill", 12));

        for (Rezervation rezz : room) {
            System.out.println(rezz.getName() + " : " + rezz.getDate());
        }
    }
}
