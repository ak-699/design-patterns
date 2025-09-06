package structural.decorator.facade;

public class FacaceDemo {
    public static void main(String[] args) {
        HotelBookingFacade facade = new HotelBookingFacade();
        facade.bookRoom("Abhishek", "305", 1400);
        System.out.println("Room booked....");
        facade.checkout("Abhishek", "305", 2499);
    }
}
