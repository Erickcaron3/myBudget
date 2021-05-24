package net.erickcaron.mybudget.product;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import net.erickcaron.mybudget.shoppingList.ShoppingList;

import javax.persistence.*;

@Entity
@Table(name="products")

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String product;
    private int quantity;
    private String note;

    @ManyToOne(fetch= FetchType.LAZY)
    private ShoppingList shoppingList;

}
