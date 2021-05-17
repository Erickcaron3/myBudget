package myBudget.expense;

import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ExpenseService {

    Expense getExpenseById(Long id);
    void addExpense(Expense expense);
    void updateExpense(Expense expense);
    void deleteExpenseById(Long id);
    List<Expense> showAllExpenses();
    List<Expense> findAllExpensesByShop(String shop);

}

