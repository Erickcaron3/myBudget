import lombok.*;

import java.util.Date;

@Getter @Setter
@NoArgsConstructor @AllArgsConstructor
@ToString @EqualsAndHashCode
public class User {

    private int id;
    private String firstName;
    private String name;
    private String gender;
    private String login;
    private Date birthday;
    private String email;
    private String password;

}
