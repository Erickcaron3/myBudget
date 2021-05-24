package net.erickcaron.mybudget.shoppingList;

import java.util.List;

public interface ShoppingListService {


    List<ShoppingList> showAllShoppingLists();
    Boolean checkIfAnyShoppingListIsActive(List<ShoppingList> shoppingListList);
}
