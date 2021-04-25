package myBudget.user;

import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

@Repository
@Transactional
public class UserDAO {

    private EntityManager entityManager;

    @PersistenceContext
    public User findById(long id){
        return entityManager.find(User.class, id);
    }

   public void update(User user){
        entityManager.merge(user);
   }

   public void delete(User user){
        entityManager.remove(entityManager.contains(user) ?
                user : entityManager.merge(user));
   }

}
