import com.mongodb.client.MongoDatabase;

import java.util.Scanner;
import java.util.Date;

public class Main {

    public static void main(String[] args) {
        // Khởi tạo Scanner để lấy đầu vào từ bàn phím
        Scanner scanner = new Scanner(System.in);

        // Kết nối tới MongoDB
        MongoDBConnection connection = new MongoDBConnection("event_management");
        MongoDatabase database = connection.getDatabase();

        // Tạo các service để thao tác với các thực thể
        EventService eventService = new EventService(database);
        TicketService ticketService = new TicketService(database);
        CustomerService customerService = new CustomerService(database); // Thêm CustomerService
        PaymentTransactionService transactionService = new PaymentTransactionService(database);

        int choice;
        do {
            // Hiển thị menu cho người dùng
            System.out.println("===== MENU QUẢN LÝ ĐẶT VÉ SỰ KIỆN =====");
            System.out.println("1. Thêm sự kiện mới");
            System.out.println("2. Thêm vé cho sự kiện");
            System.out.println("3. Thêm khách hàng");
            System.out.println("4. Thêm giao dịch thanh toán");
            System.out.println("5. Thoát");
            System.out.print("Lựa chọn của bạn: ");
            choice = scanner.nextInt();
            scanner.nextLine();  // Đọc bỏ ký tự xuống dòng sau khi nhập số

            switch (choice) {
                case 1:
                    addNewEvent(scanner, eventService);
                    break;
                case 2:
                    addNewTicket(scanner, eventService, ticketService);
                    break;
                case 3:
                    addNewCustomer(scanner, customerService);
                    break;
                case 4:
                    addNewTransaction(scanner, transactionService, customerService, ticketService);
                    break;
                case 5:
                    System.out.println("Thoát chương trình.");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ! Vui lòng thử lại.");
            }
        } while (choice != 5);

        // Đóng kết nối MongoDB và Scanner
        connection.closeConnection();
        scanner.close();
    }

    // Hàm thêm sự kiện mới
    private static void addNewEvent(Scanner scanner, EventService eventService) {
        System.out.println("===== Thêm sự kiện mới =====");
        System.out.print("Nhập mã sự kiện: ");
        String eventId = scanner.nextLine();
        System.out.print("Nhập tên sự kiện: ");
        String eventName = scanner.nextLine();
        System.out.print("Nhập địa điểm tổ chức: ");
        String eventLocation = scanner.nextLine();


        Event event = new Event(eventId, eventName, eventLocation);
        eventService.addEvent(event);
        System.out.println("Sự kiện mới đã được thêm thành công.");
    }

    // Hàm thêm vé cho sự kiện
    private static void addNewTicket(Scanner scanner, EventService eventService, TicketService ticketService) {
        System.out.println("===== Thêm vé mới =====");
        System.out.print("Nhập mã vé: ");
        String ticketId = scanner.nextLine();
        System.out.print("Nhập mã sự kiện liên quan: ");
        String eventId = scanner.nextLine();
        System.out.print("Nhập loại vé (VIP, Standard, etc.): ");
        String ticketType = scanner.nextLine();
        System.out.print("Nhập giá vé: ");
        double ticketPrice = scanner.nextDouble();
        System.out.print("Nhập số lượng vé: ");
        int quantity = scanner.nextInt();
        scanner.nextLine();  // Đọc bỏ ký tự xuống dòng

        // Kiểm tra xem sự kiện có tồn tại không
        Event event = eventService.getEvent(eventId);
        if (event == null) {
            System.out.println("Sự kiện không tồn tại.");
            return;
        }

        Ticket ticket = new Ticket(ticketId, event, ticketType, ticketPrice, quantity);
        ticketService.addTicket(ticket);
        System.out.println("Vé mới đã được thêm thành công.");
    }

    // Hàm thêm khách hàng mới
    private static void addNewCustomer(Scanner scanner, CustomerService customerService) {
        System.out.println("===== Thêm khách hàng mới =====");
        System.out.print("Nhập mã khách hàng: ");
        String customerId = scanner.nextLine();
        System.out.print("Nhập tên khách hàng: ");
        String customerName = scanner.nextLine();
        System.out.print("Nhập email khách hàng: ");
        String customerEmail = scanner.nextLine();

        // Tạo khách hàng mới
        Customer customer = new Customer(customerId, customerName, customerEmail, null);
        customerService.addCustomer(customer);
        System.out.println("Khách hàng mới đã được thêm thành công.");
    }

    // Hàm thêm giao dịch thanh toán mới
    private static void addNewTransaction(Scanner scanner, PaymentTransactionService transactionService,
                                          CustomerService customerService, TicketService ticketService) {
        System.out.println("===== Thêm giao dịch thanh toán =====");
        System.out.print("Nhập mã giao dịch: ");
        String transactionId = scanner.nextLine();
        System.out.print("Nhập mã khách hàng: ");
        String customerId = scanner.nextLine();
        System.out.print("Nhập mã vé: ");
        String ticketId = scanner.nextLine();
        System.out.print("Nhập số tiền đã thanh toán: ");
        double amountPaid = scanner.nextDouble();
        scanner.nextLine();  // Đọc bỏ ký tự xuống dòng

        // Kiểm tra xem khách hàng và vé có tồn tại không
        Customer customer = customerService.getCustomer(customerId);
        if (customer == null) {
            System.out.println("Khách hàng không tồn tại.");
            return;
        }

        Ticket ticket = ticketService.getTicket(ticketId);
        if (ticket == null) {
            System.out.println("Vé không tồn tại.");
            return;
        }

        PaymentTransaction transaction = new PaymentTransaction(transactionId, customer, ticket, amountPaid, new Date());
        transactionService.addTransaction(transaction);
        System.out.println("Giao dịch thanh toán đã được thêm thành công.");
    }
}
