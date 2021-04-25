package myBudget.shop;

import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

@Repository
@Transactional
public class ShopDAO {

    @PersistenceContext
    private EntityManager entityManager;

    public Shop findById(long id) {
        return entityManager.find(Shop.class, id);
    }

    public void update(Shop shop) {
        entityManager.merge(shop);
    }

    public void delete(Shop shop) {
        entityManager.remove(entityManager.contains(shop) ?
                shop : entityManager.merge(shop));
    }

}
