package myBudget.currency;

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
public class CurrencyController {

    @Autowired
    CurrencyService currencyService;


    @GetMapping("/currency/createForm")
    public String create(Model model){
        model.addAttribute("currency", new Currency());
        return "/in/currencies/create";
    }

    @GetMapping("/currency/showAll")
    public String showAll(Model model) {
        List<Currency> allCurrencies = currencyService.showAllCurrencies();
        model.addAttribute("allCurrencies", allCurrencies);
        return "/in/currencies/allCurrencies";
    }

    @GetMapping("/currency/update/{id}")
    public String showCurrencyUpdateForm(Model model, @PathVariable Long id){
        Currency currencyToUpdate = currencyService.getCurrencyById(id);
        model.addAttribute("currencyToUpdate", currencyToUpdate);
        return "/in/currencies/currencyEditionForm";
    }

    @PostMapping("/currency/update/{id}")
    public String update(@ModelAttribute("currencyToUpdate") @Valid Currency currency, BindingResult bindingResult, @RequestParam String validation){
        if(validation.equals("update")){
            if(bindingResult.hasErrors()){
                return "/in/currencies/currencyEditionForm";
            }
            currencyService.updateCurrency(currency);
        }

       return "redirect:/currency/showAll";
    }

}
