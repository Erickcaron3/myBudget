package net.erickcaron.mybudget.currency;

import net.erickcaron.mybudget.expense.Expense;
import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.Pattern;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

@ToString

@Entity
@Table(name="Currencies")

public class Currency {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(unique = true)
    @Pattern(regexp = "^[a-zA-Z]+$")
    private String shortcut;

    @Pattern(regexp = "^[a-zA-Z]+$")
    private String name;

    @Pattern(regexp = "^[a-zA-Z]+$")
    private String country;

    @Column(name="is_deletable", nullable = false)
    private Boolean isDeletable = true;

    @OneToMany
    List<Expense> expenses = new ArrayList<>();
}
