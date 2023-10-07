package hotelmanagementsystem.modules;

import java.util.List;

public class Room {

    private String id;
    private RoomType roomType;
    private RoomStatus roomStatus;
    private Integer occupancy;
    private Double rate;
    private List<RoomKey> roomKeyList;
    private List<HouseKeepingLog> houseKeepingLogsList;

    void assignKey(RoomKey roomKey) {
        roomKeyList.add(roomKey);
    }

    void addHouseKeeping(HouseKeepingLog houseKeepingLog) {
        houseKeepingLogsList.add(houseKeepingLog);
    }

}
