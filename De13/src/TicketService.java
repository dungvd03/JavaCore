import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;

public class TicketService {
    private MongoCollection<Document> ticketCollection;
    private MongoDatabase database;

    public TicketService(MongoDatabase database) {
        this.ticketCollection = database.getCollection("tickets");
    }

    // Thêm vé mới vào MongoDB
    public void addTicket(Ticket ticket) {
        Document doc = new Document("ticketId", ticket.getTicketId())
                .append("eventId", ticket.getEvent().getEventId())  // Lưu mã sự kiện, không phải tên sự kiện
                .append("ticketType", ticket.getTicketType())
                .append("ticketPrice", ticket.getTicketPrice())
                .append("quantity", ticket.getQuantity());
        ticketCollection.insertOne(doc);
    }

    // Lấy thông tin vé từ MongoDB
    public Ticket getTicket(String ticketId) {
        Document doc = ticketCollection.find(new Document("ticketId", ticketId)).first();
        if (doc != null) {
            String eventId = doc.getString("eventId");
            String ticketType = doc.getString("ticketType");
            double ticketPrice = doc.getDouble("ticketPrice");
            int quantity = doc.getInteger("quantity");
            // Giả sử sự kiện đã tồn tại trong cơ sở dữ liệu
            Event event = new EventService(database).getEvent(eventId);
            return new Ticket(ticketId, event, ticketType, ticketPrice, quantity);
        }
        return null;
    }
}
