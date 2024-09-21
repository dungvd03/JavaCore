import org.bson.types.ObjectId;
import java.util.Date;

public class PaymentTransaction {
    private ObjectId id;
    private String transactionId;
    private Customer customer;
    private Ticket ticket;
    private double amountPaid;
    private Date paymentDate;

    // Constructor
    public PaymentTransaction(String transactionId, Customer customer, Ticket ticket, double amountPaid, Date paymentDate) {
        this.transactionId = transactionId;
        this.customer = customer;
        this.ticket = ticket;
        this.amountPaid = amountPaid;
        this.paymentDate = paymentDate;
    }

    // Getters và Setters
    public ObjectId getId() { return id; }
    public String getTransactionId() { return transactionId; }
    public Customer getCustomer() { return customer; }
    public Ticket getTicket() { return ticket; }
    public double getAmountPaid() { return amountPaid; }
    public Date getPaymentDate() { return paymentDate; }

    public void setTransactionId(String transactionId) { this.transactionId = transactionId; }
    public void setCustomer(Customer customer) { this.customer = customer; }
    public void setTicket(Ticket ticket) { this.ticket = ticket; }
    public void setAmountPaid(double amountPaid) { this.amountPaid = amountPaid; }
    public void setPaymentDate(Date paymentDate) { this.paymentDate = paymentDate; }
}
