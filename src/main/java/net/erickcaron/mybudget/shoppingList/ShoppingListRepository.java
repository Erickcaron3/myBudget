package net.erickcaron.mybudget.shoppingList;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

@Repository
@Transactional
public interface ShoppingListRepository extends JpaRepository <ShoppingList, Long>{

}
