public class Audience {
    private Bag bag;

    public Audience(Bag bag) {
        this.bag = bag;
    }

    private Bag getBag() {
        return bag;
    }

    public boolean hasInvitation() {
        return getBag().hasInvitation();
    }

    public void setTicket(Ticket ticket) {
        getBag().setTicket(ticket);
    }

    public Long bill(Long amount) {
        return getBag().minusAmount(amount);
    }

}
