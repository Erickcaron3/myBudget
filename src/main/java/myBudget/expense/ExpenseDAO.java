package myBudget.expense;

import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

@Repository
@Transactional

public class ExpenseDAO {

    @PersistenceContext
    private EntityManager entityManager;

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
