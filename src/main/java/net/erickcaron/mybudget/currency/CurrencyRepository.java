package net.erickcaron.mybudget.currency;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

@Repository
@Transactional

public interface CurrencyRepository extends JpaRepository<Currency, Long> {

    Currency findCurrencyByShortcut(String shortcut);

}
