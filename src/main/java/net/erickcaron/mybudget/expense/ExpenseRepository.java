package net.erickcaron.mybudget.expense;

import net.erickcaron.mybudget.currency.Currency;
import net.erickcaron.mybudget.shop.Shop;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.math.BigDecimal;
import java.util.List;

@Repository
@Transactional

public interface ExpenseRepository extends JpaRepository<Expense, Long> {

    @Query("SELECT e FROM Expense e WHERE e.shop =?1")
    List<Expense> findAllExpensesByShop(Shop shop);

    @Query("SELECT e from Expense e WHERE e.currency =?1")
    List<Expense> findAllExpensesByCurrency(Currency currency);
}
