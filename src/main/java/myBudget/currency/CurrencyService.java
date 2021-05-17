package myBudget.currency;

import java.util.List;

public interface CurrencyService {

    Currency getCurrencyById(Long id);
    void addCurrency(Currency currency);
    void updateCurrency(Currency currency);
    void deleteCurrencyById(Long id);
    List<Currency> showAllCurrencies();
}
