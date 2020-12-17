public class TicketSeller {
    private TicketOffice ticketOffice;

    public TicketSeller(TicketOffice ticketOffice) {
        this.ticketOffice = ticketOffice;
    }

    private void addFeeToOffice(Long amount) {
        ticketOffice.plusAmount(amount);
    }

    public void changeOrSellTicket(Audience audience) {
        Ticket ticket = ticketOffice.getTicket();

        if (!audience.hasInvitation()) {
            Long fee = audience.bill(ticket.getFee());
            addFeeToOffice(fee);
        }

        audience.setTicket(ticket);
    }

}
