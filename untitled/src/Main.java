import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;

import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        MongoDBConnect.connect();  // Kết nối MongoDB
        int choice;
        do {
            showMenu();
            choice = scanner.nextInt();
            scanner.nextLine(); // Đọc bỏ dòng mới
            switch (choice) {
                case 1:
                    addEmployee();
                    break;
                case 2:
                    updateEmployee();
                    break;
                case 3:
                    deleteEmployee();
                    break;
                case 4:
                    listEmployees();
                    break;
                case 5:
                    addPerformanceReview();
                    break;
                case 6:
                    addWorkObjective();
                    break;
                case 7:
                    System.out.println("Thoát chương trình.");
                    MongoDBConnect.close();  // Đóng kết nối MongoDB
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ.");
            }
        } while (choice != 7);
    }

    private static void showMenu() {
        System.out.println("----- MENU QUẢN LÝ NHÂN VIÊN -----");
        System.out.println("1. Thêm nhân viên");
        System.out.println("2. Sửa nhân viên");
        System.out.println("3. Xóa nhân viên");
        System.out.println("4. Liệt kê nhân viên");
        System.out.println("5. Thêm đánh giá hiệu suất");
        System.out.println("6. Thêm mục tiêu công việc");
        System.out.println("7. Thoát");
        System.out.print("Chọn chức năng: ");
    }

    // Thêm nhân viên vào MongoDB
    private static void addEmployee() {
        System.out.print("Nhập mã nhân viên: ");
        String id = scanner.nextLine();
        System.out.print("Nhập tên nhân viên: ");
        String name = scanner.nextLine();
        System.out.print("Nhập vị trí: ");
        String position = scanner.nextLine();
        System.out.print("Nhập ngày gia nhập: ");
        String joinDate = scanner.nextLine();

        Employee employee = new Employee(id, name, position, joinDate);

        // Thêm vào MongoDB
        MongoDatabase database = MongoDBConnect.getDatabase();
        MongoCollection<Document> employeeCollection = database.getCollection("employees");
        Document doc = new Document("id", employee.getId())
                .append("name", employee.getName())
                .append("position", employee.getPosition())
                .append("joinDate", employee.getJoinDate());
        employeeCollection.insertOne(doc);

        System.out.println("Đã thêm nhân viên: " + name);
    }

    // Sửa nhân viên trong MongoDB
    private static void updateEmployee() {
        System.out.print("Nhập mã nhân viên cần sửa: ");
        String id = scanner.nextLine();

        // Lấy thông tin nhân viên từ MongoDB
        MongoDatabase database = MongoDBConnect.getDatabase();
        MongoCollection<Document> employeeCollection = database.getCollection("employees");

        Document query = new Document("id", id);
        Document employee = employeeCollection.find(query).first();

        if (employee == null) {
            System.out.println("Không tìm thấy nhân viên.");
            return;
        }

        System.out.print("Nhập tên mới: ");
        String name = scanner.nextLine();
        System.out.print("Nhập vị trí mới: ");
        String position = scanner.nextLine();

        Document update = new Document("$set", new Document("name", name).append("position", position));
        employeeCollection.updateOne(query, update);

        System.out.println("Thông tin nhân viên đã được cập nhật.");
    }

    // Xóa nhân viên trong MongoDB
    private static void deleteEmployee() {
        System.out.print("Nhập mã nhân viên cần xóa: ");
        String id = scanner.nextLine();

        // Xóa nhân viên từ MongoDB
        MongoDatabase database = MongoDBConnect.getDatabase();
        MongoCollection<Document> employeeCollection = database.getCollection("employees");

        Document query = new Document("id", id);
        employeeCollection.deleteOne(query);

        System.out.println("Nhân viên đã bị xóa.");
    }

    // Liệt kê nhân viên từ MongoDB
    private static void listEmployees() {
        MongoDatabase database = MongoDBConnect.getDatabase();
        MongoCollection<Document> employeeCollection = database.getCollection("employees");

        for (Document doc : employeeCollection.find()) {
            System.out.println("Mã: " + doc.getString("id"));
            System.out.println("Tên: " + doc.getString("name"));
            System.out.println("Vị trí: " + doc.getString("position"));
            System.out.println("Ngày gia nhập: " + doc.getString("joinDate"));
            System.out.println("-----------------------------------");
        }
    }

    // Thêm đánh giá hiệu suất vào MongoDB
    private static void addPerformanceReview() {
        System.out.print("Nhập mã đánh giá: ");
        String reviewId = scanner.nextLine();
        System.out.print("Nhập mã nhân viên: ");
        String employeeId = scanner.nextLine();
        System.out.print("Nhập ngày đánh giá: ");
        String reviewDate = scanner.nextLine();
        System.out.print("Nhập điểm số: ");
        int score = scanner.nextInt();
        scanner.nextLine(); // Đọc bỏ dòng mới
        System.out.print("Nhập nhận xét: ");
        String feedback = scanner.nextLine();

        PerformanceReview review = new PerformanceReview(reviewId, employeeId, reviewDate, score, feedback);

        // Thêm vào MongoDB
        MongoDatabase database = MongoDBConnect.getDatabase();
        MongoCollection<Document> reviewCollection = database.getCollection("performance_reviews");

        Document doc = new Document("reviewId", review.getReviewId())
                .append("employeeId", review.getEmployeeId())
                .append("reviewDate", review.getReviewDate())
                .append("score", review.getScore())
                .append("feedback", review.getFeedback());
        reviewCollection.insertOne(doc);

        System.out.println("Đã thêm đánh giá cho nhân viên: " + employeeId);
    }

    // Thêm mục tiêu công việc vào MongoDB
    private static void addWorkObjective() {
        System.out.print("Nhập mã mục tiêu: ");
        String objectiveId = scanner.nextLine();
        System.out.print("Nhập mô tả mục tiêu: ");
        String description = scanner.nextLine();
        System.out.print("Nhập hạn chót: ");
        String deadline = scanner.nextLine();
        System.out.print("Nhập trạng thái (Hoàn thành/Chưa hoàn thành): ");
        String status = scanner.nextLine();

        WorkObjective objective = new WorkObjective(objectiveId, description, deadline, status);

        // Thêm vào MongoDB
        MongoDatabase database = MongoDBConnect.getDatabase();
        MongoCollection<Document> objectiveCollection = database.getCollection("work_objectives");

        Document doc = new Document("objectiveId", objective.getObjectiveId())
                .append("description", objective.getDescription())
                .append("deadline", objective.getDeadline())
                .append("status", objective.getStatus());
        objectiveCollection.insertOne(doc);

        System.out.println("Đã thêm mục tiêu công việc: " + description);
    }
}