package myBudget.expense;

import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;
import java.util.List;

@Repository
@Transactional

public class ExpenseDAO {

    @PersistenceContext
    private EntityManager entityManager;

    public List<Expense> findAll(){
        Query findAllQuery = entityManager.createQuery("SELECT e from Expense e");
        return findAllQuery.getResultList();
    }

    public void create(Expense expense){
        entityManager.persist(expense);
    }

    public Expense findByID(long id){
        return entityManager.find(Expense.class, id);
    }

    public void update(Expense expense){
        entityManager.merge(expense);
    }

    public void delete(Expense expense){
        entityManager.remove(entityManager.contains(expense) ? expense : entityManager.merge(expense));
    }

}
