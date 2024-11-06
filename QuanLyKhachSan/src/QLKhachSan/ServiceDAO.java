package QLKhachSan;

import com.mongodb.client.MongoCollection;
import com.mongodb.client.model.Filters;
import org.bson.Document;
import java.util.ArrayList;
import java.util.List;

public class ServiceDAO {

    private MongoCollection<Document> serviceCollection;

    public ServiceDAO() {
        this.serviceCollection = DatabaseConnection.getDatabase().getCollection("services");
    }

    // Create
    public void addService(Service service) {
        Document doc = new Document("serviceId", service.getServiceId())
                .append("serviceName", service.getServiceName())
                .append("servicePrice", service.getServicePrice())
                .append("usedCustomers", service.getUsedCustomers());
        serviceCollection.insertOne(doc);
    }

    // Read
    public Service getServiceById(String serviceId) {
        Document doc = serviceCollection.find(Filters.eq("serviceId", serviceId)).first();
        if (doc != null) {
            return new Service(doc.getString("serviceId"),
                    doc.getString("serviceName"),
                    doc.getDouble("servicePrice"),
                    doc.getList("usedCustomers", String.class));
        }
        return null;
    }

    // Update
    public void updateServicePrice(String serviceId, double newPrice) {
        serviceCollection.updateOne(Filters.eq("serviceId", serviceId),
                new Document("$set", new Document("servicePrice", newPrice)));
    }

    // Delete
    public void deleteService(String serviceId) {
        serviceCollection.deleteOne(Filters.eq("serviceId", serviceId));
    }

    // Get all services
    public List<Service> getAllServices() {
        List<Service> services = new ArrayList<>();
        for (Document doc : serviceCollection.find()) {
            services.add(new Service(doc.getString("serviceId"),
                    doc.getString("serviceName"),
                    doc.getDouble("servicePrice"),
                    doc.getList("usedCustomers", String.class)));
        }
        return services;
    }
}
