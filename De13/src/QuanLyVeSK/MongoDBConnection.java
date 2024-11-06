import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.MongoCollection;
import org.bson.Document;

public class MongoDBConnection {
    private MongoClient mongoClient;
    private MongoDatabase database;

    public MongoDBConnection(String dbName) {
        mongoClient = MongoClients.create("mongodb://localhost:27017"); // Kết nối MongoDB
        database = mongoClient.getDatabase(dbName); // Chọn database
    }

    public MongoDatabase getDatabase() {
        return database;
    }

    public void closeConnection() {
        mongoClient.close();
    }


}
