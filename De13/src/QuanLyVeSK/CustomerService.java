import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;
import static com.mongodb.client.model.Filters.eq;

public class CustomerService {
    private MongoCollection<Document> customerCollection;

    public CustomerService(MongoDatabase database) {
        this.customerCollection = database.getCollection("customers");
    }

    // Thêm khách hàng mới vào MongoDB
    public void addCustomer(Customer customer) {
        Document doc = new Document("customerId", customer.getCustomerId())
                .append("customerName", customer.getName())
                .append("customerEmail", customer.getEmail());
        customerCollection.insertOne(doc);
    }

    // Lấy khách hàng từ MongoDB dựa trên customerId
    public Customer getCustomer(String customerId) {
        Document doc = customerCollection.find(eq("customerId", customerId)).first();
        if (doc != null) {
            String customerName = doc.getString("customerName");
            String customerEmail = doc.getString("customerEmail");
            return new Customer(customerId, customerName, customerEmail, null); // null là danh sách vé đã mua
        }
        return null;
    }

    // Xóa khách hàng khỏi MongoDB dựa trên customerId
    public void deleteCustomer(String customerId) {
        customerCollection.deleteOne(eq("customerId", customerId));
    }
}
