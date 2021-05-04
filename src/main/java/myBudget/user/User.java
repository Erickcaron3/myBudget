package myBudget.user;

import lombok.*;

import javax.persistence.*;
import java.util.Date;

@Getter @Setter
@NoArgsConstructor @AllArgsConstructor

@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String firstName;
    private String name;
    private String gender;
    @Column(unique = true, nullable = false)
    private String login;
    private Date birthday;
    @Column(unique = true, nullable = false)
    private String email;
    private String password1;
    private String password2; //for security checking only


}
