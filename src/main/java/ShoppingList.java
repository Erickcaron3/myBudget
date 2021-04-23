import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode
public class ShoppingList {

    private int id;
    private int createdBy;
    private Boolean isActive; //SQL - Bit: 0 false, 1 true;
    private String product;
    private int mesure;
    private String mesureUnity;
    private int quantity;

}
