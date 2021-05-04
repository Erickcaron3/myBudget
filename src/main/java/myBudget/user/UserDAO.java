package myBudget.user;

import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;
import java.util.List;

@Repository
@Transactional
public class UserDAO {

    @PersistenceContext
    private EntityManager entityManager;

    public User findById(long id) {
        return entityManager.find(User.class, id);
    }

    public List<User> findAll() {
        Query all = entityManager.createQuery("SELECT u FROM User u");
        return all.getResultList();
    }

    public User findByLogin(String login) {
        Query query = entityManager.createQuery("SELECT u FROM User u WHERE u.login = :login");
        query.setParameter("login", login);
        return (User) query.getSingleResult();
    }

    public void create(User user) {
        entityManager.persist(user);
    }


    public void update(User user) {
        entityManager.merge(user);
    }

    public void delete(User user) {
        entityManager.remove(entityManager.contains(user) ?
                user : entityManager.merge(user));
    }


}
