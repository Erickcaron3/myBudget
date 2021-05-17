package myBudget.shop;

import lombok.*;
import myBudget.expense.Expense;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

@Entity
@Table(name="shops")
public class Shop {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @NotBlank
    @Column(unique = true)
    @Pattern(regexp = "^[a-zA-Z]+$")
    private String name;

    @NotBlank
    @Pattern(regexp = "^[a-zA-Z]+$")
    private String category;


}
