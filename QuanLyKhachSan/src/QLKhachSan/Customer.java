package QLKhachSan;

import java.util.List;

public class Customer {
    private String customerId;
    private String name;
    private String phoneNumber;
    private String address;
    private List<String> rentedRooms; // Danh sách mã phòng đã thuê

    // Constructor, getters, and setters

    public Customer(String customerId, String name, String phoneNumber, String address, List<String> rentedRooms) {
        this.customerId = customerId;
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.rentedRooms = rentedRooms;
    }

    public Customer() {
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public List<String> getRentedRooms() {
        return rentedRooms;
    }

    public void setRentedRooms(List<String> rentedRooms) {
        this.rentedRooms = rentedRooms;
    }
}
