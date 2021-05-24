package net.erickcaron.mybudget.shoppingList;

import lombok.*;
import net.erickcaron.mybudget.product.Product;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

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
    @Column(name="is_active", nullable = false)
    private Boolean isActive = true;
    @OneToMany(mappedBy = "shoppingList")
    private List<Product> products = new ArrayList<>();

}
