package net.erickcaron.mybudget.expense;

import net.erickcaron.mybudget.shop.Shop;
import net.erickcaron.mybudget.currency.Currency;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

public interface ExpenseService {

    Expense getExpenseById(Long id);
    void addExpense(Expense expense);
    void updateExpense(Expense expense);
    void deleteExpenseById(Long id);
    List<Expense> showAllExpenses();
    List<Expense> findAllExpensesByShop(Shop shop);
    List<Expense> findAllExpensesByCurrency(Currency currency);
    Boolean checkSharedAmount(Expense expense);
    Long getNumberOfExpenses();

}

