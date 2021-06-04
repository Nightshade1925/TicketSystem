public class Specialist {


    public Specialist(String surname, String name, ProblemCategory problemCategory) {
        this.surname = surname;
        this.name = name;
        this.problemCategory = problemCategory;
    }

    private String surname;
    private String name;
    private ProblemCategory problemCategory;


    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ProblemCategory getProblemCategory() {
        return problemCategory;
    }

    public void setProblemCategory(ProblemCategory problemCategory) {
        this.problemCategory = problemCategory;
    }

    public void acceptSession() {
    }

    public void endTicket() {
    }

}
