package net.erickcaron.mybudget.shoppingList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Primary

public class ShoppingListServiceImpl implements ShoppingListService {

    @Autowired
    ShoppingListRepository shoppingListRepository;

    public List<ShoppingList> showAllShoppingLists() {
        return shoppingListRepository.findAll();
    }

    public Boolean checkIfAnyShoppingListIsActive(List<ShoppingList> shoppingListList) {

        if (shoppingListList.size() > 0) {
            for (ShoppingList sl : shoppingListList) {
                if (sl.getIsActive()) {
                    return true;
                }
            }
        }
        return false;

    }
}
