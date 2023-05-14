//package hotelmanagementsystem;
//
//import java.util.ArrayList;
//import java.util.Date;
//import java.util.List;
//
//class Hotel {
//    Long id;
//    String name;
//    Location hotelLocation;
//    List<Room> roomList;
//}
//
//class Location {
//    Long pincode;
//    String street;
//    String area;
//    String city;
//    String country;
//}
//
//class Room {
//    String roomNumber;
//    RoomStyle roomStyle;
//    RoomStatus roomStatus;
//    Double bookingPrice;
//    List<RoomKey> roomKeys;
//    List<HouseKeepingLog> houseKeepingLogs;
//}
//
//enum RoomStyle {
//    STANDARD, DELUX, FAMILY_SUITE
//}
//
//enum RoomStatus {
//    AVAILABLE, RESERVED, NOT_AVAILABLE, OCCUPIED, SERVICE_IN_PROGRESS
//}
//
//class RoomKey {
//    String id;
//    String barCode;
//    Date issuedAt;
//    Boolean isActive;
//    Boolean isMaster;
//
//    public void assignRoom(Room room) {
//
//    }
//}
//
//class HouseKeepingLog {
//    String description;
//    Date startDate;
//    Long duration;
//    HouseKeeper houseKeeper;
//
//    public void addRoom(Room room) {
//
//    }
//
//}
//
//abstract class Person {
//    String name;
//    Account accountDetail;
//    String phone;
//}
//
//class Account {
//    String username;
//    String password;
//    AccountStatus accountStatus;
//}
//
//enum AccountStatus {
//    ACTIVE, CLOSED, BLOCKED
//}
//
//class HouseKeeper extends Person {
//    public List<Room> getRoomServiced(Date date) {
//        return new ArrayList<Room>();
//    }
//}
//
//class Guest extends Person {
//    Search searchObj;
//    Booking bookingObj;
//
//    public List<RoomBooking> getAllRoomBookings() {
//        return new ArrayList<RoomBooking>();
//    }
//}
//
//class Receptionist extends Person {
//    Search searchObj;
//    Booking bookingObj;
//
//    public void checkInGuest(Guest guest, RoomBooking bookingInfo) {
//
//    }
//
//    public void checkOutGuest(Guest guest, RoomBooking bookingInfo) {
//
//    }
//
//}
//
//class Admin extends Person {
//    public void addRoom(Room room) {
//
//    }
//
//    public void deleteRoom(String roomId) {
//
//    }
//
//    public void editRoom(Room room) {
//
//    }
//}
//
//class Search {
//
//    public List<Room> seachRoom(RoomStyle roomStyle, Date startDate) {
//        return new ArrayList<Room>();
//    }
//}
//
//class Booking {
//    public RoomBooking createBooking(Guest guestInfo) {
//        return new RoomBooking();
//    }
//
//    public RoomBooking cancelBooking(Long bookingId) {
//        return new RoomBooking();
//    }
//}
//
//class RoomBooking {
//    String bookingId;
//    Date startDate;
//    Long durationInDays;
//    BookingStatus
//}
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//public class HotelManagementSystemApp {
//}
