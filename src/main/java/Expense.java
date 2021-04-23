import lombok.*;

import java.math.BigDecimal;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode

public class Expense {

    private int id;
    private BigDecimal totalAmount;
    private BigDecimal personalAmount;
    private BigDecimal sharedAmount;
    private String currency;
    private String shop;
    private int buyer;



}
