package hotelmanagementsystem.modules;

import hotelmanagementsystem.modules.BaseRoomCharge;
import hotelmanagementsystem.modules.BookingStatus;
import hotelmanagementsystem.modules.Guest;
import hotelmanagementsystem.modules.Room;

import java.util.Date;
import java.util.List;

public class RoomBooking {

    private String bookingId;
    private Date startDate;
    private Date endDate;
    private BookingStatus bookingStatus;
    List<Guest> guestList;
    List<Room> bookedRoomList;
    BaseRoomCharge baseRoomCharge;

}
