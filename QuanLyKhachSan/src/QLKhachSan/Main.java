package QLKhachSan;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CustomerDAO customerDAO = new CustomerDAO();
        RoomDAO roomDAO = new RoomDAO();
        ServiceDAO serviceDAO = new ServiceDAO();
        BillDAO billDAO = new BillDAO();

        try {
            while (true) {
                System.out.println("Hệ thống quản lý khách sạn:");
                System.out.println("1. Thêm khách hàng");
                System.out.println("2. Thêm phòng");
                System.out.println("3. Thêm dịch vụ");
                System.out.println("4. Thêm hóa đơn");
                System.out.println("5. Thoát");
                System.out.print("Chọn một tùy chọn: ");
                int choice = scanner.nextInt();
                scanner.nextLine();  // Đọc ký tự newline sau khi nhập số

                switch (choice) {
                    case 1:
                        // Thêm khách hàng
                        System.out.print("Nhập mã khách hàng: ");
                        String customerId = scanner.nextLine();
                        System.out.print("Nhập tên khách hàng: ");
                        String name = scanner.nextLine();
                        System.out.print("Nhập số điện thoại: ");
                        String phoneNumber = scanner.nextLine();
                        System.out.print("Nhập địa chỉ: ");
                        String address = scanner.nextLine();
                        System.out.print("Nhập số lượng phòng đã thuê: ");
                        int rentedRoomCount = scanner.nextInt();
                        scanner.nextLine();  // Đọc ký tự newline
                        List<String> rentedRooms = new ArrayList<>();
                        for (int i = 0; i < rentedRoomCount; i++) {
                            System.out.print("Nhập mã phòng thứ " + (i + 1) + ": ");
                            rentedRooms.add(scanner.nextLine());
                        }

                        Customer customer = new Customer(customerId, name, phoneNumber, address, rentedRooms);
                        customerDAO.addCustomer(customer);
                        System.out.println("Thêm khách hàng thành công!");
                        break;

                    case 2:
                        // Thêm phòng
                        System.out.print("Nhập mã phòng: ");
                        String roomId = scanner.nextLine();
                        System.out.print("Nhập loại phòng: ");
                        String roomType = scanner.nextLine();
                        System.out.print("Nhập giá phòng: ");
                        double price = scanner.nextDouble();
                        scanner.nextLine();  // Đọc ký tự newline
                        System.out.print("Nhập tình trạng phòng (available/occupied): ");
                        String status = scanner.nextLine();
                        Room room = new Room(roomId, roomType, price, status, new ArrayList<>());
                        roomDAO.addRoom(room);
                        System.out.println("Thêm phòng thành công!");
                        break;

                    case 3:
                        // Thêm dịch vụ
                        System.out.print("Nhập mã dịch vụ: ");
                        String serviceId = scanner.nextLine();
                        System.out.print("Nhập tên dịch vụ: ");
                        String serviceName = scanner.nextLine();
                        System.out.print("Nhập giá dịch vụ: ");
                        double servicePrice = scanner.nextDouble();
                        scanner.nextLine();  // Đọc ký tự newline
                        Service service = new Service(serviceId, serviceName, servicePrice, new ArrayList<>());
                        serviceDAO.addService(service);
                        System.out.println("Thêm dịch vụ thành công!");
                        break;

                    case 4:
                        // Thêm hóa đơn
                        System.out.print("Nhập mã hóa đơn: ");
                        String billId = scanner.nextLine();
                        System.out.print("Nhập mã khách hàng: ");
                        String billCustomerId = scanner.nextLine();
                        System.out.print("Nhập số lượng dịch vụ đã sử dụng: ");
                        int serviceCount = scanner.nextInt();
                        scanner.nextLine();  // Đọc ký tự newline
                        List<String> services = new ArrayList<>();
                        for (int i = 0; i < serviceCount; i++) {
                            System.out.print("Nhập mã dịch vụ thứ " + (i + 1) + ": ");
                            services.add(scanner.nextLine());
                        }
                        System.out.print("Nhập tổng số tiền: ");
                        double totalAmount = scanner.nextDouble();
                        scanner.nextLine();  // Đọc ký tự newline

                        // Nhập ngày thanh toán với định dạng yyyy-MM-dd
                        System.out.print("Nhập ngày thanh toán (yyyy-MM-dd): ");
                        String dateInput = scanner.nextLine();
                        try {
                            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
                            java.util.Date parsedDate = dateFormat.parse(dateInput);
                            java.sql.Date paymentDate = new java.sql.Date(parsedDate.getTime());

                            Bill bill = new Bill(billId, billCustomerId, services, totalAmount, paymentDate);
                            billDAO.addBill(bill);
                            System.out.println("Thêm hóa đơn thành công!");
                        } catch (Exception e) {
                            System.out.println("Định dạng ngày không hợp lệ. Vui lòng nhập lại.");
                        }
                        break;

                    case 5:
                        // Thoát chương trình
                        System.out.println("Thoát chương trình!");
                        scanner.close();
                        return;

                    default:
                        System.out.println("Lựa chọn không hợp lệ. Vui lòng chọn lại.");
                        break;
                }
            }
        } catch (Exception e) {
            System.out.println("Đã xảy ra lỗi: " + e.getMessage());
            e.printStackTrace();
        } finally {
            scanner.close();  // Đảm bảo tài nguyên được đóng
        }
    }
}
