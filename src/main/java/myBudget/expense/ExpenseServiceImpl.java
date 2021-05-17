package myBudget.expense;

import lombok.AllArgsConstructor;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

import java.util.List;

@AllArgsConstructor

@Repository
@Primary

public class ExpenseServiceImpl implements ExpenseService{

    ExpenseRepository expenseRepository;

    //todo total = personal + shared  przy add i update et si erreur rzucic exception czy tylko na front?
    @Override
    public Expense getExpenseById(Long id) {
        return expenseRepository.getOne(id);
    }

    @Override
    public void addExpense(Expense expense) {
        expenseRepository.save(expense);
    }

    @Override
    public void updateExpense(Expense expense) {
        expenseRepository.save(expense);
    }

    @Override
    public void deleteExpenseById(Long id) {
        expenseRepository.deleteById(id);
    }

    @Override
    public List<Expense> showAllExpenses() {
        return expenseRepository.findAll();
    }

    @Override
    public List<Expense> findAllExpensesByShop(String shop) {
        return expenseRepository.findAllExpensesByShop(shop);
    }


}
