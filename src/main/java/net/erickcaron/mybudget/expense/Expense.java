package net.erickcaron.mybudget.expense;

import lombok.*;
import net.erickcaron.mybudget.currency.Currency;
import net.erickcaron.mybudget.shop.Shop;
import org.springframework.data.annotation.CreatedDate;

import javax.persistence.*;
import javax.transaction.Transactional;
import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import java.math.BigDecimal;
import java.util.Date;

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


    @OneToOne
    private Currency currency;

    @NotBlank
    @Pattern(regexp = "^[a-zA-Z]+$")
    private String buyer;

    @OneToOne
    private Shop shop;


    @Column(name="created_on")
    private Date createdOn;

    @Column(name="updated_on")
    private Date updatedOn;

    @PrePersist
    protected void onCreate(){
        createdOn = new Date();
    }

    @PreUpdate
    protected void onUpdate(){
        updatedOn = new Date();
    }
}
