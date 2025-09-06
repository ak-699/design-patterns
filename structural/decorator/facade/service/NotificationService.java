package structural.decorator.facade.service;

public class NotificationService {
    public void sendBookingConfirmation(String guest, String room) {
        System.out.println("Booking confirmation sent to " + guest + " for room: " + room);
    }

    public void sendCheckoutConfirmation(String guest, String room) {
        System.out.println("Booking checkout sent to " + guest + " for room: " + room);
    }
}
