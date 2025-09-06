package structural.facade.service;

public class BillingService {
    public void payDeposit(String guest, double amount) {
        System.out.println(guest + " paid deposity Rs." + amount);
    }

    public void generateInvoice(String guest, double total) {
        System.out.println("Invoice generated for " + guest + " of Total: " + total);
    }
}
