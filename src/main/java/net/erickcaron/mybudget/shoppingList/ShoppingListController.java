package net.erickcaron.mybudget.shoppingList;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;


@AllArgsConstructor

@Controller
public class ShoppingListController {

    ShoppingListService shoppingListService;

    @GetMapping("/shopping-list/showAll")
    public String showAll(Model model){
        List<ShoppingList> allShoppingLists = shoppingListService.showAllShoppingLists();
        model.addAttribute("allShoppingLists", allShoppingLists);
        return "/in/shopping-list/all-shopping-lists";
    }

    @GetMapping("/shopping-list/create")
    public String create(){
        List<ShoppingList> shoppingLists = shoppingListService.showAllShoppingLists();
        if(shoppingListService.checkIfAnyShoppingListIsActive(shoppingLists)){
        }
        return "redirect:/shopping-list/showAll";
    }


}
