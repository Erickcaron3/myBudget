package myBudget.shop;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import javax.transaction.Transactional;

@Repository
@Transactional
public interface ShopRepository extends JpaRepository<Shop, Long> {

}
