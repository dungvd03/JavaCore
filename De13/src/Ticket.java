import org.bson.types.ObjectId;

public class Ticket {
    private ObjectId id;
    private String ticketId;
    private Event event;
    private String ticketType;
    private double ticketPrice;
    private int quantity;

    // Constructor
    public Ticket(String ticketId, Event event, String ticketType, double ticketPrice, int quantity) {
        this.ticketId = ticketId;
        this.event = event;
        this.ticketType = ticketType;
        this.ticketPrice = ticketPrice;
        this.quantity = quantity;
    }

    public Ticket() {

    }

    // Getters và Setters
    public ObjectId getId() { return id; }
    public String getTicketId() { return ticketId; }
    public Event getEvent() { return event; }
    public String getTicketType() { return ticketType; }
    public double getTicketPrice() { return ticketPrice; }
    public int getQuantity() { return quantity; }

    public void setTicketId(String ticketId) { this.ticketId = ticketId; }
    public void setEvent(Event event) { this.event = event; }
    public void setTicketType(String ticketType) { this.ticketType = ticketType; }
    public void setTicketPrice(double ticketPrice) { this.ticketPrice = ticketPrice; }
    public void setQuantity(int quantity) { this.quantity = quantity; }
}
