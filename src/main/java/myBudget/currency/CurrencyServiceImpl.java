package myBudget.currency;

import lombok.AllArgsConstructor;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

import java.util.List;

@AllArgsConstructor
@Repository
@Primary

public class CurrencyServiceImpl implements CurrencyService{

    CurrencyRepository currencyRepository;

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
}
