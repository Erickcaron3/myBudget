package net.erickcaron.mybudget.expense;

import lombok.AllArgsConstructor;
import net.erickcaron.mybudget.currency.Currency;
import net.erickcaron.mybudget.currency.CurrencyService;
import net.erickcaron.mybudget.shop.Shop;
import net.erickcaron.mybudget.shop.ShopService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.math.BigDecimal;
import java.util.List;

@AllArgsConstructor

@Controller
public class ExpenseController {

    ExpenseService expenseService;
    ShopService shopService;
    CurrencyService currencyService;

    @ModelAttribute("shops")
    public List<Shop> shops() {
        return shopService.showAllShops();
    }

    @ModelAttribute("numberOfExpenses")
    public Long numberOfExpenses(){
        return expenseService.getNumberOfExpenses();
    }

    @ModelAttribute("currencies")
    public List<Currency> currencies() {
        return currencyService.showAllCurrencies();
    }

    @GetMapping("/expense/showAll")
    public String showAll(Model model) {
        List<Expense> allExpenses = expenseService.showAllExpenses();
        model.addAttribute("allExpenses", allExpenses);
        return "/in/expenses/allExpenses";
    }


    @GetMapping("/expense/createForm")
    public String showExpenseFormCreation(Model model) {
        model.addAttribute("expense", new Expense());
        return "/in/expenses/create";
    }

    @PostMapping("/expense/createForm")
    public String create(@Valid @ModelAttribute Expense expense, BindingResult bindingResult) {

        if (bindingResult.hasErrors()) {
            return "/in/expenses/create";
        }

        if (expenseService.checkSharedAmount(expense)) {
            expenseService.addExpense(expense);
        } //todo throw exception if checkSharedAmount false?

        return "redirect:/expense/showAll";

    }

    @GetMapping("/expense/update/{id}")
    public String showUpdateExpenseForm(Model model, @PathVariable Long id) {
        Expense expenseToUpdate = expenseService.getExpenseById(id);
        model.addAttribute("expenseToUpdate", expenseToUpdate);
        return "/in/expenses/expenseEditionForm";
    }

    @PostMapping("/expense/update/{id}")
    public String update(@ModelAttribute("expenseToUpdate") @Valid Expense expense, BindingResult bindingResult, @RequestParam String validation) {

        if (validation.equals("update")) {

            if (bindingResult.hasErrors()) {
                return "in/expenses/expenseEditionForm";
            }
            if (expenseService.checkSharedAmount(expense)) {
                expenseService.updateExpense(expense);
            } //todo throw exception if checkSharedAmount false?
        }
        return "redirect:/expense/showAll";
    }

    @GetMapping("/expense/delete/{id}")
    public String showDeletionExpenseForm(Model model, @PathVariable Long id) {
        Expense expenseToDelete = expenseService.getExpenseById(id);
        model.addAttribute("expenseToDelete", expenseToDelete);
        return "/in/expenses/expenseDeletionForm";
    }

    @PostMapping("/expense/delete/{id}")
    public String delete(@PathVariable Long id, @RequestParam String validation) {
        if (validation.equals("delete")) {
            expenseService.deleteExpenseById(id);
        }
        return "redirect:/expense/showAll";
    }


}
