package hotelmanagementsystem.modules;

import hotelmanagementsystem.modules.BaseRoomCharge;

public class InRoomPurchaseCharge extends BaseRoomCharge {

    Double cost;
    BaseRoomCharge roomCharge;

    public InRoomPurchaseCharge(BaseRoomCharge roomCharge) {
        super(roomCharge);
    }

    @Override
    public Double getCost() {
        return roomCharge.getCost() + cost;
    }

}
