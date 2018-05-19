import java.util.ArrayList;

public class Room extends ArrayList<Rezervation> {

    int type;
    int roomNumber;

    Room(int type, int roomNumber) {
        this.type = type;
        this.roomNumber = roomNumber;
    }
}
