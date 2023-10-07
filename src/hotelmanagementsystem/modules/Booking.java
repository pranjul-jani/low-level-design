package hotelmanagementsystem.modules;

public class Booking {

    public RoomBooking createBooking(Guest guestInfo) {
        return new RoomBooking();
    }

    public RoomBooking cancelBooking(Long bookingId) {
        return new RoomBooking();
    }

}
