package myBudget.expense;

import lombok.AllArgsConstructor;
import myBudget.currency.Currency;
import myBudget.currency.CurrencyService;
import myBudget.shop.Shop;
import myBudget.shop.ShopService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
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
        expenseService.addExpense(expense);
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
            expenseService.updateExpense(expense);
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
