import org.bson.types.ObjectId;
import java.util.Date;

public class Event {
    private ObjectId id;
    private String eventId;
    private String eventName;
    private Date eventDate;
    private String eventLocation;

    // Constructor
    public Event(String eventId, String eventName, String eventLocation) {
        this.eventId = eventId;
        this.eventName = eventName;

        this.eventLocation = eventLocation;
    }



    // Getters và Setters
    public ObjectId getId() { return id; }
    public String getEventId() { return eventId; }
    public String getEventName() { return eventName; }
    public Date getEventDate() { return eventDate; }
    public String getEventLocation() { return eventLocation; }

    public void setEventId(String eventId) { this.eventId = eventId; }
    public void setEventName(String eventName) { this.eventName = eventName; }
    public void setEventDate(Date eventDate) { this.eventDate = eventDate; }
    public void setEventLocation(String eventLocation) { this.eventLocation = eventLocation; }
}