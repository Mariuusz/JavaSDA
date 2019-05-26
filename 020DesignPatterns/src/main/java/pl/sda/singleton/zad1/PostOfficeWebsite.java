package pl.sda.singleton.zad1;

public class PostOfficeWebsite {
    public Ticket getTicket() {
        int ticketNumber = TicketGenerator.INSTANCE.generateNumber();
        Ticket ticket = new Ticket(ticketNumber);
        ticket.setFromWho("Website");

        return ticket;
    }
}