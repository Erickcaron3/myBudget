package myBudget.expense;

import lombok.*;
import myBudget.shop.Shop;

import javax.persistence.*;
import javax.transaction.Transactional;
import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

@Transactional

@Entity
@Table(name = "expenses")
public class Expense {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "total_amount")
    @DecimalMin(value = "0.0", inclusive = true)
    private BigDecimal totalAmount;


    @Column(name = "personal_amount")
    @DecimalMin(value = "0.0", inclusive = true)
    private BigDecimal personalAmount;

    @Column(name = "shared_amount")
    @DecimalMin(value = "0.0", inclusive = true)
    private BigDecimal sharedAmount;

    @NotBlank
    @Pattern(regexp = "^[a-zA-Z]+$")
    private String currency;

    @NotBlank
    @Pattern(regexp = "^[a-zA-Z]+$")
    private String buyer;

    @NotBlank
    @Pattern(regexp = "^[a-zA-Z]+$")
    private String shop;


}
