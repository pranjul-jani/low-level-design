package hotelmanagementsystem.modules;

import java.sql.Timestamp;
import java.util.List;

public class HouseKeeper extends Person {

    List<Room> getRoomServiced(List<Room> allRooms, Timestamp startTime, Timestamp endTime) {
        return allRooms;
    }

}
