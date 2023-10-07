package hotelmanagementsystem.modules;

public class RoomServiceCharge extends BaseRoomCharge {

    Double cost;
    RoomCharge roomCharge;

    public RoomServiceCharge(BaseRoomCharge roomCharge) {
        super(roomCharge);
    }

    @Override
    public Double getCost() {
        return roomCharge.getCost() + cost;
    }

}
