package QLKhachSan;

import java.util.Date;
import java.util.List;

public class Bill {
    private String billId;
    private String customerId;
    private List<String> services; // Danh sách mã dịch vụ đã sử dụng
    private double totalAmount;
    private Date paymentDate;

    // Constructor, getters, and setters

    public Bill() {
    }

    public Bill(String billId, String customerId, List<String> services, double totalAmount, Date paymentDate) {
        this.billId = billId;
        this.customerId = customerId;
        this.services = services;
        this.totalAmount = totalAmount;
        this.paymentDate = paymentDate;
    }

    public String getBillId() {
        return billId;
    }

    public void setBillId(String billId) {
        this.billId = billId;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public List<String> getServices() {
        return services;
    }

    public void setServices(List<String> services) {
        this.services = services;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(double totalAmount) {
        this.totalAmount = totalAmount;
    }

    public Date getPaymentDate() {
        return paymentDate;
    }

    public void setPaymentDate(Date paymentDate) {
        this.paymentDate = paymentDate;
    }
}
