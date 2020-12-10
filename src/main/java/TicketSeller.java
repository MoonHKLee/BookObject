public class TicketSeller {
    private TicketOffice ticketOffice;

    public TicketSeller(TicketOffice ticketOffice) {
        this.ticketOffice = ticketOffice;
    }

    public Ticket getTicketFromOffice() {
        return ticketOffice.getTicket();
    }

    public void addFeeToOffice(Long amount) {
        ticketOffice.plusAmount(amount);
    }

}
