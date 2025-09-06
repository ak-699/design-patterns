package structural.facade;

import structural.facade.service.BillingService;
import structural.facade.service.NotificationService;
import structural.facade.service.RoomService;

public class HotelBookingFacade {
    private final RoomService roomService = new RoomService();
    private final BillingService billingService = new BillingService();
    private final NotificationService notificationService = new NotificationService();

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
