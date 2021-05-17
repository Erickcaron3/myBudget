package myBudget.currency;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
@Transactional

public interface CurrencyRepository extends JpaRepository<Currency, Long> {

}
