public class User {

    private String surname;

    public User(String surname, String name, String tel, String email) {
        this.surname = surname;
        this.name = name;
        this.tel = tel;
        this.email = email;
    }

    private String name;
    private String tel;
    private String email;

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

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void requestSession() {
    }

    public void createTicket() {
    }
}
