import java.util.Date;

public class Ticket {

    private String title;
    private boolean status;
    private int priority;
    private String description;
    private Date startDate;
    private Date finishDate;
    private double estimatedDuration;
    private User user;
    private Specialist specialist;
    private ProblemCategory problemCategory;

    public Ticket(String title, boolean status, int priority, String description, Date startDate, Date finishDate, double estimatedDuration, User user, Specialist specialist, ProblemCategory problemCategory) {
        this.title = title;
        this.status = status;
        this.priority = priority;
        this.description = description;
        this.startDate = startDate;
        this.finishDate = finishDate;
        this.estimatedDuration = estimatedDuration;
        this.user = user;
        this.specialist = specialist;
        this.problemCategory = problemCategory;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getFinishDate() {
        return finishDate;
    }

    public void setFinishDate(Date finishDate) {
        this.finishDate = finishDate;
    }

    public double getEstimatedDuration() {
        return estimatedDuration;
    }

    public void setEstimatedDuration(double estimatedDuration) {
        this.estimatedDuration = estimatedDuration;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Specialist getSpecialist() {
        return specialist;
    }

    public void setSpecialist(Specialist specialist) {
        this.specialist = specialist;
    }

    public ProblemCategory getProblemCategory() {
        return problemCategory;
    }

    public void setProblemCategory(ProblemCategory problemCategory) {
        this.problemCategory = problemCategory;
    }
}
