package QLKhachSan;

import com.mongodb.client.MongoCollection;
import com.mongodb.client.model.Filters;
import org.bson.Document;
import java.util.ArrayList;
import java.util.List;

public class RoomDAO {

    private MongoCollection<Document> roomCollection;

    public RoomDAO() {
        this.roomCollection = DatabaseConnection.getDatabase().getCollection("rooms");
    }

    // Create
    public void addRoom(Room room) {
        Document doc = new Document("roomId", room.getRoomId())
                .append("roomType", room.getRoomType())
                .append("price", room.getPrice())
                .append("status", room.getStatus())
                .append("rentedCustomers", room.getRentedCustomers());
        roomCollection.insertOne(doc);
    }

    // Read
    public Room getRoomById(String roomId) {
        Document doc = roomCollection.find(Filters.eq("roomId", roomId)).first();
        if (doc != null) {
            return new Room(doc.getString("roomId"),
                    doc.getString("roomType"),
                    doc.getDouble("price"),
                    doc.getString("status"),
                    doc.getList("rentedCustomers", String.class));
        }
        return null;
    }

    // Update
    public void updateRoomStatus(String roomId, String newStatus) {
        roomCollection.updateOne(Filters.eq("roomId", roomId),
                new Document("$set", new Document("status", newStatus)));
    }

    // Delete
    public void deleteRoom(String roomId) {
        roomCollection.deleteOne(Filters.eq("roomId", roomId));
    }

    // Get all rooms
    public List<Room> getAllRooms() {
        List<Room> rooms = new ArrayList<>();
        for (Document doc : roomCollection.find()) {
            rooms.add(new Room(doc.getString("roomId"),
                    doc.getString("roomType"),
                    doc.getDouble("price"),
                    doc.getString("status"),
                    doc.getList("rentedCustomers", String.class)));
        }
        return rooms;
    }
}
