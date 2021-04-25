package myBudget.expense;

import lombok.*;

import javax.persistence.*;
import java.math.BigDecimal;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

@Table(name="expenses")
public class Expense {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name="total_amount")
    private BigDecimal totalAmount;
    @Column(name="personal_amount")
    private BigDecimal personalAmount;
    @Column(name="shared_amount")
    private BigDecimal sharedAmount;
    private String currency;
    private String shop;
    private int buyer;

}
