package myBudget.shoppingList;

import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

@Repository
@Transactional
public class ShoppingListDAO {

    @PersistenceContext
    private EntityManager entityManager;

    public ShoppingList findById(long id) {
        return entityManager.find(ShoppingList.class, id);
    }

    public void update(ShoppingList shoppingList) {
        entityManager.merge(shoppingList);
    }

    public void delete(ShoppingList shoppingList) {
        entityManager.remove(entityManager.contains(shoppingList) ? shoppingList : entityManager.merge(shoppingList));
    }

}
