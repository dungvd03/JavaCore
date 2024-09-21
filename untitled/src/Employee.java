import java.util.ArrayList;
import java.util.List;

public class Employee {
    private String id;
    private String name;
    private String position;
    private String joinDate;
    private List<PerformanceReview> reviews;

    public Employee(String id, String name, String position, String joinDate) {
        this.id = id;
        this.name = name;
        this.position = position;
        this.joinDate = joinDate;
        this.reviews = new ArrayList<>();
    }

    // Thêm đánh giá vào danh sách
    public void addReview(PerformanceReview review) {
        this.reviews.add(review);
    }

    // Getters và setters
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getJoinDate() {
        return joinDate;
    }

    public void setJoinDate(String joinDate) {
        this.joinDate = joinDate;
    }

    public List<PerformanceReview> getReviews() {
        return reviews;
    }

    public void setReviews(List<PerformanceReview> reviews) {
        this.reviews = reviews;
    }
}