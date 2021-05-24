package net.erickcaron.mybudget.shop;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@AllArgsConstructor

@Controller
public class ShopController {
    @Autowired
    ShopService shopService;

    @GetMapping("/shop/showAll")
    public String showAll(Model model) {
        List<Shop> allShops = shopService.showAllShops();
        shopService.checkDisplayIfShopDeletable(allShops);
        model.addAttribute("allShops", allShops);
        return "in/shop/allShops";
    }

    @GetMapping("/shop/createForm")
    public String showShopFormCreation(Model model) {
        model.addAttribute("shop", new Shop());
        return "/in/shop/create";
    }

    @PostMapping("/shop/createForm")
    public String create(@Valid @ModelAttribute Shop shop, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return "/in/shop/create";
        }
        shopService.addShop(shop);
        return "redirect:/shop/showAll";
    }

    @GetMapping("/shop/update/{id}")
    public String showShopEditionForm(Model model, @PathVariable Long id) {
        Shop shopToUpdate = shopService.getShopById(id);
        model.addAttribute("shopToUpdate", shopToUpdate);
        return "/in/shop/shopEditionForm";
    }

    @PostMapping("/shop/update/{id}")
    public String update(@ModelAttribute("shopToUpdate") @Valid Shop shop, BindingResult bindingResult, @RequestParam String validation) {
        if (validation.equals("update")) {
            if (bindingResult.hasErrors()) {
                return "/in/shop/shopEditionForm";
            }
            shopService.updateShop(shop);
        }
        return "redirect:/shop/showAll";
    }

    @GetMapping("/shop/delete/{id}")
    public String showShopDeletionForm(Model model, @PathVariable Long id){
        Shop shopToDelete = shopService.getShopById(id);
        model.addAttribute("shopToDelete", shopToDelete);
        return "/in/shop/shopDeletionForm";
    }

    @PostMapping("/shop/delete/{id}")
    public String delete(@PathVariable Long id, @RequestParam String validation){
        if(validation.equals("delete")){
            Shop shopToCheck = shopService.getShopById(id);
            if(shopService.isShopDeletable(shopToCheck)){
                shopService.deleteShopById(id);
            }
        }

        return "redirect:/shop/showAll";
    }

}
