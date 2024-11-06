package QLKhachSan;

import java.util.List;

public class Service {
    private String serviceId;
    private String serviceName;
    private double servicePrice;
    private List<String> usedCustomers; // Danh sách mã khách hàng đã sử dụng dịch vụ

    // Constructor, getters, and setters

    public Service() {
    }

    public Service(String serviceId, String serviceName, double servicePrice, List<String> usedCustomers) {
        this.serviceId = serviceId;
        this.serviceName = serviceName;
        this.servicePrice = servicePrice;
        this.usedCustomers = usedCustomers;
    }

    public String getServiceId() {
        return serviceId;
    }

    public void setServiceId(String serviceId) {
        this.serviceId = serviceId;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public double getServicePrice() {
        return servicePrice;
    }

    public void setServicePrice(double servicePrice) {
        this.servicePrice = servicePrice;
    }

    public List<String> getUsedCustomers() {
        return usedCustomers;
    }

    public void setUsedCustomers(List<String> usedCustomers) {
        this.usedCustomers = usedCustomers;
    }
}
