public class Audience {
    private Bag bag;

    public Audience(Bag bag) {
        this.bag = bag;
    }

    public boolean hasInvitation() {
        return bag.hasInvitation();
    }

    public void setTicket(Ticket ticket) {
        bag.setTicket(ticket);
    }

    public Long bill(Long amount) {
        return bag.minusAmount(amount);
    }

}
