import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;

public class PaymentTransactionService {
    private MongoCollection<Document> transactionCollection;

    public PaymentTransactionService(MongoDatabase database) {
        this.transactionCollection = database.getCollection("transactions");
    }

    // Thêm giao dịch thanh toán vào MongoDB
    public void addTransaction(PaymentTransaction transaction) {
        Document doc = new Document("transactionId", transaction.getTransactionId())
                .append("customerName", transaction.getCustomer().getName())
                .append("ticketId", transaction.getTicket().getTicketId())
                .append("amountPaid", transaction.getAmountPaid())
                .append("paymentDate", transaction.getPaymentDate().toString());
        transactionCollection.insertOne(doc);
    }
}
