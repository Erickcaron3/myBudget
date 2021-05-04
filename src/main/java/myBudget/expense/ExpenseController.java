package myBudget.expense;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@Controller
public class ExpenseController {

    @Autowired
    private ExpenseDAO expenseDAO;

    @GetMapping("/expense/createForm")
    public String showExpenseFormCreation(Model model) {
        model.addAttribute("expense", new Expense());
        return "/in/expenses/create";
    }

    @PostMapping("/expense/createForm")
    public String create(@ModelAttribute Expense expense) {
        expenseDAO.create(expense);
        return "redirect:/expense/showAll";
    }

    @GetMapping("/expense/showAll")
    public String showAll(Model model) {
        List<Expense> allExpenses = expenseDAO.findAll();
        model.addAttribute("allExpenses", allExpenses);
        return "/in/expenses/allExpenses";
    }

    @GetMapping("/expense/update/{id}")
    public String showUpdateExpenseForm(Model model, @PathVariable long id) {
        Expense expenseToUpdate = expenseDAO.findByID(id);
        model.addAttribute("expenseToUpdate", expenseToUpdate);
        return "/in/expenses/expenseEditionForm";
    }

    @PostMapping("/expense/update/{id}")
    public String update(@ModelAttribute(name= "expenseToUpdate") @PathVariable long id) {
        Expense expenseToUpdate = expenseDAO.findByID(id);
        expenseDAO.update(expenseToUpdate);
        return "redirect:/expense/showAll";
    }

    @GetMapping("/expense/delete/{id}")
    public String showDeletionExpenseForm(Model model, @PathVariable long id) {
        Expense expenseToDelete = expenseDAO.findByID(id);
        model.addAttribute("expenseToDelete", expenseToDelete);
        return "/in/expenses/expenseDeletionForm";
    }

    @PostMapping("/expense/delete/{id}")
    public String delete(@ModelAttribute(name = "expenseToDelete") @PathVariable long id) {
        expenseDAO.delete(expenseDAO.findByID(id));
        return "redirect:/expense/showAll";
    }

}
