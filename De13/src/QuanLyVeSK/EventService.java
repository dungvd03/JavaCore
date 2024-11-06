import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;

import java.util.Date;

public class EventService {
    private MongoCollection<Document> eventCollection;

    public EventService(MongoDatabase database) {
        this.eventCollection = database.getCollection("events");
    }

    // Thêm sự kiện mới vào MongoDB
    public void addEvent(Event event) {
        Document doc = new Document("eventId", event.getEventId())
                .append("eventName", event.getEventName())
                .append("eventDate", event.getEventDate().toString())
                .append("eventLocation", event.getEventLocation());
        eventCollection.insertOne(doc);
    }

    // Lấy thông tin sự kiện từ MongoDB
    public Event getEvent(String eventId) {
        Document doc = eventCollection.find(new Document("eventId", eventId)).first();
        if (doc != null) {
            String eventName = doc.getString("eventName");
            String eventLocation = doc.getString("eventLocation");
            return new Event(eventId, eventName, eventLocation);
        }
        return null;
    }
}
