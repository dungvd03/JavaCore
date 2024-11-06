package QLKhachSan;

import com.mongodb.client.MongoCollection;
import com.mongodb.client.model.Filters;
import org.bson.Document;

import java.util.ArrayList;
import java.util.List;

public class BillDAO {

    private MongoCollection<Document> billCollection;

    public BillDAO() {
        this.billCollection = DatabaseConnection.getDatabase().getCollection("bills");
    }

    // Create
    public void addBill(Bill bill) {
        Document doc = new Document("billId", bill.getBillId())
                .append("customerId", bill.getCustomerId())
                .append("services", bill.getServices())
                .append("totalAmount", bill.getTotalAmount())
                .append("paymentDate", bill.getPaymentDate());
        billCollection.insertOne(doc);
    }

    // Read
    public Bill getBillById(String billId) {
        Document doc = billCollection.find(Filters.eq("billId", billId)).first();
        if (doc != null) {
            return new Bill(doc.getString("billId"),
                    doc.getString("customerId"),
                    doc.getList("services", String.class),
                    doc.getDouble("totalAmount"),
                    doc.getDate("paymentDate"));
        }
        return null;
    }

    // Update
    public void updateBillTotalAmount(String billId, double newAmount) {
        billCollection.updateOne(Filters.eq("billId", billId),
                new Document("$set", new Document("totalAmount", newAmount)));
    }

    // Delete
    public void deleteBill(String billId) {
        billCollection.deleteOne(Filters.eq("billId", billId));
    }

    // Get all bills
    public List<Bill> getAllBills() {
        List<Bill> bills = new ArrayList<>();
        for (Document doc : billCollection.find()) {
            bills.add(new Bill(doc.getString("billId"),
                    doc.getString("customerId"),
                    doc.getList("services", String.class),
                    doc.getDouble("totalAmount"),
                    doc.getDate("paymentDate")));
        }
        return bills;
    }
}
