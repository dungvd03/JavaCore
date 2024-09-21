public class PerformanceReview {
    private String reviewId;
    private String employeeId;
    private String reviewDate;
    private int score;
    private String feedback;

    public PerformanceReview(String reviewId, String employeeId, String reviewDate, int score, String feedback) {
        this.reviewId = reviewId;
        this.employeeId = employeeId;
        this.reviewDate = reviewDate;
        this.score = score;
        this.feedback = feedback;
    }

    // Getters và setters
    public String getReviewId() {
        return reviewId;
    }

    public void setReviewId(String reviewId) {
        this.reviewId = reviewId;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getReviewDate() {
        return reviewDate;
    }

    public void setReviewDate(String reviewDate) {
        this.reviewDate = reviewDate;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public String getFeedback() {
        return feedback;
    }

    public void setFeedback(String feedback) {
        this.feedback = feedback;
    }
}