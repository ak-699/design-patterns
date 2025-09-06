package structural.facade.service;

public class RoomService {
    public void assignRoom(String guestName, String roomNo) {
        System.out.println("Room " + roomNo + " booked for " + guestName);
    }

    public void cleanRoom(String roomNo) {
        System.out.println("Room " + roomNo + " cleaned.");
    }
}
