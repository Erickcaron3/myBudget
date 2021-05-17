package myBudget.currency;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.Pattern;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

@Entity
@Table(name="Currencies")

public class Currency {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(unique = true)
    @Pattern(regexp = "^[a-zA-Z]+$")
    private String shortcut;
    @Column(unique = true)
    @Pattern(regexp = "^[a-zA-Z]+$")
    private String name;
    @Column(unique = true)
    @Pattern(regexp = "^[a-zA-Z]+$")
    private String country;
}
