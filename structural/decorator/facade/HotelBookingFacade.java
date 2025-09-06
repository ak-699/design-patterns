package structural.decorator.facade;

import structural.decorator.facade.service.BillingService;
import structural.decorator.facade.service.NotificationService;
import structural.decorator.facade.service.RoomService;

public class HotelBookingFacade {
    RoomService roomService = new RoomService();
    BillingService billingService = new BillingService();
    NotificationService notificationService = new NotificationService();

    public void bookRoom(String guest, String room, double deposit) {
        roomService.assignRoom(guest, room);
        billingService.payDeposit(guest, deposit);
        notificationService.sendBookingConfirmation(guest, room);
    }

    public void checkout(String guest, String room, double total) {
        roomService.cleanRoom(room);
        billingService.generateInvoice(guest, total);
        notificationService.sendCheckoutConfirmation(guest, room);
    }
}
