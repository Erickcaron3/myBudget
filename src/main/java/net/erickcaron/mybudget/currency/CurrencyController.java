package net.erickcaron.mybudget.currency;

import lombok.AllArgsConstructor;
import net.erickcaron.mybudget.expense.ExpenseService;
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
    ExpenseService expenseService;


    @GetMapping("/currency/createForm")
    public String displayCurrencyCreationForm(Model model) {
        model.addAttribute("currency", new Currency());
        return "/in/currencies/create";
    }

    @PostMapping("/currency/createForm")
    public String create(@Valid Currency currency, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return "/in/currencies/create";
        }
        currencyService.addCurrency(currency);

        return "redirect:/currency/showAll";
    }

    @GetMapping("/currency/showAll")
    public String showAll(Model model) {
        List<Currency> allCurrencies = currencyService.showAllCurrencies();
        currencyService.checkDisplayIfCurrencyDeletable(allCurrencies);
        model.addAttribute("allCurrencies", allCurrencies);
        return "/in/currencies/allCurrencies";
    }

    @GetMapping("/currency/update/{id}")
    public String showCurrencyUpdateForm(Model model, @PathVariable Long id) {
        Currency currencyToUpdate = currencyService.getCurrencyById(id);
        model.addAttribute("currencyToUpdate", currencyToUpdate);
        return "/in/currencies/currencyEditionForm";
    }

    @PostMapping("/currency/update/{id}")
    public String update(@ModelAttribute("currencyToUpdate") @Valid Currency currency, BindingResult bindingResult, @RequestParam String validation) {
        if (validation.equals("update")) {
            if (bindingResult.hasErrors()) {
                return "/in/currencies/currencyEditionForm";
            }
            currencyService.updateCurrency(currency);
        }


        return "redirect:/currency/showAll";
    }

    @GetMapping("/currency/delete/{id}")
    public String showCurrencyDeletionForm(Model model, @PathVariable Long id) {
        Currency currencyToDelete = currencyService.getCurrencyById(id);
        Boolean currencyDeletable = currencyService.isCurrencyDeletable(currencyToDelete);
        if (currencyDeletable) {
            model.addAttribute("currencyToDelete", currencyToDelete);
            return "/in/currencies/currencyDeletionForm";
        }
        return "redirect:/currency/showAll";
    }

    @PostMapping("/currency/delete/{id}")
    public String delete(@PathVariable Long id, @RequestParam String validation) {
        if (validation.equals("delete")) {
            Currency currencyToCheck = currencyService.getCurrencyById(id);
            if (currencyService.isCurrencyDeletable(currencyToCheck)) {
                currencyService.deleteCurrencyById(id);
            }
        }
        return "redirect:/currency/showAll";
    }


}

