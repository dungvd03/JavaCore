import org.bson.types.ObjectId;
import java.util.List;

public class Customer {
    private ObjectId id;
    private String customerId;
    private String name;
    private String email;
    private List<Ticket> ticketsPurchased;

    // Constructor
    public Customer(String customerId, String name, String email, List<Ticket> ticketsPurchased) {
        this.customerId = customerId;
        this.name = name;
        this.email = email;
        this.ticketsPurchased = ticketsPurchased;
    }

    public Customer() {

    }

    // Getters và Setters
    public ObjectId getId() { return id; }
    public String getCustomerId() { return customerId; }
    public String getName() { return name; }
    public String getEmail() { return email; }
    public List<Ticket> getTicketsPurchased() { return ticketsPurchased; }

    public void setCustomerId(String customerId) { this.customerId = customerId; }
    public void setName(String name) { this.name = name; }
    public void setEmail(String email) { this.email = email; }
    public void setTicketsPurchased(List<Ticket> ticketsPurchased) { this.ticketsPurchased = ticketsPurchased; }
}
