import java.util.Date;

public class Session {

    private Date date;
    private double duration;
    private User user;
    private Specialist specialist;

    public Session(Date date, double duration, User user, Specialist specialist) {
        this.date = date;
        this.duration = duration;
        this.user = user;
        this.specialist = specialist;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public double getDuration() {
        return duration;
    }

    public void setDuration(double duration) {
        this.duration = duration;
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

}
