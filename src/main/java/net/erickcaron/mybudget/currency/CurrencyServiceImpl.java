package net.erickcaron.mybudget.currency;

import net.erickcaron.mybudget.expense.Expense;
import net.erickcaron.mybudget.expense.ExpenseRepository;
import lombok.AllArgsConstructor;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

import java.util.List;

@AllArgsConstructor
@Repository
@Primary

public class CurrencyServiceImpl implements CurrencyService {

    CurrencyRepository currencyRepository;
    ExpenseRepository expenseRepository;

    @Override
    public Currency getCurrencyById(Long id) {
        return currencyRepository.getOne(id);
    }

    @Override
    public void addCurrency(Currency currency) {
        currencyRepository.save(currency);
    }

    @Override
    public void updateCurrency(Currency currency) {
        currencyRepository.save(currency);
    }

    @Override
    public void deleteCurrencyById(Long id) {
        currencyRepository.deleteById(id);
    }

    @Override
    public List<Currency> showAllCurrencies() {
        return currencyRepository.findAll();
    }

    @Override
    public Boolean isCurrencyDeletable(Currency currency) {
        List<Expense> allExpensesByCurrency = expenseRepository.findAllExpensesByCurrency(currency);
        if (allExpensesByCurrency.size() == 0) {
            return true;
        } else {
            return false;
        }

    }

    @Override
    public void checkDisplayIfCurrencyDeletable(List<Currency> currencies) {
        for (Currency c : currencies) {
            if (!isCurrencyDeletable(c)) {
                c.setIsDeletable(false);
            }
        }

    }
}
