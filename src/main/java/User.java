import java.util.Date;

public class User {

    private int id;
    private String firstName;
    private String name;
    private String gender;
    private String login;
    private Date birthday;
    private String email;
    private String password;

    public User() {
    }


    public User(int id, String firstName, String name, String gender, String login, Date birthday, String email, String password) {
        this.id = id;
        this.firstName = firstName;
        this.name = name;
        this.gender = gender;
        this.login = login;
        this.birthday = birthday;
        this.email = email;
        this.password = password;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
