package hotelmanagementsystem.modules;

import hotelmanagementsystem.modules.BaseRoomCharge;

public class RoomCharge extends BaseRoomCharge {

    Double cost;

    public RoomCharge(BaseRoomCharge roomCharge) {
        super(roomCharge);
    }


    @Override
    public Double getCost() {
        return cost;
    }

    public void setCost(Double cost) {
        this.cost = cost;
    }

}
