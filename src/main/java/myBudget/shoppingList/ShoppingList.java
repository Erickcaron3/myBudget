package myBudget.shoppingList;

import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

@Entity
@Table(name="shopping-lists")
public class ShoppingList {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private int createdBy;
    private Boolean isActive; //SQL - Bit: 0 false, 1 true;
    private String product;
    private int mesure;
    private String mesureUnity;
    private int quantity;

}
