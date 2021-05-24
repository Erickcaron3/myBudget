package net.erickcaron.mybudget.expense;

import net.erickcaron.mybudget.shop.Shop;
import lombok.AllArgsConstructor;
import net.erickcaron.mybudget.currency.Currency;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.util.List;

@AllArgsConstructor

@Repository
@Primary

public class ExpenseServiceImpl implements ExpenseService {

    ExpenseRepository expenseRepository;

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
    public List<Expense> findAllExpensesByShop(Shop shop) {
        return expenseRepository.findAllExpensesByShop(shop);
    }

    @Override
    public List<Expense> findAllExpensesByCurrency(Currency currency) {
        return expenseRepository.findAllExpensesByCurrency(currency);
    }

    @Override
    public Boolean checkSharedAmount(Expense expense) {

        BigDecimal totalAmount = expense.getTotalAmount();
        BigDecimal personalAmount = expense.getPersonalAmount();
        BigDecimal sharedAmount = expense.getSharedAmount();

        BigDecimal result = totalAmount.subtract(personalAmount);

        return sharedAmount.equals(result);
    }

    @Override
    public Long getNumberOfExpenses() {
        return expenseRepository.count();
    }

}
