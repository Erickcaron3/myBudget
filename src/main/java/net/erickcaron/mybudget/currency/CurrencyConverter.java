package net.erickcaron.mybudget.currency;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;

public class CurrencyConverter implements Converter<String, Currency> {

    @Autowired
    private CurrencyRepository currencyRepository;

    @Override
    public Currency convert(String source){
        return currencyRepository.findCurrencyByShortcut(source);
    }
}
