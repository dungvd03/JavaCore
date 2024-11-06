package QLKhachSan;

import java.util.List;

public class Room {
    private String roomId;
    private String roomType;
    private double price;
    private String status; // Tình trạng phòng (ví dụ: "available", "occupied")
    private List<String> rentedCustomers; // Danh sách mã khách hàng đã thuê phòng

    // Constructor, getters, and setters

    public Room() {
    }

    public Room(String roomId, String roomType, double price, String status, List<String> rentedCustomers) {
        this.roomId = roomId;
        this.roomType = roomType;
        this.price = price;
        this.status = status;
        this.rentedCustomers = rentedCustomers;
    }

    public String getRoomId() {
        return roomId;
    }

    public void setRoomId(String roomId) {
        this.roomId = roomId;
    }

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public List<String> getRentedCustomers() {
        return rentedCustomers;
    }

    public void setRentedCustomers(List<String> rentedCustomers) {
        this.rentedCustomers = rentedCustomers;
    }
}
