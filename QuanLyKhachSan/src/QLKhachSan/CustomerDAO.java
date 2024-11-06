package QLKhachSan;

import com.mongodb.client.MongoCollection;
import org.bson.Document;
import com.mongodb.client.model.Filters;

public class CustomerDAO {

    private MongoCollection<Document> customerCollection;

    public CustomerDAO() {
        this.customerCollection = DatabaseConnection.getDatabase().getCollection("customers");
    }

    // Create
    public void addCustomer(Customer customer) {
        Document doc = new Document("customerId", customer.getCustomerId())
                .append("name", customer.getName())
                .append("phoneNumber", customer.getPhoneNumber())
                .append("address", customer.getAddress())
                .append("rentedRooms", customer.getRentedRooms());
        customerCollection.insertOne(doc);
    }

    // Read
    public Customer getCustomerById(String customerId) {
        Document doc = customerCollection.find(Filters.eq("customerId", customerId)).first();
        if (doc != null) {
            return new Customer(doc.getString("customerId"),
                    doc.getString("name"),
                    doc.getString("phoneNumber"),
                    doc.getString("address"),
                    doc.getList("rentedRooms", String.class));
        }
        return null;
    }

    // Update
    public void updateCustomerPhone(String customerId, String newPhone) {
        customerCollection.updateOne(Filters.eq("customerId", customerId),
                new Document("$set", new Document("phoneNumber", newPhone)));
    }

    // Delete
    public void deleteCustomer(String customerId) {
        customerCollection.deleteOne(Filters.eq("customerId", customerId));
    }
}
