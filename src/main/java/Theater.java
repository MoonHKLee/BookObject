public class Theater {
    private TicketSeller ticketSeller;

    public Theater(TicketSeller ticketSeller) {
        this.ticketSeller = ticketSeller;
    }

    public void enter(Audience audience) {
        if (audience.hasInvitation()) {
            Ticket ticket = ticketSeller.getTicketFromOffice();
            audience.setTicket(ticket);
        } else {
            Ticket ticket = ticketSeller.getTicketFromOffice();
            Long fee = audience.bill(ticket.getFee());
            ticketSeller.addFeeToOffice(fee);
            audience.setTicket(ticket);
        }
    }
}
