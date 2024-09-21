public class WorkObjective {
    private String objectiveId;
    private String description;
    private String deadline;
    private String status;

    public WorkObjective(String objectiveId, String description, String deadline, String status) {
        this.objectiveId = objectiveId;
        this.description = description;
        this.deadline = deadline;
        this.status = status;
    }

    // Getters và setters
    public String getObjectiveId() {
        return objectiveId;
    }

    public void setObjectiveId(String objectiveId) {
        this.objectiveId = objectiveId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDeadline() {
        return deadline;
    }

    public void setDeadline(String deadline) {
        this.deadline = deadline;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}